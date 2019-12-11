package Lab8;

import java.io.*;

public class FilesApp {

    public static void main(String[] args) {
        String filename="";
        for(String s : args) {
            filename+=s;
        }
        try(FileReader reader = new FileReader(filename))
        {
            int c;
            while((c=reader.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
