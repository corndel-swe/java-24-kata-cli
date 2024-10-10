package org.cli;

import org.cli.utils.Directory;
import org.cli.utils.Learners;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@CommandLine.Command(name = "mkdir")
public class Mkdir implements Runnable {
    @Override
    public void run() {
        try {
            Learners learners = new Learners();
            createDirectories(learners.getLearners());
        } catch (IOException e) {
            System.out.println("No file found");
        }
    }

    private static void createDirectories(List<String> learners) {
        Directory kataDirectory = new Directory(Paths.get("src", "main", "java", "org", "kata"));
        Directory testDirectory = new Directory(Paths.get("src", "test", "java", "org", "kata"));

        for (String learner : learners) {
            kataDirectory.createDirectory(learner);
            testDirectory.createDirectory(learner);
        }
    }
}
