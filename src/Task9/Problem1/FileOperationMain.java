package Task9.Problem1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperationMain {
    public static void main(String[] args) {
        FileOperation fileOperations=new FileOperation();
        try{
        // fileOperations.createFile();
        //fileOperations.renameFile("Renamed.txt");
           // fileOperations.wordCount();
            fileOperations.copyToBackup();
            fileOperations.deleteOriginalFiles();
        }
        catch (IOException io){
            System.out.println(io.getMessage());
        }
    }
}


