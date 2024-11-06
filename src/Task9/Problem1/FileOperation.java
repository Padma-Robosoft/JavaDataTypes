package Task9.Problem1;

import java.io.*;
import java.util.Scanner;

public class FileOperation {

    File myfile = new File("javafileOperation.txt ");
    File newFile;
    File wordCountFile = new File("wordcount.txt");



    public void writeFile(String str) throws IOException {
        FileWriter fileWriter=new FileWriter(myfile);
        fileWriter.write(str);
        fileWriter.close();
    }
    public void createNewFile() throws IOException{
        if(myfile.createNewFile()){
            writeFile("Hi");
        }
        else{
            writeFile("Hello");
            System.out.println("File already exits");
        }
    }

    public void renameFile(String file) throws IOException{
      newFile=new File(file);

      if(newFile.exists())
          throw new IOException("Rename File already Exists");
      boolean success = myfile.renameTo(newFile);
      //  System.out.println(newFile);

      if(success)
          System.out.println("File is renamed");
    }

    public void wordCount() throws IOException {
  //      System.out.println(newFile);
        FileReader fileReader=new FileReader("File.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String line= bufferedReader.readLine();
        int count=0;
        while (line!=null){
            String[] parts=line.split(" ");
            for(String w:parts){
                count++;
            }
            line=bufferedReader.readLine();
        }
        System.out.println(count);

        wordCountFile.createNewFile();
        FileWriter fileWriter=new FileWriter(wordCountFile);
        fileWriter.write(Integer.toString(count));
        fileWriter.close();

    }


}



