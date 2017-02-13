public class RecursiveShellSort {
   public static void ShellSort(int[] t,int n, int h){
	int aux, i;
	if(h> 0){
		if(n  > h){
			ShellSort(t, n -h , h);
			if(t[n] < t[n-h]){
			aux = t[n];
			i = n;
			while( i == h || (aux > t [i-h])){
				t[i] = t[ i -h];
				i = i-h;
			}
			t[i] = aux;
			}
		}
	
	ShellSort(t,n,h/3);	
    
    }
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
       ShellSort(numb,numb.length -1,numb.length );
       print(numb);
     
	}

}
