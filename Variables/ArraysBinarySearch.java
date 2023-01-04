public class ArraysBinarySearch{
    public static void main(String[] args) {

	int[] array = {10, 99, 40,300,20};

	int searchValue = 40;
	java.util.Arrays.sort(array);
	
  	int index = java.util.Arrays.binarySearch(array,searchValue);
	for (int val : array) System.out.println(val);
   	System.out.println("Index : " + index);

    }
}
