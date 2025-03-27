class GCDRecursion{
 static String gcdr(int n){
 if (n == 2) {
	 return "gcd(int, int)";
 }
 return "gcd(int, " + gcdr(n - 1) + ")";
 }
 public static void main(String[] args){
	 int n = 5;
	 System.out.println(gcdr(n));
 }
}
	 
 
 