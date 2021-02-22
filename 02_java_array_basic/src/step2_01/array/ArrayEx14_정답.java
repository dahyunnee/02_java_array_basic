package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 숫자이동[1단계]
 * 
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 단, 좌우 끝에 도달했을 때, 예외처리를 해야한다.
 * 
 * @) 정답을 보지않고 소스를 동작시켜 본뒤에 내용을 이해하고 코드를 작성할 것
 * 
 */

//2021.02.18 20:37 ~ 21:54
public class ArrayEx14_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] game = {0, 0, 2, 0, 0, 0, 0};
		int player = 0;
		
		
		for (int i=0; i<7; i++) {
			if (game[i] == 2) {
				player = i;
			}
		}
		
		System.out.println(Arrays.toString(game));
		
		do {
			
			System.out.print("1 또는 2를 입력하세요 : ");
			int selectedDirection = scan.nextInt();
			
			if (selectedDirection == 1) {	//왼쪽으로 한칸 이동
				
				if (player >= 0) {
				
					game[player] = 0; 
					player--;
				}
				
			}
			
			else if (selectedDirection == 2) {
				
				if (player < game.length) {
				
					game[player] = 0; 
					player ++;
				}
				
			}
			else {
				
				System.out.println("잘못 입력하셨습니다. ");
			}
			
			
			//캐릭터 위치 이동
			if (player < 0 && selectedDirection == 1) {
				
				System.out.println("더 이상 왼쪽으로 가실 수 없습니다.");
				player = 0;
				
				
			}
			
			else if (player >= game.length && selectedDirection == 2) {
				
				System.out.println("더 이상 오른쪽으로 가실 수 없습니다.");
				player = game.length - 1;
				
			}
			
			else {
				
				game[player] = 2;
				System.out.println(Arrays.toString(game));
			}
			
			System.out.println();
			
			
		}while(true);
		
		
				
	}
	
}
