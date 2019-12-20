package pracs.prac6;

public class MergeSort {
    public static Student[] merge(Student a[],Student[] b)
    {
        Student[] res = new Student[a.length+b.length];
        int pa=0, pb=0;
        for(int i=0; i<res.length;i++)
        {
            if(pa==a.length) {
                res[i]=b[pb];
                pb++;
            } else if(pb==b.length) {
                res[i]=a[pa];
                pa++;
            } else if(a[pa].compareTo(b[pb])<0){
                res[i]=a[pa];
                pa++;
            } else{
                res[i]=b[pb];
                pb++;
            }

        }
        return res;
    }

    public static Student[] sort(Student a[])
    {
        if (a==null)
            return null;
        if (a.length<2)
            return a;
        Student[] b = new Student[a.length/2];
        System.arraycopy(a,0,b,0,a.length/2);
        Student[] c = new Student[a.length-a.length/2];
        System.arraycopy(a,a.length/2,c,0,a.length-a.length/2);
        b=sort(b);
        c=sort(c);
        return merge(b,c);

    }
}