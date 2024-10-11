package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Path;

public class TestFile extends CopyFile {

    public static String getTestFileName(String fileName) {
        return fileName.split("\\.")[0] + "Test." + fileName.split("\\.")[1];
    }

    public TestFile(Path basePath, String fileName) throws IOException {
        super(basePath, getTestFileName(fileName));
    }

}
