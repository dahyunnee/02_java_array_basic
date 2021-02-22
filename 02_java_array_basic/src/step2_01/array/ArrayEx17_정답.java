package step2_01.array;

import java.util.Random;
import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * 1  2  3
 * [X][X][O]			//row = 1 
 * [ ][O][ ]			//row = 2
 * [ ][ ][ ]			//row = 3
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */


//2021.02.19 19:50 ~  21:19
public class ArrayEx17_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		char[][] game = new char[3][3];
		
		boolean whoseturnofGame = true;
		boolean isPrint = true;
		
		char whoseWinner = ' ';
		
		for (int i = 0; i < game.length; i++) {
			for (int j = 0; j < game.length; j++) {
				
				game[i][j] = ' ';
			}
		}
		
		
		while (true) {
			
			
			int rowofP1 = -1;
			int columnofP1 = -1;
			
			int randomColumn = -1;
			int randomRow = -1;
			
			
		
			if (isPrint == true ) {	
				
				
				System.out.println();
				
				System.out.println("=== 틱택토 ===");
				for (int i = 0; i < game.length; i++) {
					
					for (int j = 0; j < game.length; j++) {
						
						System.out.print("[" + game[i][j] + "]");
						if (j==2) System.out.println();
						
					}
					
				}
				
			
			}
			
			
			if (whoseturnofGame == true) {		//p1 사용자의 차례

				
				System.out.println();
				System.out.println("[ p1 사용자 차례 ]");
				System.out.print("[p1] 행 입력 (0~2) : ");		// 행 입력받기
				rowofP1 = scan.nextInt();
				
				if (rowofP1 < 0 || rowofP1 > 2) {
					
					System.out.println(" 0~2 사이의 행을 입력하세요");
					isPrint = false;
					continue;
				}
				
				System.out.print("[p1] 열 입력 (0~2) : ");		//열 입력받기
				columnofP1 = scan.nextInt();
				
				if (columnofP1 < 0 || columnofP1 > 2) {
					
					System.out.println(" 0~2 사이의 행을 입력하세요");
					isPrint = false;
					continue;
				}

				
				//인덱스 선택 가능 or 불가능?
				if ( game[rowofP1][columnofP1] == ' ') {			//선택한 인덱스가 비어있는 경우
					
					
					game[rowofP1][columnofP1] = 'O';
					whoseturnofGame = false;
					isPrint = true;
					
					
				}

				else {				//선택한 인덱스가 비어있지 않은 경우
					
					System.out.println("비어있지 않은 인덱스입니다. 다른 인덱스를 선택하세요.");
					isPrint = true;
					continue;
				}
				
				
			}
			
			else {		//컴퓨터 차례
				
				System.out.println();
				System.out.println(" [ 컴퓨터 차례 ]");
				
				do {			//랜덤 인덱스 선택
				
					randomRow = rand.nextInt(3);
					randomColumn = rand.nextInt(3);
					
				}while(game[randomRow][randomColumn] != ' ');
				
			
				game[randomRow][randomColumn] = 'X';
				whoseturnofGame = true;
				
				
				
				
			}
			
			// 00 01 02
			// 10 11 12
			// 20 21 22			
			
//			 * [X][X][O]			//row = 1 
//			 * [ ][O][ ]			//row = 2
//			 * [ ][ ][ ]			//row = 3
			
			// 승자 있는지 확인하기
			
			// 양 옆, 위 아래 확인
			//row 먼저 확인
			if ((game[0][0] == game[0][1] && game[0][1] == game[0][2])) whoseWinner = game[0][0];
			else if ((game[1][0] == game[1][1] && game[1][1] == game[1][2])) whoseWinner = game[1][0];
			else if ((game[2][0] == game[2][1] && game[2][1] == game[2][2])) whoseWinner = game[2][0];
			else if ((game[0][0] == game[1][0] && game[1][0] == game[2][0])) whoseWinner = game[0][0];			
			else if ((game[0][1] == game[1][1] && game[1][1] == game[2][1])) whoseWinner = game[0][1];			
			else if ((game[0][2] == game[1][2] && game[1][2] == game[2][2])) whoseWinner = game[0][2];	
			else if ((game[0][0] == game[1][1] && game[1][1] == game[2][2])) whoseWinner = game[0][0];	
			else if ((game[0][2] == game[1][1] && game[1][1] == game[2][0])) whoseWinner = game[0][2];	
			
				
							
			if (whoseWinner != ' ') break;
			
		
		}
		
		
		if (whoseWinner == 'O') System.out.println("승자는 [사용자 P1]입니다"  );
		else if (whoseWinner == 'X') System.out.println("승자는 [컴퓨터]입니다"  );
		
		
	}
		
}
