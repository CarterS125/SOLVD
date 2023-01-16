package com.solvd.building.WordCount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public static String readFileToString(String filePath) {
        try {
            byte[] encoded = Files.readAllBytes(Paths.get("/Users/carterstackhouse/Downloads/dev/wordcount file.txt"));
            return new String(encoded);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}


