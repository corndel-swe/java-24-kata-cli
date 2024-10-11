package org.cli.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Directory {

    private final Path basePath;

    public Directory(Path basePath) {
        this.basePath = basePath;
    }

    public void createSubDirectory(String directory) {
        Path newDirectoryPath = Paths.get(basePath.toString(), directory);
        try {
            System.out.println("Creating " + newDirectoryPath);
            Files.createDirectory(newDirectoryPath);
        } catch (IOException e) {
            System.out.printf(" - /%s already exists moving on...\n", directory);
        }
    }

    public void removeFileFromSubDirectory(String directory, String fileName) throws IOException {
        Path fileToRemove = Paths.get(basePath.toString(), directory,fileName);
        System.out.println("Removing " + fileToRemove);
        Files.deleteIfExists(fileToRemove);
    }
}
