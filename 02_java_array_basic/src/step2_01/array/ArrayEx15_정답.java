package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */


//2021.02.19 19:06 ~ 19:27
public class ArrayEx15_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		
		//배열 셔플 구현 위한 변수
		int temp = 0;
		int tempRan = 0;
		int cnt  = 0;
		
		//게임에 필요한 변수
		
		int numberofFront = 1;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		while (cnt < 1000) {			
			tempRan = ran.nextInt(9);
			temp = front[0]; 
			front[0] = front[tempRan];
			front[tempRan] = temp;
			cnt++;
		}
		
		System.out.println("Front 배열에서 같은 숫자의 위치를 기억하세요. ( 1~5 )");
		
		System.out.print("Front 배열 : ");
		for (int i=0; i<10; i++) {
			System.out.print(front[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		for (int i=0; i<10; i++) {
			System.out.print(back[i] + " ");
		}
		System.out.println();
			
			
		while(true) {			//back이 다 채워질 때까지 반복 
		
			System.out.print("첫번째 " + numberofFront + "의 인덱스 번호를 입력하세요: (순서 상관없음) => ");
			int firstIndex = scan.nextInt();
			System.out.print("두번째 " + numberofFront + "의 인덱스 번호를 입력하세요: (순서  상관없음) => ");
			int secondIndex = scan.nextInt();
			
			
			if ( (numberofFront == front[firstIndex] && numberofFront == front[secondIndex])) { 		// 정답인 경우
				
				back[firstIndex] = numberofFront;
				back[secondIndex] = numberofFront;		//back 배열에 인덱스 번호 저장 
				
				numberofFront ++;
				
			}
			
			else {		//오답인 경우
				
				System.out.println("오답입니다. 다시 시도하세요.");
				
			}
		
			
			
			
			System.out.println();
			
			
			System.out.print("현재 배열 : ");			//현재 back 배열 나타내줌 
			for (int i=0; i<10; i++) {
				System.out.print(back[i] + " ");
			}
			
			System.out.println();
			
			if (numberofFront == 6) break;			//back 배열이 다 채워짐
			
		}
		
		
			if (numberofFront == 6) System.out.println("정답입니다. 전체 배열은 " + Arrays.toString(back) +" 입니다. ");
	
		
	}
	
}
