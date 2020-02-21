
public class InsertionSort implements SortingAlgorithm {

    public void sort(int[] arr) {

        for(int i = 1; i < arr.length; i++){
            int next = arr[i];
            int j = i  - 1;
            while(j >= 0 && next < arr[j]){ //while j is more or equal to 0, and next is less than arr[j] , arr[j+1] becomes arr[j]
                arr[j+1] = arr[j];// and we check the previous j value.
                j -= 1;
            }
            arr[j + 1] = next;
        }

    }
}