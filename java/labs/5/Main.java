package Lab5;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            String filename="";
            for(String s : args) {
                filename+=s;
            }
            System.out.println(filename);
            ImageView image=new ImageView(filename);
            image.setDefaultCloseOperation(image.EXIT_ON_CLOSE);
            image.setVisible(true);

        }
    }
