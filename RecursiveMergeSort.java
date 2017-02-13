public class RecursiveMergeSort {
    private int [] array;
    //-------------------------------------------------------------------
    public void sort (int [] array ){
       mergeSort(array,0,array.length-1);    
    }
    //-------------------------------------------------------------------
    public static void mergeSort(int[] array,int low, int high){
        
       if(low<high){
           int mid =(low+high)/2;
           mergeSort(array,low,mid);
           mergeSort(array,mid+1,high);
           merge(array,low,mid,high);
       }
    }
    //-------------------------------------------------------------------
    public static void merge(int[] array ,int low,int mid,int high){
   
       @SuppressWarnings("unchecked")
	int []temp = new int[high - low +1];
       int left = low;
       int right = mid +1;
       int k =0;
       while(left <= mid && right <= high){
           if(array[left] < (array[right]) ){
               temp[k] = array[left];
               left++;
           }
           else{
               temp[k] = array[right];
               right++;
           }
           
       }
       if (left <=mid){
           while(left <= mid){
               temp[k] = array[left];
               left++;
               k++;
           }
           
       }
       else if(right <= high){
           while(right <= high){
               temp[k] = array[right];
               right++;
               k++;
           }
       }
       for(int m = 0; m<temp.length; m++){
           array[low+m] = temp[m];
       }
    }
    //-------------------------------------------------------------------
	public static void print(int [] array){
		for(int i= 0;i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int [] numb = {4,6,3,0,9,7,9};
        print(numb);
        mergeSort(numb, 0 , numb.length-1 );
        print(numb);
      
	}
    
}
