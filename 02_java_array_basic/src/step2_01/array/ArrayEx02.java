package step2_01.array;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 배열 사용 예시 1 
		String[] test1 = new String[3];
		double[] test2 = new double[5];
		char[] test3 = new char[1];
		boolean[] test4 = new boolean[10];
		
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		
		//배열 사용 예시2 : 축약형 ( 배열을 처음 생성할 때만 사용 가능)
		int[] arr2 = { 10, 20, 30 };
		// arr2 = {40, 50, 60};  => 에러 
		
		//배열 사용 예시3 ( for문과 조합 )
		int[] arr3= new int[100];
		
		for ( int i = 0; i<arr3.length; ++i) {
			
			arr3[i] = (i+1)*10;
		
		}
		
		
	}

}
