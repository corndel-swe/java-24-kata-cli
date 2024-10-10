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
        List<String> learnersCSV = Files.readAllLines(learnersPath);
        if (learnersCSV.getFirst().equalsIgnoreCase("learner")) {
            learnersCSV.removeFirst();
        }
        learners = learnersCSV.stream().map(l -> l.toLowerCase().replaceAll(" ", "_")).toList();
    }

    public List<String> getLearners() {
        return learners;
    }
}
