package Task9.Problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationMain {
    public static void main(String[] args) {
        FileOperation fileOperation=new FileOperation();
        try {
          fileOperation.createNewFile();
          fileOperation.renameFile("File.txt");
            fileOperation.wordCount();
           // fileOperation.c();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //fileOperation.writeFile("hello");

    }
}
