package pracs.prac6;

public class Student implements Comparable <Student>{
    private int id;
    private String surname;
    private String midname;
    private String name;
    private int age;
    private double gpa;
    public Student(int id, String surname, String midname, String name, int age, double gpa)
    {
        this.id=id;
        this.surname=surname;
        this.midname=midname;
        this.name=name;
        this.age=age;
        this.gpa=gpa;
    }
    public Student()
    {
        this.id=0;
        this.surname="";
        this.midname="";
        this.name="";
        this.age=0;
        this.gpa=0;
    }

    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getMidname() {
        return midname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMidname(String midname) {
        this.midname = midname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "id: "+id+" Surname: "+surname+" Midname: "+midname+" Name: "+name+" Age: "+age+" GPA: "+gpa;
    }

    @Override
    public int compareTo(Student st) {
        int r=this.id-st.id;
        return r;
    }
}
