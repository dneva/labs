package pracs.prac8;

public class TestWaitList {
    public static void main(String[] args) {
        BoundedWaitList<Integer> bwl = new BoundedWaitList<Integer>(10);
        UnfairWaitList<String> uwl=new UnfairWaitList<String>();
        for(int i=0;i<10;i++) bwl.add(i);
        try {
            bwl.add(11);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(bwl.toString());
        String st="";
        for(int i=0;i<20;i++)
        {
            st+="A";
            uwl.add(st);
        }
        uwl.remove("A");
        uwl.moveToBack("AAA");
        System.out.println(uwl.toString());
    }
}
