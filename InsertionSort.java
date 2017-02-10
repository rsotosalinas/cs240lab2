public class InsertionSort {
	public static int[] insertionSort(int[] array){
		for(int i = 1; i <array.length; i++){
			for(int j = i; j >  0; j--){
				if(array[j]< array[j-1]){
					int temp = array[j -1];
					array[j-1] = array[j];
					array[j] = temp;
				}
			}
			//print(array);
		}
		return array;
	}
	public static void print(int [] array){
		for(int i= 0;i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int[] numb = {4,6,3,0,9,7,9};
        print(numb);
        insertionSort(numb);
        print(numb);
      

   }
}
