package org.cli.utils;

import org.cli.utils.copy.CopyFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {
    private final Path path;
    private final String learner;

    public WriteFile(Path basePath, String learner, String fileName) {
        this.path = Paths.get(basePath.toString(), learner, fileName);
        this.learner = learner;
    }

    public boolean exists() {
        return path.toFile().exists();
    }

    public void writeFile(CopyFile copyFile) throws IOException {
        String content = copyFile.getFileContentForLearner(learner);
        Files.writeString(path, content);
    }
}
