package pracs.prac6;

public class TestSort1 {
    public static void insertionSort (Comparable[] list) {

        for (int index = 1; index < list.length; index++) {
            Comparable key = list[index];
            int position = index;
            while (position > 0 && key.compareTo(list[position-1]) < 0) {
                list[position] = list[position-1];
                position--;
            }
            list[position] = key;
        }

    }

    public static void main(String[] args) {
        Student[] st = new Student[3];
        st[0]=new Student(2,"Ivanov","Ivanovich","Ivan",20,4.0);
        st[1]=new Student(3,"Ivanov","Petrovich","Petr",19,3.7);
        st[2]=new Student(1,"Petrov","Petrovich","Petr",18,4.8);
        insertionSort(st);
        for(Student s:st)
        {
            System.out.println(s);
        }

    }

}

