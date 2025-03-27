class ReverseStringRecursion{
  static String reverse(String s) {
  if (s.isEmpty()) {
  return s;
  }
  return reverse(s.substring(1)) + s.charAt(0);
  }
  public static void main(String[] args) {
	  String input = "hello";
	  String reversed = reverse(input);
	  System.out.println("Original String: " + input);
	  System.out.println("reversed String: " + reversed);
	  
  }
}