package Lab3;

public abstract class Dog {
    private String name;
    private int age;
    public Dog(String n, int a)
    {
        name=n;
        age=a;
    }
    public void getInfo()
    {
        System.out.println("Кличка: "+name);
        System.out.println("Возраст: " + age);
    }
    public abstract String Barking();
}
