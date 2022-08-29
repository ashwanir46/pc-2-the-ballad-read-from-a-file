package com.jap.ballad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ballad {
    public static void main(String[] args) {
        Ballad ballad = new Ballad();
        System.out.println(ballad.readPoemFromAFile("src/main/resources/ballad.txt"));
    }

    public String readPoemFromAFile(String fileName) {
        // Write the logic to read from a file
        FileInputStream fileInputStream = null;
        String str = "";
        try {
            fileInputStream = new FileInputStream(fileName);
            int data;
            while ((data = fileInputStream.read()) != -1) {
                char value = (char) data;
                str = str + value;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        str = str.replaceAll("\r", "");
        return str;
    }
}
