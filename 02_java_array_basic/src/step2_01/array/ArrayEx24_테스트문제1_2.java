package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// 문제 8) 아래 d에서 scanner로 내가 입력한 값만 빼고 e에 저장 
		int[] d = { 10,20,30,40,50 };
		int[] e = { 0,0,0,0,0 };
		// 예) 30 ==> e = {10,20,40,50,0};

	
		boolean isExist = false;
		
		do {
			
			System.out.print("배열에서 제외할 값을 입력하세요 => ");
			int exceptNumber = scan.nextInt();
			
			int indexofE = 0;
			
			for (int i = 0; i < d.length; i++) {
				
				if (exceptNumber != d[i]) {
					
					e[indexofE ++] = d[i];
				}

				if (i==d.length - 1) e[i] = 0;
			}
			
			if (indexofE == e.length) {
				
				System.out.println("해당 숫자가 배열에 존재하지 않습니다.");
				System.out.println();
			}
			else {
				
			
				System.out.println(Arrays.toString(e));
				isExist = true;
			}
			
		}while(isExist == false);
		
		
		System.out.println();
		isExist = false;
		
		
		// 문제 9) 아래 f에서 scanner로 내가 입력한 번호와 값을 빼고 d에 저장 
		int[] f = { 1001, 40, 1002, 65, 1003,  70 };	//look = 2
		int[] g = { 0,0,0,0,0,0 };						// g[0] = f[l + 2]
		// 예) 1002 ==> {1001, 40, 1003, 70 , 0, 0};
		
		
		int lookforValue = -1;
		int indexofG = 0;
		
		do {
			
			System.out.print("제외할 번호를 입력하세요 => ");
			int exceptNumber2 = scan.nextInt();
			
			for (int i = 0; i < f.length; i++) {
				
				if ( f[i] == exceptNumber2 ) {
					
					lookforValue = i;
					isExist = true;
					
					
					break;
				}
			}
			
			if (lookforValue == -1) {				// 배열에 입력한 값 존재하지 않는 경우
				
				System.out.println("해당 값은 존재하지 않습니다. ");
				continue;
			}
		
			for (int i = 0; i < f.length; i++) {
				
				if (i != lookforValue) g[indexofG++] = f[i];
				else break;
				
			}
			
			for (int j = lookforValue ; j < f.length - 2; ++ j) {
				
				g[indexofG ++] = f[j + 2]; 
				
				
			}
			
		
	
		}while(isExist == false); // while(!isExist);
		
		System.out.println(Arrays.toString(g));
		System.out.println();
		
		isExist = true;
		
		// 문제 10) 숫자를 하나 입력받고 아래 배열을 앞으로 하나씩 밀어낸후 맨뒤에 저장
		int[] h = { 10,20,30,40,50 };
		// 예)  60 ==> {20,30,40,50,60};
		
		
		System.out.print("숫자 하나를 입력하세요 => ");
		int inputNumber = scan.nextInt();
			
		for (int i = 0; i < h.length ; i++) {
				
			if ( i != h.length - 1) {
					
				h[i] = h[i+1];
			}
				
			else {
					
				h[i] = inputNumber;
			}
				
		}
	
		System.out.println(Arrays.toString(h));
		System.out.println();
		
		
		// 문제 11) 숫자를 하나 입력받고 아래 배열을 뒤로 하나씩 밀어낸후 맨 앞에 저장 
		int[] i = { 10,20,30,40,50 };
		// 예) 60 ==> {60,10,20,30,40};
		
		System.out.print("숫자 하나를 입력하세요 => ");
		int inputNumber2 = scan.nextInt();
		
		for (int j = i.length - 1; j >= 0; j--) {
			
			if (j != 0) {
				
				i[j] = i[j-1];
				
			}
			else i[j] = inputNumber2;
			
		}
		
		System.out.println(Arrays.toString(i));
		System.out.println();
		
	
		// 문제 12) 아래배열을 거꾸로 저장 
		int[] j = { 1,2,3,4,5 };
		int[] k = { 0,0,0,0,0 };
		//예) k => {5,4,3,2,1};

		// i : 0 -> k : 4
		// i : 1 -> k : 3
		// i :2 -> k: 2
		//i : 3 -> k :1
		//i:4 -> k:0
		
		for (int k2 = 0; k2 < k.length; k2++) {
			
			k[4 - k2] = j[k2];
			
		}
		
		System.out.println(Arrays.toString(k));
		System.out.println();
		
		
	}

}
