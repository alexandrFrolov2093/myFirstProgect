package ImplsMetodsFils;

import interfaceFile.FileAlreadyExistsException;
import interfaceFile.FileCopyFailedException;
import interfaceFile.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileCopyWithJava7CopyUtils implements FileCopyUtils {
    @Override
    public void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, IOException {
        File destinationFile = new File(destination);
        if (destinationFile.exists()) throw new FileAlreadyExistsException("File Already Exists");
        Path sour = Paths.get(source);
        Path dest = Paths.get(destination);
        try {
            Files.copy(sour, dest);
        } catch (IOException e) {
            e.printStackTrace();
            throw new FileCopyFailedException(e.getMessage());
        }
    }
}
