package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # ATM[3단계]
 * 
 * 1. 가입
 *  - 계좌번호와 비밀번호를 입력받아 가입
 *  - 계좌번호 중복검사
 * 2. 탈퇴
 *  -  계좌번호를 입력받아 탈퇴
 */

//2021.02.22 20:34 ~ 21:03
public class ArrayEx23_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] accs = {1001, 1002, 0, 0, 0};
		int[] pws  = {1111, 2222, 0, 0, 0};
		
		int accsCnt = 2;
		int selectMenu = 0;
		boolean isRun = true;
		
		while (isRun) {
			
			System.out.println("1.가입");
			System.out.println("2.탈퇴");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			selectMenu = scan.nextInt();
			
			if		(selectMenu == 1) {
			
				
				if (accsCnt >= accs.length) {			//5개 초과한 경우 삭제 후 진행 유도
					
					System.out.println("가입 가능한 계좌번호의 개수를 초과하셨습니다. 삭제 후 진행해 주세요. ");
					System.out.println();
					continue;
				}
				
				System.out.print("가입하실 계좌번호를 입력하세요 : ");
				int inputAccs = scan.nextInt();
				
				for (int i = 0; i < accs.length; i++) {			// 중복 계좌번호 존재하는지 검사
					
					if (inputAccs == accs[i]) {
						
						System.out.println("이미 존재하는 계좌번호 입니다. ");
						continue;
						
					}
					
					
				}
				
				
				System.out.print("가입하실 계좌번호의 비밀번호를 입력하세요 : ");
				int inputPws = scan.nextInt();
				
				accs[accsCnt] = inputAccs;			//계좌번호와 비밀번호 저장하기
				pws[accsCnt] = inputPws;
				
				accsCnt ++;
				
				System.out.println(Arrays.toString(accs));
				
				
			}
			else if (selectMenu == 2) {
				
				System.out.print("탈퇴하실 계좌번호를 입력하세요 : ");
				int joinedAccs = scan.nextInt();
				
				int joinedPws = -1;
				int joinedIndex = -1;
				
				for (int i = 0; i < accs.length; i++) {
					
					if (joinedAccs == accs[i]) {
						
						joinedIndex = i;		//계좌번호 존재하는 경우
						
						break;
					}
					
			
				}
				
				
				if (joinedIndex != -1) {			//비밀번호 확인
					
					do {
						
						
						System.out.print("탈퇴하려는 계좌번호의 비밀번호를 입력하세요 : ");
						joinedPws = scan.nextInt();
						
						if ( pws[joinedIndex] == joinedPws) {
							
							System.out.println("탈퇴가 처리되었습니다.");
							
							accsCnt --;
							
							pws[joinedIndex] = 0;
							accs[joinedIndex] = 0;
						}
						
						else {
							
							System.out.println("비밀번호가 틀렸습니다. 다시 입력하세요. ");
							System.out.println();
						}
						
					}while(pws[joinedIndex] != 0);			//비밀번호 맞을 때까지 입력.
					
					
					
				}
				
				else {
					
					System.out.println("해당 계좌번호가 존재하지 않습니다.");
				}
				
				
			}
			else if (selectMenu == 3) {
				
				System.out.println("종료되었습니다.");
				break;
				
			}
			
			else {
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력하세요.");
			}
			
			System.out.println();
		}

	}
}
