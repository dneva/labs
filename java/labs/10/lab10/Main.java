package lab10;
public class Main {

    public static void main(String[] args) {
		MyArrayList <Integer> c1=new  MyArrayList <Integer>();

	for(int i=0;i<30;i++) c1.add(i);
	c1.print();
		MyArrayList <String> c2=new  MyArrayList<String>();
	String st="";
	for(int i=0;i<20;i++)
	{
		st+="A";
		c2.add(st);
	}
	c2.print();
	System.out.println(c2.get(6));
	Integer []a ={1,2,3,4,5,6,7};
	c1.<Integer>convert(a);
	c1.print();

    }

}
