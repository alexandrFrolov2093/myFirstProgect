package fileCopyUtilsImpls;


import interfaceFile.FileAlreadyExistsException;
import interfaceFile.FileCopyFailedException;
import interfaceFile.FileCopyUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopyUtilsImpl4 implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException {
        try {
            Files.copy(Paths.get(source), Paths.get(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
