class TableUsingRecursion {
	static void tab(int num, int mul) {
  if (mul > 10) {
    return ;
 }
  System.out.println(num + " X " + mul + " = " + (num * mul));
  tab(num, mul + 1);
	}
	public static void main(String[] args) {
		int number = 5;
		tab(number, 1);
	}
}