package ImplsMetodsFils;

import interfaceFile.IOUtils;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class IOUtilsImpls implements IOUtils {
    private List<String> fileList = new ArrayList<>();

    @Override
    public void replaceChars(Reader in, Writer out, String inChars, String outChars) throws NullPointerException, IllegalArgumentException {
        try {
            while (true){
                char ch = (char)in.read();
                int indexOff = inChars.indexOf(ch);
                if(indexOff != -1){
                    ch = outChars.charAt(indexOff);
                }
                out.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] findFiles(String dir) throws NullPointerException, IllegalArgumentException {
        File file = new File(dir);
        if(dir == null)
            throw new NullPointerException("dir == null");
        if(!file.exists())
            throw new IllegalArgumentException("file or directory does not exist");
        if(file.isDirectory()){
            for(File file1: file .listFiles()){
                findFiles(file1.getPath());
            }
        }else
            fileList.add(file.getPath());
        return fileList.toArray(new String[fileList.size()]);
    }
}
