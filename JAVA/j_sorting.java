//  Bubble sorting
//  selection sorting
//  insertion sorting
//  merge sorting 

public class j_sorting {   

    // public static void array(int arr[]){
    //     for(int i = 0; i < arr.length; i++){
    //         System.out.print(arr[i] + " ");
    //     }
    // }

    // public static void main(String[] args) {
        
    //     int arr[] = {7,8,3,1,2};


//1 Bubble sorting   { swaping one by one in array }

        // for(int i = 0; i < arr.length-1; i++){
        //     for(int j = 0; j < arr.length-i-1; j++){
        //         if(arr[j] > arr[j+1]){
        //             // swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // array(arr);


//2 selection sorting  { swap by smallest by it's position }

        // for(int i = 0; i < arr.length-1; i++){
        //     int smallest = i;
        //     for(int j = i+1; j < arr.length; j++){
        //         if(arr[smallest] > arr[j]){
        //             smallest = j;
        //         }
        //     }

        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        // array(arr);


//3 insertion sorting   { divide in sorted or unsorted part }

        // for(int i = 1; i < arr.length; i++){
        //     int current = arr[i];

        //     int j = i-1;
        //     while (j >= 0 && current < arr[j]) {
        //         arr[j+1] = arr[j];
        //         j--;
        //     }
        //     // placement
        //     arr[j+1] = current;
        // }

        // array(arr);

    // }


//4  merge sorting

    // public static void conquer(int arr[], int sidx, int mid, int eidx){

    //     int merge[] = new int [eidx - sidx + 1];

    //     int idx1 = sidx;
    //     int idx2 = mid + 1;
    //     int x = 0;
        
    //     while(idx1 <= mid && idx2 <= eidx){
    //         if (arr[idx1] <= arr[idx2]) {
    //             merge[x++] = arr[idx1++];
    //         } else{
    //             merge[x++] = arr[idx2++];
    //         }
    //     }

    //     while (idx1 <= mid) {
    //         merge[x++] = arr[idx1++];
    //     }

    //     while (idx2 <= eidx) {
    //         merge[x++] = arr[idx2++];
    //     }

    //     for (int i = 0, j = sidx; i < merge.length; i++, j++) {
    //         arr[j] = merge[i];        }
    // }

    // public static void divide(int arr[], int sidx, int eidx){
    //     if(sidx >= eidx){
    //         return;
    //     }

    //     int mid = sidx + (eidx - sidx) / 2;
    //     divide(arr, sidx, mid);
    //     divide(arr, mid+1, eidx);

    //     conquer(arr, sidx, mid, eidx);
    // }
    // public static void main(String[] args) {
        
    //     int arr[] = {6, 3, 9, 5, 2, 1};
    //     int n = arr.length;

    //     divide(arr, 0, n-1);

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(arr[i] + " ");
    //     }

    //     System.out.println();
    // }
 

//5  Quick sorting

    public static int partition(int arr[], int low, int high){

        int pivotEle = arr[high];
        int i = low -1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivotEle) {
                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i;  // pivot index

    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
            int pivotIDX = partition(arr, low, high);

            quickSort(arr, low, pivotIDX -1);
            quickSort(arr, pivotIDX +1, high);
        }

    }
    public static void main(String[] args) {
        
        int arr[] = {4, 3, 9, 5, 2, 8};
        int n = arr.length;

        quickSort(arr, 0, n-1);

        // print  

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

    }


}
