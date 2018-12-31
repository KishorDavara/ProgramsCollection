package Sorting;
/**
 *
 * @author KK Davara
 */
public class HeapSort {
 
    private static int N;
    public static void swap(int A[],int i,int j)
    {
        A[i]=A[i]^A[j];
        A[j]=A[i]^A[j];
        A[i]=A[i]^A[j];
        
    }
    public static void Build_MAX_Heap(int A[])
    {
        N=A.length-1;
        for(int i=N/2;i>=0;i--)
        {
            MAX_Heapify(A,i);
        }
    }
    
    public static void MAX_Heapify(int A[],int index)
    {
        int l=2*index+1;
        int r=l+1;//2*index+2;
        int largest=index;
        if(l<=N && A[l]>A[index])
            largest=l;
        if(r<=N && A[r]>A[largest])
            largest=r;
        if(largest!=index)
        {
            swap(A,largest,index);
            MAX_Heapify(A,largest);
        }
    }
    
     
    public static void Heap_Sort(int A[])
    {
        Build_MAX_Heap(A);
        for(int i=N;i>=1;i--)
        {
             swap(A,0,i);
             N--;
            MAX_Heapify(A,0);
        }
    }
    
    public static void main(String[] args) {
        int array[]={16,4,10,14,7,9,3,2,8,1};
        Heap_Sort(array);
        for(int i=0;i<array.length;i++)
             System.out.print(array[i]+" ");
    }
    
}
