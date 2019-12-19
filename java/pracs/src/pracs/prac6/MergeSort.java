package pracs.prac6;

public class MergeSort {
    public static Student[] merge(Student a[],Student[] b)
    {
        Student[] res = new Student[a.length+b.length];
        int pa=0, pb=0;
        for(int i=0; i<res.length;i++)
        {
            if(pa==a.length) {
                res[i]=b[i-pb];
                pb++;
            } else if(pb==b.length) {
                res[i]=b[i-pb];
                pa++;
            } else if(a[i-pa].compareTo(b[i-pb])<0){
                res[i]=a[i-pa];
                pb++;
            } else{
                res[i]=b[i-pb];
                pa++;
            }

        }
        return res;
    }
    public static void merge(Student a[], int start,int middle,int end)
    {
        int i, j,c=start;
        Student b[]=new Student[end+1];
        for(i = start,j = middle+1; i<=middle && j<=end; c++)
        {

            if(a[i].compareTo(a[j])<=0)
                b[c] = a[i++];
            else
                b[c] = a[j++];
        }
        while(i <= middle )
            b[c++] = a[i++];

        while(j<=end)
            b[c++] = a[j++];

        for(i = start ; i <= end; i++)
            a[i] = b[i];
    }


    public static void sort(Student a[],int start,int h)
    {
        if(start<h)
        {
            int middle=(start+h)/2;
            sort(a,start,middle);
            sort(a,middle+1,h);
            merge(a,start,middle,h);

        }


    }
}