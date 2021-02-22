package step2_01.array;

import java.util.Arrays;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 temp 배열을 생성한뒤에 
 *   arr배열의 요소들을 temp로 옮겨담자.
 * 
 * 
 */


//2021.02.18 20:25 ~ 20:35
public class ArrayEx13_정답 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		
		int[] index = new int[arr.length];
		int numberof4Multiple = 0;
		int lengthofIndex = 0;
		
		for (int i = 0; i < index.length; i++) {
			
			index[i] = -1;		//index배열 초기화
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 4 == 0 )  {
				
				numberof4Multiple ++;
				
				index[lengthofIndex] = i;		//4의 배수 index번호 기록 
				lengthofIndex ++;
				
			}
		}
		
		temp = new int[numberof4Multiple]; 	//temp 배열 생성
		
		for (int i = 0; i < index.length; i++) {	
			//temp 배열에 4의 배수 요소들 옮겨담기
												
			if (index[i] != -1) temp[i] = arr[index[i]];
			//index[i]가 -1 값이 아님. 즉, 4의 배수 index번호가 들어 있는 경우
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		
		
	}
	
}
