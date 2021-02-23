package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayEx24_테스트문제1_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] a = { 10, 4, 5, 3, 1 };
	
		
		// 문제 1) 위 배열를 이용해서 전체 요소의 합출력
		int sumofArray = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			sumofArray += a[i];
		}
		
		System.out.println("전체 배열 요소들의 총합 : " + sumofArray);
		System.out.println();
		
		// 문제 2) 값을 입력하면 인덱스 출력
		// 예) 5 ==> 2  ,  1 ==> 4
		
		boolean isExist = false;
		
		
		do {		//존재하는 숫자 입력할 때까지 반복
			
			System.out.print("숫자를 입력하세요 : ");
			int inputNumber = scan.nextInt();
			
			for (int i = 0; i < a.length; i++) {
				
				if (inputNumber == a[i]) {
					
					System.out.println(inputNumber + " ==> " + i );
					isExist = true;
					break;
				}
				
			
				if (i == a.length - 1 && isExist == false) {
					
					System.out.println("존재하지 않는 값입니다.");
					break;
				}
			}
			
			System.out.println();
			
			
		}while(isExist != true);
		
		System.out.println();
		
		
		// 문제 3)  인덱스를 입력하면 값 출력
		// 예) 2 ==> 5  , 4 ==> 1

		isExist = false;
		
		
		do {			//존재하는 인덱스 입력할 때까지 반복.
			
			System.out.print("인덱스를 입력하세요 : ");
			int inputIndex = scan.nextInt();
			
			if (inputIndex < 0 || inputIndex >= a.length) {
				
				System.out.println("존재하지 않는 인덱스입니다.");
			}
			
			else {
				
				System.out.println(inputIndex + " ==> " + a[inputIndex]);
				isExist = true;
					
			}
		
			System.out.println();
			
		}while(isExist != true);
		
		System.out.println();
		
		// 문제 4) 위 배열중 가장 큰 값 출력 
		// 예) 10
		
		int maxNum = a[0];
		
		for (int i = 1; i < a.length; i++) {
			
			if ( a[i] > maxNum) maxNum = a[i];
		}

		System.out.println("배열에서 가장 큰 값은 " + maxNum +"입니다. ");
		System.out.println();
		
		// 문제 5) 위 배열중 홀수의 개수 출력 
		// 예) 홀수의 개수 : 3
		
		int numberofOdd = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) numberofOdd ++; 
		}
			
		System.out.println("홀수의 개수 : " + numberofOdd);
		System.out.println();
		
		// 문제 6) a의 값중 홀수만 b에 저장 (저장위치는 a와 b의 동일한 위치에 저장)
		// 예) b => {0, 0, 5, 3, 1}
		int[] b = {0, 0, 0, 0, 0};
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) {
				
				b[i] = a[i];
			}
		}
		
		System.out.println("b => " + Arrays.toString(b));
		System.out.println();
		
		// 문제 7) 다음 리스트를 이용해서 a의 값중 홀수만 c에 저장(저장위치는 앞에서부터  저장 , 3번 문제와 다름)
		// 예) b => {5, 3, 1, 0, 0}
		int[] c = { 0,0,0,0,0 };
		
		int indexofC = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] % 2 != 0) {
				
				c[indexofC ++] = a[i];
			}
		}

		System.out.println("c => " + Arrays.toString(c));
		System.out.println();
	}

}
