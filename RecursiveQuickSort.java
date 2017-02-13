
public class RecursiveQuickSort
{
     static int[] theArray = {5,3,4,6,6,3,6,2,1,0};
     static int arraySize = 10;

//-------------------------------------------------------------------
   public static void swapValues( int one, int two){
    int temp = theArray[one];
    theArray[one] = theArray[two];
    theArray[two]= temp;
    
}
//-------------------------------------------------------------------
public static void quickSort(int left,int right){
    if(right - left <= 0)
        return;
    else{
        int pivot = theArray[right];
        System.out.println(theArray[right] + " this is  pivot in right");
        System.out.println("left: "+ left + " right : "+right+ "pivot:" 
                + pivot + " sent to partition");
    
     int pLocation = partitionArray(left,right,pivot);
    quickSort(left,pLocation -1);
    quickSort(pLocation +1, right);
    }
}
//-------------------------------------------------------------------
   public static int partitionArray(int left,int right, int pivot){
       int leftp = left -1;
       int rightp = right;
       while(true){
           while(theArray[leftp++] <(pivot) );
            System.out.println(theArray[leftp] + "is index " + leftp 
                 + " and is greater than pivot" + pivot );
           while(theArray[rightp++] >(pivot));
              System.out.println(theArray[rightp++] + "is index " + rightp
                + " is less than the pivot : " + pivot);
    
       if(leftp >= rightp){
           System.out.println("left >= right");
           break;
       }
       else{
          swapValues(leftp,rightp);
       
       }
    }
       swapValues(leftp,right);
       return leftp; 
}
    

//-------------------------------------------------------------------
public static void print(){
    for(int i =0;i<arraySize;i++){
        System.out.print(theArray[i] + " ");
    }
    System.out.println();
}
//-------------------------------------------------------------------
   public static void main(String[] args) {

       print();
       quickSort(1,theArray.length - 1);
       print();
  
   }

} 
    
