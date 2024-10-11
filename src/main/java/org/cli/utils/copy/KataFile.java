package org.cli.utils.copy;

import java.io.IOException;
import java.nio.file.Path;


public class KataFile extends CopyFile {

    public KataFile(Path basePath, String fileName) throws IOException {
        super(basePath, fileName);
    }

}
