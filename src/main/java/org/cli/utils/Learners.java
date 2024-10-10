package org.cli.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Learners {

    private final List<String> learners;

    public Learners() throws IOException {
        this("learners.csv");
    }

    public Learners(String fileName) throws IOException {
        Path learnersPath = Paths.get("src", "main", "resources", fileName);
        learners = Files.readAllLines(learnersPath);
        if (learners.getFirst().equalsIgnoreCase("learner")) {
            learners.removeFirst();
        }
    }

    public List<String> getLearners() {
        return learners;
    }
}
