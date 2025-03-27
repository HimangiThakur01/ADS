class AlternatingHarmonicSum {
   static double rsum(int n){
   if(n == 1) {
     return 1.0;
	 }
	 return((Math.pow(-1, n + 1)) / n) + rsum(n - 1);
	 }
	 public static void main(String[] args) {
		 int N = 5;
		 System.out.printf("Sum of series is " + N + " = "+ rsum(N));
	 }
}
	  