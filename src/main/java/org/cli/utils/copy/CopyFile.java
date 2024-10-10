package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class CopyFile {

    private Path basePath;
    private String fileName;
    private String content;

    public CopyFile(Path basePath, String fileName) throws IOException {
        this.basePath = basePath;
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
