package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 1 to 50[1단계] : 1 to 4
 * 
 * 1. arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
 * 2. 사용자는 가장 작은수 1부터(다음은 2) 순서대로 해당 위치 값을 입력한다.
 * 3. 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
 
 * 예)
 * [ 4 2 3 1 ]
 * 
 * 입력 : 3  (가장 작은수 1이 3번째에 위치 )
 * 4 2 3 9
 * 입력 : 1  ( 그 다음으로 작은 수 2가 1번째에 위치 )
 * 4 9 3 9
 * 입력 : 2  ( 그 다음으로 작은 수 3이 2번째에 위치 )
 * 4 9 9 9
 * 입력 : 0  ( 그 다음으로 작은 수 4가 0번째에 위치 )
 * 9 9 9 9
 * 
 * 코드 종료
 */


//2021.02.19 19:28 ~ 19:49
public class ArrayEx16_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int[] arr = new int[4];
		boolean[] isCheck = new boolean[4];
		
		int indexNumber = 0;
		int smallnumberinIndex = 1;
		
		//isCheck 배열 초기화
		for (int i = 0; i < isCheck.length; i++) {
			
			isCheck[i] = false;
		}
		
		
		
		//arr 배열 생성
		
		while ( indexNumber < 4 ) {		//arr이 다 채워질 때 까지 반복.
			
			int randomNumber = rand.nextInt(4) + 1 ;
			
			if ( isCheck[randomNumber - 1] == false) {		//randomNumber가 arr 배열에 존재하지 않는 경우
				
				arr[indexNumber] = randomNumber;
				isCheck[randomNumber - 1] = true;
				
				indexNumber ++;
			}
			
		}
		
		
		System.out.println("배열을 기억하고 작은 수의 인덱스 값 부터 입력하세요 : ");
		System.out.println(Arrays.toString(arr));
		System.out.println("정답일 경우 해당 인덱스의 숫자가 9로 바뀌어 보입니다.");
		
		
		
		while(true) {		//게임 진행.
			
			System.out.println();
			System.out.print(smallnumberinIndex + "가 몇 번째에 인덱스에 있는지 입력하세요 => ");
			int inputAnswer = scan.nextInt();
			
			if ( arr[inputAnswer] == smallnumberinIndex) {
				
				arr[inputAnswer] = 9;
				System.out.println("정답입니다. 바뀐 배열은 " + Arrays.toString(arr) + "입니다.");
				
				smallnumberinIndex ++;
			}
			
			else {
				
				System.out.println("오답입니다. 다시 시도하세요.");
				continue;
			}
			
			if (smallnumberinIndex == 5) break;
			
			
		}
		
		
		System.out.println("수고하셨습니다.");
		
		
	}
	
}
