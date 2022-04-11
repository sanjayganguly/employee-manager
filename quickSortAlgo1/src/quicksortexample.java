public class quicksortexample {










    static int partition(int[] arr, int low, int high){

        // pivot
        int pivot = arr[high];

        // Index of smaller element
        int i = (low-1);

        for (int j=low; j<= high-1, j++){

            // If current element is smaller than the pivot
            if (arr[j] < pivot){
                // Increment index pf smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }



    static void quickSort (int [] arr, int low, int high){
        if(low<high){
            printArray(arr,arr.length);
            //p_index = partition index, arr[p]
            int p_index = partition(arr,low,high);

            // Separately sort elements before partition and after partition
            quickSort(arr,low,p_index-1);
            quickSort(arr,p_index,high);
        }
    }

        //Function to print an Array
    static void print Array(int[] arr, int size){
        for(int i = 0; i< size; i++)
            System.out.println(arr [i]+" ");

        System.out.println();
    }

//Driver Code
    public static void main(String[] args) {
    int [] arr = {5,75,25,85,35,45,65};
    int n = arr.length;

    quickSort (arr,0,n-1);
        System.out.println("Sorted Array : ");
        printArry(arr, n);
    }

}