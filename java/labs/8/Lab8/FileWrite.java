package Lab8;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {
    public static void main(String[] args) {
        String filename="";
        for(String s : args) {
            filename+=s;
        }
        try(FileWriter writer = new FileWriter(filename))
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
