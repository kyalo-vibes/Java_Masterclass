package exceptionPackage;

public class MultiCatch {

	public static void main(String[] args) {

		try {
			Object obj = null;
			int array[] = { 130, 730, 6, 34, 32, 12 };

			try {
				if(obj != null)
				obj.toString();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			System.out.println(array[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
