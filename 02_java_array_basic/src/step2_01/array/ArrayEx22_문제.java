package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 배열 컨트롤러[1단계] : 최종
 * 
 *  20번 21번 22번의 문제를 한 코드로 병합하여 보자.
 * 
 * 1) 추가
 * 2) 삭제
 * 3) 삽입
 * 
 *  정답 없음
 */

// 2021.02.19 21:28~
public class ArrayEx22_문제 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,0,0,0};
		int elementCnt = 2;
		int selectMenu = 0;
		
		int numberofArr = 0;
		boolean isNumber = false;
		
		while (true) {
			
			System.out.println("현재 배열 : " + Arrays.toString(arr));
			System.out.println("\n1추가");
			System.out.println("2삭제");
			System.out.println("3삽입");
			System.out.println("4종료\n");
			System.out.print("입력 : ");
			selectMenu = scan.nextInt();
			
			//배열에 들어있는 수의 개수 
			for (int i = 0; i < arr.length; i++) {
				
				if (arr[i] != 0)  numberofArr ++;
			}
			
			if (selectMenu == 1) {
				
				System.out.print(" '0 이외의 수' 중 추가할 수를 입력하세요 => ");
				int inputNumber = scan.nextInt();
				
				if (numberofArr < arr.length) arr[numberofArr] = inputNumber;
				else System.out.println("배열이 꽉 차서 더 이상 추가하실 수 없습니다. ");
				
			}
			
			else if (selectMenu == 2) {
				
				int positionofIndex = -1;
				
				System.out.print("삭제하실 수를 입력하세요 => ");
				int deleteNumber = scan.nextInt();
				
				for (int i = 0; i < arr.length; i++) {
					
					if (arr[i] == deleteNumber) {
						
						isNumber = true;
						arr[i] = 0;
						positionofIndex = i;
					}
				}
				
				if ( isNumber == false ) System.out.println("삭제할 수가 배열에 존재하지 않습니다. ");
				else {		//삭제할 수 존재하는 경우
					
					for (int i = positionofIndex + 1; i < arr.length; i++) {
						
						arr[i-1] = arr[i];
						
						if (i == arr.length - 1) arr[i] = 0;
						
					}
					
				}
				
			}
			
			else if (selectMenu == 3 ) {
				
				System.out.print("삽입하실 수를 입력하세요 => ");
				int putNumber = scan.nextInt();
				
				System.out.println("삽입하실 인덱스를 입력하세요 => ");
				int putIndex = scan.nextInt();
				
				if (numberofArr >= arr.length) {		//배열 꽉찬 경우
					
				}
				
				if () { //배열 이외의 인덱스를 입력한 경우
					
				}
			}
			
			else if (selectMenu == 4 ) {
				
				break;
			}
			
			else {
				System.out.println("번호를 잘못 입력하셨습니다. ");
			}
			
		}
		
	}
	
}
