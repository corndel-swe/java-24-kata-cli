package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class CopyFile {

    private final String fileName;
    private final String content;

    public CopyFile(Path basePath, String fileName) throws IOException {
        if (!fileName.split("\\.")[1].equals("java")) {
            throw new IOException(".java file needed");
        }
        this.fileName = fileName;
        this.content = Files.readString(Paths.get(basePath.toString(), fileName));
    }

    public String getFileName() {
        return fileName;
    }

    public String getContent() {
        return content;
    }

    public String getFileContentForLearner(String learner) {
        return getContent().replaceFirst("package org.cli.katas;", "package org.kata." + learner + ";");
    }
}
