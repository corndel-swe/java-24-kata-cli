package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Path;

public class CopyTestFile extends CopyFile {

    public static String getTestFileName(String fileName) {
        return fileName.split("\\.")[0] + "Test." + fileName.split("\\.")[1];
    }

    public CopyTestFile(Path basePath, String fileName) throws IOException {
        super(basePath, getTestFileName(fileName));
    }

}
