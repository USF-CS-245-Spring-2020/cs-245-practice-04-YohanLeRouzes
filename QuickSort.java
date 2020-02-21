
public class QuickSort implements SortingAlgorithm
{
	public void sort(int [] a){
		qs(a,0,a.length-1); //Calling Quicksort
	}

	public void qs(int [] a, int left, int right){
		if(left>=right) //If left is greater or equal to right end the function because it's not functional
			return;
		int pivot = a[(left+right)/2]; //pivot is in the middle of array a
		int index = partition(a,left,right,pivot);  //index is equal to the value returned by partition
		qs(a,left,index-1); //quicksort the array a again
		qs(a,index,right);  //quicksort array a again
	}

	public int partition(int [] a, int left, int right, int pivot){
		while(left<=right){ //While the left is less than the right ( there are values to sort
			while(a[left] < pivot){ //and a[left] is less than the pivot
				left++;  //increment left
			}
			while(a[right] > pivot){ //and the a[right] is greater than the pivot
				right--; //decrement right
			}
			if(left<=right){ //When they pass each other swap them and increment/decrement
				swap(a,left,right);
				left++;
				right--;
			}
		}
		return left; //return the value left
	}

	public void swap(int [] a, int left, int right){ //Swap function to swap a[left] and a[right]
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

}