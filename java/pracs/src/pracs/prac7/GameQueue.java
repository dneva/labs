package pracs.prac7;

import java.util.*;

public class GameQueue {
    public static boolean gameRule(int a, int b)
    {
        if (a==9 && b==0)
            return false;
        if(a>b)
            return true;
        return false;
    }
    public static void main(String[] args) {

        Queue<Integer> q1=new LinkedList<Integer>();
        Queue<Integer> q2=new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Колода певого игрока:");
        for(int i=0;i<5;i++){
            q1.add(sc.nextInt());
        }
        System.out.println("Колода второго игрока:");
        for(int i=0;i<5;i++){
            q2.add(sc.nextInt());
        }
        System.out.println("Колода певого игрока: "+q1);
        System.out.println("Колода второго игрока: "+q2);
        while(!(q1.isEmpty() || q2.isEmpty())&&count!=106){
            if(gameRule(q1.peek(),q2.peek())) {
                q1.add(q1.remove());
                q1.add(q2.remove());
            }
            else {
                q2.add(q2.remove());
                q2.add(q1.remove());
            }
            count++;
            System.out.println("Колода певого игрока: "+q1);
            System.out.println("Колода второго игрока: "+q2);
        }
        if (q1.isEmpty())
            System.out.println("Second "+count);
        else if(q2.isEmpty())
            System.out.println("First "+count);
        else
            System.out.println("Botva");
    }
}
