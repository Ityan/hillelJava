package com.hillel.java.database;

import org.apache.commons.io.IOUtils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ITyan on 02.07.2015.
 */
public class DbNavigationForm extends JFrame {
    private final Dao productDb = new ProductDbDao();
    private JTextField nameField;
    private JTextField categoryField;
    private JTextField priceField;
    private JButton nextButton;
    private JPanel panel;
    private JButton previousButton;
    private JButton saveButton;
    private JButton createButton;
    private JButton deleteButton;
    private JButton imageButton;
    private JLabel imageLabel;
    private byte[] imageBytes;

    public DbNavigationForm() {


        Product product = (Product) productDb.getNext();
        draw(product);

        initNextBtn();
        initPrevBtn();
        initClose();
        initSaveBtn();
        initCreateBtn();
        initDeleteBtn();
        initImageBtn();

        setContentPane(panel);
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void initImageBtn() {
        imageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                if (fileChooser.showDialog(null, "ok") == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        imageBytes = IOUtils.toByteArray(new FileInputStream(file));
                        drawImage(imageBytes);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, e1.getMessage(), "unable to load image", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });
    }

    private void drawImage(byte[] imageBytes) {
        if (imageBytes != null) {
            try {
                BufferedImage image = ImageIO.read(new ByteArrayInputStream(imageBytes));
                imageLabel.setIcon(new ImageIcon(image));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "unable to draw image", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            imageLabel.setIcon(null);
        }
    }

    private void initDeleteBtn() {
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productDb.deleteCurrent();
                Product product = (Product) productDb.getNext();
                if (product == null) {
                    product = (Product) productDb.getPrevious();
                }
                draw(product);
            }
        });
    }

    private void initCreateBtn() {
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product = readFromFields();
                productDb.insert(product);
            }
        });
    }

    private Product readFromFields() {
        String name = nameField.getText();
        String category = categoryField.getText();
        int price = Integer.parseInt(priceField.getText());
        byte[] image = imageBytes;

        return new Product(name, category, price, image);
    }

    private void initSaveBtn() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productDb.updateCurrent(readFromFields());
            }
        });
    }

    private void initPrevBtn() {
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product = (Product) productDb.getPrevious();
                draw(product);
            }
        });
    }

    private void initClose() {
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                productDb.close();
            }
        });
    }

    private void initNextBtn() {
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Product product = (Product) productDb.getNext();
                draw(product);
            }
        });
    }

    private void draw(Product product) {
        if (product != null) {
            nameField.setText(product.getName());
            categoryField.setText(product.getCategory());
            priceField.setText(Integer.toString(product.getPrice()));
            imageBytes = product.getImage();
            drawImage(product.getImage());
        } else {
            nameField.setText(null);
            categoryField.setText(null);
            priceField.setText(null);

            drawImage(null);
        }
    }

    public static void main(String[] args) {
        DbNavigationForm form = new DbNavigationForm();

    }

}
