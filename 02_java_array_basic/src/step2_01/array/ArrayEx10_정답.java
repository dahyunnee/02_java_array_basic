package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

//2021.02.18 19:37 ~ 19:55
public class ArrayEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		
		char isWrong = 'X';
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
			
			
			
			if (sel == 0) break;
			boolean isWinner = false;
				
			for (int i = 0; i < lotto1.length - 2; i++) {
				
				
				
				
				switch(sel) {
				
				case 1:
					if (lotto1[i] == 7 && lotto1[i+1] == 7 && lotto1[i+2] ==7)
						isWinner = true;
					break;
					
				case 2:
					if (lotto2[i] == 7 && lotto2[i+1] == 7 && lotto2[i+2] ==7)
						isWinner = true;
					break;
					
				case 3: 
					if (lotto3[i] == 7 && lotto3[i+1] == 7 && lotto3[i+2] ==7)
						isWinner = true;
					break;
					
				default : 
					
					isWrong = 'O';  
				}
			

				
				
			}
			
			if (isWinner == true && isWrong == 'X' ) System.out.println("당첨복권");
			else if (isWinner == false && isWrong == 'X') System.out.println("꽝");
			else if (isWrong == 'O') System.out.println("잘못 선택하셨습니다.");
				
	
			
		}
		
	}
}
