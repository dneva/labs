package pracs.prac7;

import java.util.Scanner;
import java.util.Stack;

public class GameStack {
    public static void main(String[] args) {
        Stack<Integer> st1=new Stack<Integer>();
        Stack<Integer> st2=new Stack<Integer>();
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Колода певого игрока:");
        for(int i=0;i<5;i++){
            st1.push(sc.nextInt());
        }
        System.out.println("Колода второго игрока:");
        for(int i=0;i<5;i++){
            st2.push(sc.nextInt());
        }
        System.out.println("Колода певого игрока: "+st1);
        System.out.println("Колода второго игрока: "+st2);
        while(!(st1.empty() || st2.empty())&&count!=106){
            Stack<Integer> buff=new Stack<Integer>();
            if(st1.peek()>st2.peek() && (st1.peek()!=9 && st2.peek()!=0)) {
                st2.push(st1.pop());
                while (!st1.empty())
                {
                    buff.push(st1.pop());
                }
                buff.push(st2.pop());
                st1.push(st2.pop());
                while (!buff.empty())
                {
                    st1.push(buff.pop());
                }
            }
            else {
                st1.push(st2.pop());
                while (!st2.empty())
                {
                    buff.push(st2.pop());
                }
                buff.push(st1.pop());
                st2.push(st1.pop());
                while (!buff.empty())
                {
                    st2.push(buff.pop());
                }
            }
            count++;
            System.out.println("Колода певого игрока: "+st1);
            System.out.println("Колода второго игрока: "+st2);
        }
        if (st1.empty())
            System.out.println("Second "+count);
        else if(st2.empty())
            System.out.println("First "+count);
        else
            System.out.println("Botva");
    }
}
