class AQ1{
public static int
findSecondLargest(int[] arr) {
	int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
	
	for(int i = 0; i < arr.length; i++){
		if(arr[i] > first){
			second = first;
			first = arr[i];
		} else if (arr[i] > second && arr[i] < first)
		{
			second = arr[i];
		}
	}
	return second;
}
 static int[]
 moveZerosToEnd(int[] arr) {
	 int result[] = new int[arr.length];
	 int insertPos = 0;
	 for (int i = 0; i < arr.length; i++) {
		 if(arr[i] != 0) {
			 result[insertPos] = arr[i];
			 insertPos++;
		 }
	 }
	 return result;
 }
 
			 
	public static void main(String[] args){
		int[] arr = {10, 0, 6, 20, 0, 5, 0, 34};
		int secondLargest = findSecondLargest(arr);
		int[] movedZerosArray = moveZerosToEnd(arr);
		
		System.out.println("Second largest element: " + secondLargest);
		System.out.println("Array after moving Zeros: ");
		for (int i = 0; i < movedZerosArray.length; i++)

		{ System.out.print(movedZerosArray[i]);
if (i < movedZerosArray.length - 1)
//{System.out.print(", ");
	}
}
//System.out.println("]");
	}
