package Lab10;

public class Main {

    public static void main(String[] args) {
	Container<Integer> c1=new Container<Integer>();

	for(int i=0;i<30;i++) c1.add(i);
	c1.print();
	Container<String> c2=new Container<String>();
	String st="";
	for(int i=0;i<20;i++)
	{
		st+="A";
		c2.add(st);
	}
	c2.print();
    }
}
