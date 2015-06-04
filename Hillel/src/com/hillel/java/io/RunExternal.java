package com.hillel.java.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/**
 * Created by ITyan on 04.06.2015.
 */

/*
   ¿  «¿œ”—“»“‹ ¬Õ≈ÿÕ»… ‘¿»À
 */
public class RunExternal {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ping localhost");

        BufferedReader reader = new BufferedReader(new InputStreamReader
                (process.getInputStream(), Charset.forName("IBM866")));

        String string;
        while ((string = reader.readLine()) != null) {
            System.out.println(string);
        }


        reader.close();
    }
}
