package Task8.Problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void readFile(){
        Scanner sc=null;
        try{
            File obj=new File("C:\\Users\\Padmashree P R\\Desktop\\file.txt");
             sc=new Scanner(obj);
             while(sc.hasNextLine()){
                 System.out.println(sc.nextLine());
             }
        }
        catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
        finally {
            if(sc!=null){
                sc.close();
            }
        }
    }
    public static void main(String[] args) {
        readFile();

    }
}
