package Lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteAppend {
    public static void main(String[] args) {
        String filename="";
        for(String s : args) {
            filename+=s;
        }
        try(FileWriter writer = new FileWriter(filename,true))
        {
            Scanner sc=new Scanner(System.in);
            writer.write(sc.next());
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
