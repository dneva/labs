package pracs.prac6;

import java.util.Collection;
import java.util.Comparator;

public class SortingStudentsByGPA {
    public static void main(String[] args) {
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return (s1.getGpa()>s2.getGpa()) ? -1 : ((s1.getGpa()==s2.getGpa()) ? 0 : 1);
            }
        };
        Student[] st = new Student[3];
        st[0]=new Student(1,"Ivanov","Ivanovich","Ivan",20,4.0);
        st[1]=new Student(2,"Ivanov","Petrovich","Petr",19,3.7);
        st[2]=new Student(3,"Petrov","Petrovich","Petr",18,4.8);
        QuickSort.quickSort(st,0,2,comp);
        for(Student s:st)
        {
            System.out.println(s);
        }
    }
}
