public class RecursiveSelectionSort {
	   final static int N = 15;

	   public static void main(String[] args) {
	      double[] A = new double[N]; // random numbers
	      init(A, N); // rand #s for A[0], ..., A[N-1]
	      printit(A, N); // print them
	      System.out.println("Sorted:");
	      selectionSort(A, N);
	      printit(A, N); // print them
	   }

	   static int maxind(double[] A, int n) {
	      int maxi;
	      if (n == 1) return 0;
	      maxi = maxind(A, n-1);
	      if (A[n-1] > A[maxi]) return n-1;
	      return maxi;
	   }

	   static void init(double[] A, int n) {
	      int i;
	      for (i = 0; i < n; i++)
	         // 0 < A[i] < 1, uniformly distributed
	         A[i] = Math.random();
	   }

	   static void interchange(double[] A, int i, int j) {
	      double temp = A[i];
	      A[i] = A[j];
	      A[j] = temp;
	   }

	   static void selectionSort(double[] A, int n) {
	      if (n > 1) {
	         int maxi = maxind(A, n);
	         interchange(A, maxi, n-1);
	         selectionSort(A, n-1);
	      }
	   }
	         
	   static void printit(double[] A, int n) {
	      for (int i = 0; i < n; i++)
	         System.out.println("A[" + i + "]: " + A[i]);
	   }
	}
