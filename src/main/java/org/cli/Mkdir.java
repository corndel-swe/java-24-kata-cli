package org.cli;

import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@CommandLine.Command(name = "mkdir")
public class Mkdir implements Runnable {
    @Override
    public void run() {
        Path learnersPath = Paths.get("src", "main", "resources", "learners.csv");
        try {
            List<String> learners = Files.readAllLines(learnersPath);
            learners.removeFirst();
            createDirectories(learners);
        } catch (IOException e) {
            System.out.println("No file found");
        }

    }

    private static void createDirectories(List<String> learners) {
        for (String learner : learners) {
            Path kataDirPath = Paths.get("src", "main", "java", "org", "kata", learner);
            Path testDirPath = Paths.get("src", "test", "java", "org", "kata", learner);

            try {
                System.out.println("Creating " + kataDirPath);
                Files.createDirectory(kataDirPath);
            } catch (IOException e) {
                System.out.printf(" - /%s already exists moving on...\n", learner);
            }

            try {
                System.out.println("Creating " + testDirPath);
                Files.createDirectory(testDirPath);
            } catch (IOException e) {
                System.out.printf(" - /%s already exists moving on...\n", learner);
            }
        }
    }
}
