package step2_01.array;

import java.util.Arrays;


/*
 * 
 * 
 * 배열 ( array ) 
 * 
 *  [ 형식 ]
 *  
 *  1) 자료형[] 배열명 = new 자료형[방의개수];
 *  2) 자료형 배열명[] = new 자료형[방의개수];
 * 
 * 	- '같은 자료형'의 데이터를 '여러개' 저장하기 위한 자료구조
 *  - 인덱스 (index) : 0부터 시작하는 방 번호가 부여된다.
 *  - 배열은 주소변수이다.
 *  - 배열을 크기가 변하지 않는다. 배열을 삭제하여도 배열의 크기는 고정되어있다.
 *  - 배열의 요소를 지우는 것은 배열의 초깃값으로 다시 저장하는 것을 의미한다.
 * 
 * 
 * */


public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 일반 변수 ( 값 저장 ) 
				int nVar = 0;
				nVar = 3;
				System.out.println(nVar);	//값
				
		// 2. 주소 변수 ( 주소 저장 )
				int[] arr = null;
				arr = new int[5];
				System.out.println(arr);	//주소
				
				
				System.out.println(arr[0]);		//배열은 생성시 초깃값이 세팅되어있다.
				System.out.println(arr[1]);		//정수 형태의 배열은 0, 나머지는 직접 확인해보자.
				System.out.println(arr[2]);
				System.out.println(arr[3]);
				System.out.println(arr[4]);
				System.out.println();
				
				
				// System.out.println(arr[5]);
				// java.lang.ArrayIndexOutOfBoundsException:5
				// 배열의 범위가 넘어설 때 나는 에러메시지 (해당 에러메세지 암기)
				
				arr[0] = 10;
				arr[1] = 20;
				arr[2] = 30;
				arr[3] = 40;
				arr[4] = 50;
		
				for (int i = 0; i < arr.length; ++i) {	//arr.length : 배열의 크기
					
					System.out.println(arr[i]);
				
				}
				
				System.out.println();
				
				// (참고) 배열이 익숙해진 후에 사용
				 System.out.println(Arrays.toString(arr));		//import 시켜줘야함
				 
				 
				 
				 
				 arr = null; 	//배열 전체 삭제
				 
				
				
	}

}
