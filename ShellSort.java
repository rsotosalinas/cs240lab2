public class ShellSort {

		public static void print(int [] array){
			for(int i= 0;i < array.length; i++){
				System.out.print(array[i] + " ");
			}
			System.out.println();
		}	
		public static void main(String[] args) 
		{	
			int j;
			int temp;
			int i;
			int a[]= {13,14,5,4,3,9,7};
			System.out.println("Given input is");
			for(int l=0; l < a.length ; l++)
			{
				System.out.print(a[l]+",  ");
			}
			int inc = 1;
			int k = 0;
			while (inc <= a.length+1)
			{
				for (i = inc; i<=a.length-1;i++)
				{
					temp = a[i];
					j = i;
					while ( j>=inc && a[j-inc]>temp)
					{
						a[j] = a[j-inc];
						j = j - inc;
					}
					a[j]=temp;
					print(a);
					}
				System.out.println("this is where the code repeats.");
				k = k + 1; 
				inc = (int)(Math.pow(2,k))+1;
				//Adding hilbert increments of 2^k-1
				System.out.println("this is where it cuts");
			}
			System.out.println();
			System.out.println("Required output is");
			for(int l=0; l < a.length ; l++)
			{
				System.out.print(a[l]+"  ");
			}
		}
	}
