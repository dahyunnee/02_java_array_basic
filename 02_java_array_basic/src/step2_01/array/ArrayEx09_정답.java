package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */

//2021.02.18 19:25 ~ 19:36
public class ArrayEx09_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		
		int index = -1;
		int todayMoney = 0;
		
		
		do {
			
			for (int i = 0; i < seat.length; i++) {
				
				System.out.print("[" + seat[i] + "]");
			}
			
			System.out.println();
			System.out.println("1. 좌석 예매");
			System.out.println("2. 종료");
			
			System.out.print("번호를 입력하세요 : ");
			index = scan.nextInt();
			
			if ( index == 1 ) {
				
				int seatNumber = -1; 
				
				System.out.print("좌석 선택(1~7) : ");
				seatNumber = scan.nextInt();
				
				if ( seat[seatNumber] == 'O') System.out.println("이미 예매가 완료되었습니다. ");
				else {
					
					seat[seatNumber] = 'O';
					todayMoney += 12000;
				}
				
			}
		
			else if (index != 1 && index != 2) System.out.println("번호를 잘못 선택하셨습니다. ");
			
			
			
		}while ( index != 2);
		
		
		System.out.println("--------------------------");
		System.out.println("오늘의 매출액 : " + todayMoney);
		
	}
	
}
