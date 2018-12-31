package Arrays;

/**
 *
 * @author KK Davara
 */
class Minheap
{
    int []arr;
    int heapSize;
    public Minheap(int a[],int n)
    {
        arr=a;
        heapSize=n;
    }
    
    public static void swap(int A[],int i,int j)
    {
        A[i]=A[i]^A[j];
        A[j]=A[i]^A[j];
        A[i]=A[i]^A[j];
        
    }
    
    public void Min_heapify(int a[],int i) {
       int l=2*i+1;
       int r=l+1;
       int smallest=i;
       if(l<heapSize && a[l]<a[i]) {
           smallest=l;
       }
       if(r<heapSize && a[r]<a[smallest]) {
           smallest=r;
       }
       if(smallest!=i) {
           swap(a,i,smallest);
           Min_heapify(a,smallest);
       }
    }
    
    public void Build_Min_Heap(int a[]) {
        for(int i=(heapSize-1)/2;i>=0;i--) {
          Min_heapify(a,i);  
        }
    }
    
    public int extractMin()
     {
            if (heapSize == 0)
                return Integer.MAX_VALUE;
 
          // Store the minimum value.
            int root = arr[0];
 
         // If there are more than 1 items, move the last item to root
         // and call heapify.
            if (heapSize > 1)
            {
                arr[0] = arr[heapSize-1];
                Min_heapify(arr,0);
            }
        heapSize--;
        return root;
     }
    
    public int kthSmallest(int arr[], int n, int k)
    {
            // Build a heap of n elements: O(n) time
            Build_Min_Heap(arr);
 
    // Do extract min (k-1) times
          for (int i=0; i<k-1; i++)
             extractMin();

    // Return root
      return arr[0];
     }
}

public class KthSmallestElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int arr[] = {12, 3, 5, 7, 19,1,85,4,25,8,47,9,11};
     Minheap heap=new Minheap(arr,arr.length);
     System.out.println("Kth Smallest Element is "+heap.kthSmallest(arr,arr.length,7));
    }
    
}
