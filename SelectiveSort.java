public class SelectiveSort {
	public static void swap(int[] other,int a, int b){
		int temp = other[a];
		other[a] = other[b];
		other[b] = temp;
		
		
	}
    public static int smallestIndex(int[] array, int a,int b){
    	int IndexOfMin,min;
    	min = array[a];
    	IndexOfMin = a;
    	for(; a < array.length; a++){
    		if(array[a] < min){
    			min = array[a];
    			IndexOfMin = a;
    			
    		}
    	}
    	
    	return IndexOfMin;
    	
    }
	public static int[] selectionSort(int[] other1, int a, int b){
		
         
	    for(; a< other1.length;a++ ){
           int small = smallestIndex(other1,a ,b);
           swap(other1,a,small);
           print(other1);
	    }
	    		
	 
	    return other1;
	}
	public static void print(int [] array){
		for(int i= 0;i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
