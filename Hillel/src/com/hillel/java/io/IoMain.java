package com.hillel.java.io;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * @author ITyan on 01.06.2015.
 */
public class IoMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("hillel/data.txt"));
        long[] array = {12L, 13L, 31486843134L};

        objectOutputStream.writeObject(array);
        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("hillel/data.txt"));

        array = (long[]) objectInputStream.readObject();

        System.out.println(Arrays.toString(array));
    }

    private static void primitives() throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("hillel/data.txt"));
        long[] array = {12L, 13L, 31486843134L};

        for (long l : array) {
            dataOutputStream.writeLong(l);
        }
        dataOutputStream.close();


        DataInputStream dataInputStream = new DataInputStream(new FileInputStream("hillel/data.txt"));

        while (true) {
            try {
                long l = dataInputStream.readLong();
                System.out.println(l);
            } catch (EOFException e) {
                break;
            }
        }
        dataInputStream.close();
    }

    private static void bufferedVsUnbuffered() throws IOException {
        Instant begin = Instant.now();
        bufferedCopy();
        Instant end = Instant.now();

        System.out.println("Buffered copy: " + Duration.between(begin, end).toMillis());

        begin = Instant.now();
        byteCopy();
        end = Instant.now();

        System.out.println("Unbuffered copy: " + Duration.between(begin, end).toMillis());
    }

    private static void bufferedCopy() throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader("hillel/myFile.txt"));
        BufferedWriter outputStream = new BufferedWriter(new FileWriter("hillel/copy_myFile.txt"));

        String value;
        while ((value = inputStream.readLine()) != null) {
            outputStream.write(value);
        }
        inputStream.close();
        outputStream.close();
    }

    private static void streamReader() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("hillel/myFile.txt"));

        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("hillel/copy_myFile.txt"));

        int value;
        while ((value = inputStreamReader.read()) != -1) {
            outputStreamWriter.write(value);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }

    private static void swingFileChooser() {
        JFileChooser fileChooser = new JFileChooser();
        int res = fileChooser.showOpenDialog(null);
        System.out.println(res);

        if (res == 0) {
            File file = fileChooser.getSelectedFile();
            Path path = file.toPath();
        }
    }

    private static void byteCopy() {
        try (InputStream inputStream = new FileInputStream("hillel/myFile.txt");     //try с ресурсами
             OutputStream outputStream = new FileOutputStream("hillel/copy_myFile.txt")) {

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static void uglyPriorJava7Way() {
        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {

            inputStream = new FileInputStream("hillel/myFile.txt");

            outputStream = new FileOutputStream("hillel/copy_myFile.txt");

            int value;
            while ((value = inputStream.read()) != -1) {
                outputStream.write(value);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }

            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println(e);
                }
            }
        }
    }

    private static void fileCreation() throws IOException {
        Path path = Paths.get("hillel/myFile.txt"); //относительный путь
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        Path absolutePath = Paths.get("/hillel/myFile.txt"); //абсолютный путь
        System.out.println(path);
        System.out.println(path.toAbsolutePath());

        System.out.println(path.toString() + " exist: " + Files.exists(path));

        Files.createFile(path);
    }

    private static void differentPathes() {
        System.out.println("yes\\no");
        String path1 = "c:\\program files\\my program";
        String path2 = "c:/program files/my program";
        String path3 = "c:\\program files/my program";
    }

}
