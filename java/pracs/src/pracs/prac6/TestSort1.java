package pracs.prac6;

public class TestSort1 {
    public static void selectionSort (Comparable[] list)  {
        int min;
        Comparable temp;

        for (int index = 0; index < list.length-1; index++)
        {
            min = index;
            for (int scan = index+1; scan < list.length; scan++)
                if (list[scan].compareTo(list[min]) < 0)
                    min = scan;
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }

    public static void main(String[] args) {
        Student[] st = new Student[3];
        st[0]=new Student(2,"Ivanov","Ivanovich","Ivan",20,4.0);
        st[1]=new Student(3,"Ivanov","Petrovich","Petr",19,3.7);
        st[2]=new Student(1,"Petrov","Petrovich","Petr",18,4.8);
        selectionSort(st);
        for(Student s:st)
        {
            System.out.println(s);
        }

    }

}

