package Task9.Problem1;

import java.io.*;
import java.util.Scanner;

public class FileOperation {
    File myFile = new File("javaOperations.txt");
    File newFile;
    File wordCountFile = new File("wordCount.txt");
    File file4=new File("backup.txt");

    public void fileWrite(String content) throws IOException {
        FileWriter fileWriter = new FileWriter(myFile);
        fileWriter.write(content);
        fileWriter.close();
    }

    public void createFile() throws IOException {
        if (myFile.createNewFile()) {
            fileWrite("hiiiii");
            System.out.println("File created and content added");
        } else {
            fileWrite("hello");
            System.out.println("File already exits with hello");
        }
    }

    public void renameFile(String fileName) throws IOException {
        newFile = new File(fileName);
        if (newFile.exists()) {
            throw new IOException("Rename file already exits");
        }
        boolean
                success = myFile.renameTo(newFile);
        if (success) {
            System.out.println("Sucessfully renamed the existing file with" + newFile.getName());
        } else {
            System.out.println("File rename Failed");
        }
    }

    public void wordCount() throws IOException {
//        if(newFile==null){
//            throw new IOException("Rename file does not exits");
//        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader("Renamed.txt"));
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine()) != null) {
            String[] arr = line.split(" ");
            count += arr.length;
        }
        bufferedReader.close();
        System.out.println("words Count " + count);
        if (wordCountFile.createNewFile()) {
            FileWriter fileWriter = new FileWriter(wordCountFile);
            fileWriter.write("Word count: " + count);
            fileWriter.close();
        }

    }
    public void copyToBackup() throws IOException{
        boolean sucess= file4.createNewFile();
        if(sucess){
            String str;
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file4));
            BufferedReader input1=new BufferedReader(new FileReader("Renamed.txt"));
            while ((str = input1.readLine()) != null) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            BufferedReader input2 = new BufferedReader(new FileReader("wordcount.txt"));
            while ((str = input2.readLine()) != null) {
                bufferedWriter.write(str);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        }
    }

    public void deleteOriginalFiles() {
        if (myFile.delete()) {
            System.out.println("Original file 'javaOperations.txt' deleted.");
        }
        else
        {
            System.out.println("Failed to delete 'javaOperations.txt'.");
        }

        if(wordCountFile.delete()){
            System.out.println("Word count file 'wordCount.txt' deleted.");
        }
        else
        {
            System.out.println("Failed to delete 'wordCount.txt'.");
        }
    }
        }





