package Array1;

public class BasicsOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = new int[10];
//		int[] arr = new int[10]; Other way of declaring array
//		arr = new int[5]; also change the size of array later on
		
		arr[0] = 5;
		arr[5] = 17;
		
		System.out.println(arr[0]);
		System.out.println(arr[5]);
		
//		arr[-5] = 18;	Index -5 out of bounds for length 10
//		arr[10] = 15;	Index 10 out of bounds for length 10, as array goes from index 0 to 9
		
		char cArray[] = new char[10];
		double dArray[] = new double[10];
		String sArray[] = new String[10];
		boolean bArray[] = new boolean[10];
		
										//output
		System.out.println(cArray[0]);  //		default value is ""
		System.out.println(dArray[0]);  //0.0	default value is "0.0"
		System.out.println(sArray[0]);  //null	default value is "null"
		System.out.println(bArray[0]);	//false default value is "false"
		
		System.out.println(bArray);	// [Z@5a07e868						1-D array of boolean type and reference after "@"
		System.out.println(cArray);  //		
		System.out.println(dArray);  //[D@76ed5528						1-D array of double type and reference after "@"
		System.out.println(sArray);  //[Ljava.lang.String;@2c7b84de
	}

}
