package org.cli.commands;

import org.cli.utils.Directory;
import org.cli.utils.Learners;
import org.cli.utils.copy.TestFile;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Paths;

@CommandLine.Command(name = "remove")
public class Remove implements Runnable {

    @CommandLine.Parameters(index = "0", description = "The java file to remove from \n - src/main/java/org/kata/LEARNER \n - src/test/java/org/kata/LEARNER")
    private String fileName;

    @Override
    public void run() {
        try {
            Learners learners = new Learners();
            Directory kataDirectory = new Directory(Paths.get("src", "main", "java", "org", "kata"));
            Directory testDirectory = new Directory(Paths.get("src", "test", "java", "org", "kata"));
            for (String learner : learners.getLearners()) {
                kataDirectory.removeFileFromSubDirectory(learner, fileName);
                testDirectory.removeFileFromSubDirectory(learner, TestFile.getTestFileName(fileName));
            }
        } catch (IOException e) {
            System.out.println("No file found");
        }
    }
}
