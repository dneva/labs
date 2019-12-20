package pracs.prac7;

import java.util.*;

public class GameDequeue {
    public static boolean gameRule(int a, int b)
    {
        if (a==9 && b==0)
            return false;
        if(a>b)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Deque<Integer> dq1=new ArrayDeque<Integer>();
        Deque<Integer> dq2=new ArrayDeque<Integer>();
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Колода певого игрока:");
        for(int i=0;i<5;i++){
            dq1.add(sc.nextInt());
        }
        System.out.println("Колода второго игрока:");
        for(int i=0;i<5;i++){
            dq2.add(sc.nextInt());
        }
        System.out.println("Колода певого игрока: "+dq1);
        System.out.println("Колода второго игрока: "+dq2);
        while(!(dq1.isEmpty() || dq2.isEmpty())&&count!=106){
            if(gameRule(dq1.peek(),dq2.peek())) {
                dq1.add(dq1.remove());
                dq1.add(dq2.remove());
            }
            else {
                dq2.add(dq2.remove());
                dq2.add(dq1.remove());
            }
            count++;
            System.out.println("Колода певого игрока: "+dq1);
            System.out.println("Колода второго игрока: "+dq2);
        }
        if (dq1.isEmpty())
            System.out.println("Second "+count);
        else if(dq2.isEmpty())
            System.out.println("First "+count);
        else
            System.out.println("Botva");
    }

}
