package com.example.task05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.*;

import java.io.*;

public class Task05Main {
    public static void main(String[] args) {
        String pathToFile = args[0]; // "/home/user/file.txt"

        try {
            String s = readFile(pathToFile);
            System.out.println(s);
        } catch (FileNotFoundException e) {
            // Используем двойные кавычки вместо одинарных
            System.out.println("файл \"" + pathToFile + "\" не найден");
        } catch (IOException e) {
            // Используем двойные кавычки вместо одинарных
            System.out.println("произошла ошибка при чтении файла \"" + pathToFile + "\"");
        }
    }

    public static String readFile(String pathToFile) throws IOException {
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(pathToFile);
            bufferedReader = new BufferedReader(fileReader);

            StringBuilder stringBuilder = new StringBuilder();
            String currentLine;
            while ((currentLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(currentLine);
                stringBuilder.append("\n");
            }
            return stringBuilder.toString();

        } catch (FileNotFoundException e) {
            throw e; // Пробрасываем исключение дальше
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    System.out.println("Error closing reader: " + e.getMessage());
                }
            }
        }
    }
}