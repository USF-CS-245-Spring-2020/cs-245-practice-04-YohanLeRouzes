
public class MergeSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		
		if(a.length<2) { //Return if a.length is less than 2 instead of calling an error
			return;
		}
		
		int leftSize=a.length/2; //Size of the left array is half the length of a
		int rightSize=a.length-leftSize; //Size of the right array is the rest of the array a
		int[] left=new int[leftSize]; //Create two new arrays left and right
		int[] right=new int[rightSize];
		copyArray(a,left,right); //Used to copy the arrays back into a when sorted
		
		sort(left); //Sort array left
		sort(right); //Sort array right
		
		mergeSort(a,left,right); //Merging the arrays back together
	}
	
	void mergeSort(int[] target,int[] left,int[] right) { // Merges the two smaller arrays into one sorted array
		
		int indexL=0; //Declaring indexes
		int indexR=0;
		int indexTarget=0;
		
		while(indexL<left.length && indexR<right.length) { //As long as the indexes haven't reached the end
			if(left[indexL]<=right[indexR])
				target[indexTarget++]=left[indexL++]; //target becomes the value in left and we increment the indexes
			else
				target[indexTarget++]=right[indexR++]; //target becomes the value in right and we increment the indexes
		}
		
		while(indexL<left.length)
			target[indexTarget++]=left[indexL++]; //If one ends before the other, finish the sorting of the rest of the other array
		while(indexR<right.length)
			target[indexTarget++]=right[indexR++];
	} 
	
	void copyArray(int[] a, int[] left, int[] right) { //Once they are sorted into two different arrays, go through every value and copy it back into the original array
		
		for(int i=0;i<left.length;i++)
			left[i]=a[i];
		for(int i=0;i<right.length;i++)
			right[i]=a[i+left.length];
	}
}