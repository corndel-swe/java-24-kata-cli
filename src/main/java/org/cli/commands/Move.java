package org.cli.commands;

import org.cli.utils.copy.CopyFile;
import org.cli.utils.Learners;
import org.cli.utils.WriteFile;
import org.cli.utils.copy.KataFile;
import org.cli.utils.copy.TestFile;
import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Paths;

@CommandLine.Command(name = "move")
public class Move implements Runnable {

    @CommandLine.Parameters(index = "0", description = "The java file inside src/main/java/org/cli/katas to move across to \n - src/main/java/org/kata/LEARNER \n - src/test/java/org/kata/LEARNER")
    private String fileName;

    @Override
    public void run() {
        Learners learners;
        CopyFile kata;
        CopyFile test;

        try {
            learners = new Learners();
            kata = new KataFile(Paths.get("src", "main", "java", "org", "cli", "katas"), fileName);
            test = new TestFile(Paths.get("src", "test", "java", "org", "cli", "katas"), fileName);
        } catch (IOException e) {
            System.out.println("ERROR : " + e.getMessage());
            throw new RuntimeException(e);
        }

        try {

            for (String learner : learners.getLearners()) {
                WriteFile toWrite = new WriteFile(Paths.get("src", "main", "java", "org", "kata"), learner, kata.getFileName());
                if (toWrite.exists()) {
                    System.out.println("File exists...");
                    continue;
                }
                System.out.println("Creating " + learner + "/" + kata.getFileName());
                toWrite.writeFile(kata);
            }

            for (String learner : learners.getLearners()) {
                WriteFile toWrite = new WriteFile(Paths.get("src", "test", "java", "org", "kata"), learner, test.getFileName());
                if (toWrite.exists()) {
                    System.out.println("File exists...");
                    continue;
                }
                System.out.println("Creating " + learner + "/" + test.getFileName());
                toWrite.writeFile(test);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("No file found");
        }
    }

}
