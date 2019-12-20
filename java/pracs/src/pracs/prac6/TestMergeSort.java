package pracs.prac6;

public class TestMergeSort {
    public static void main(String[] args) {
        Student[] st1 = new Student[3];
        st1[0]=new Student(2,"Ivanov","Ivanovich","Ivan",20,4.0);
        st1[1]=new Student(3,"Ivanov","Petrovich","Petr",19,3.7);
        st1[2]=new Student(1,"Petrov","Petrovich","Petr",18,4.8);

        Student[] st2= new Student[3];
        st2[0]=new Student(4,"Romanov","Ivanovich","Ivan",18,4.4);
        st2[1]=new Student(6,"Smirnov","Petrovich","Petr",21,5.0);
        st2[2]=new Student(5,"Kruglov","Petrovich","Petr",18,4.5);

        Student[] st3 = MergeSort.merge(st1,st2);
        st3 = MergeSort.sort(st3);
        for(Student s:st3)
        {
            System.out.println(s);
        }

    }
}
