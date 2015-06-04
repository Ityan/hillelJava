package com.hillel.java.io;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Created by ITyan on 04.06.2015.
 */
public class DirectoryReader {

    public static void main(String[] args) throws IOException {
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showDialog(null, "Open");

        if (result == JFileChooser.APPROVE_OPTION){
            Path directory = fileChooser.getSelectedFile().toPath();

            DirectoryStream<Path> stream = Files.newDirectoryStream(directory);

            for (Path file : stream) {
                System.out.println(file.getFileName());
            }

            stream.close();
        }
    }

}
