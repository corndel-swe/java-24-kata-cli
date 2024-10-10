package org.cli;

import picocli.CommandLine;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@CommandLine.Command(name = "move")
public class Move implements Runnable {

    @CommandLine.Parameters(index = "0")
    private String fileName;

    @Override
    public void run() {
        Path learnersPath = Paths.get("src", "main", "resources", "learners.csv");
        Path kata = Paths.get("src", "main", "java", "org", "cli", "katas", fileName);
        Path test = Paths.get("src", "test", "java", "org", "cli", "katas", fileName.split("\\.")[0] + "Test." + fileName.split("\\.")[1]);
        try {
            List<String> learners = Files.readAllLines(learnersPath);
            learners.removeFirst();
            String content = Files.readString(kata);
            String testContent = Files.readString(test);

            for (String learner : learners) {
                Path path = Paths.get("src", "main", "java", "org", "kata", learner, fileName);
                if (path.toFile().exists()) {
                    System.out.println("File exists...");
                    continue;
                }
                content = content.replaceFirst("package org.cli.katas;", "package org.kata." + learner + ";");
                Files.writeString(path, content);
            }

            for (String learner : learners) {
                Path path = Paths.get("src", "test", "java", "org", "kata", learner, fileName.split("\\.")[0] + "Test." + fileName.split("\\.")[1]);
                if (path.toFile().exists()) {
                    System.out.println("File exists...");
                    continue;
                }
                testContent = testContent.replaceFirst("package org.cli.katas;", "package org.kata." + learner + ";");
                Files.writeString(path, testContent);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("No file found");
        }
    }
}
