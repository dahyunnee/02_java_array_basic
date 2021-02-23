package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx24_테스트문제1_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 문제 13) 아래 배열 l과 m을 비교해서 둘의 합이 짝수 일때만 n에 저장 	
		// 예) n = {74,82,0,0,0}
		int[] l = { 10, 20, 30, 40, 50 };
		int[] m = { 13, 54, 17, 42, 1 };
		int[] n = { 0,0,0,0,0};
		
		int indexofN = 0;
		
		for (int i = 0; i < n.length; i++) {
			
			if ( (l[i] + m[i]) % 2 == 0) {
				
				n[indexofN ++ ] = l[i] + m[i];
				
			}
		}
		
		System.out.println(Arrays.toString(n));
		System.out.println();
				
		// 문제 14) 아래는 시험결과 이다. 시험에 합격한 사람의 번호만 win에 저장 (60점이상 합격)
		int[] num = { 1001, 1002, 1003 };
		int[] score = { 50, 83, 78 };
		int[] win = { 0,0,0 };
		// 예) win[3]= {1002, 1003, 0};
		
		int indexofWin = 0;
		
		for (int i = 0; i < score.length; i++) {
			
			if (score[i] >= 60) {
					
				win[indexofWin ++ ] = num[i];
			}
		}
		
		System.out.println(Arrays.toString(win));
		System.out.println();
				
		// 문제 15) 아래는 시험결과 이다 시험에 합격한 사람의 번호만 win2에 저장 (60점이상 합격)
		int[] data = { 1001, 80 , 1002, 23, 1003 , 78 };
		int[] win2 = { 0,0,0 };
		// 예) win2[3] = {1001, 1003, 0};
		
		int indexofWin2 = 0;
		
		for (int i = 0; i < data.length / 2; i ++) { // i = 0, 1 , 2
			// 1 3 5
			
			if(data[i*2 + 1] >= 60) win2[indexofWin2 ++] = data[2*i];
			
		}
		
		System.out.println(Arrays.toString(win2));
		System.out.println();
		
		// 문제 16) 아래 배열 o 에서 내가 입력한 값만 빼고p 에 저장 
		int[] o = { 10,20,30,40,50 };
		int[] p = { 0,0,0,0,0 };
		// 예) 30 ==> p = {10,20,40,50,0};
		
		int inputIndex = -1;
		boolean isExist = false;
		int indexofP = -1;
		
		p = o;
		
		while ( !isExist ) {
			
			System.out.print("값을 입력하세요 => ");
			int inputNumber = scan.nextInt();
			
			for (int i = 0; i < p.length; i++) {
				
				if ( o[i] == inputNumber ) {
					
					inputIndex = i;
					indexofP = inputIndex;
					isExist = true;
					
					break;
				}
				
			}
			
			if (inputIndex == -1) {
				
				System.out.println("o 배열 안에서 입력하세요");
				continue;
			}
			
			// index = 0 -> 1~4 : 4
			// 1 -> 2~4 : 3
			// 2 ->  3~4 : 2
			// 3 : 1
			// 4: x
			if (inputIndex != 4) {
				
				for (int i = inputIndex; i < o.length - 1 ; i++) {
					
					p[indexofP ++ ] = o[i+1];

				}
				
				p[p.length - 1] = 0;
			}
			
			else{
				
				p[inputIndex] = 0;
			}

			
		}
		
		System.out.println(Arrays.toString(p));
		System.out.println();
		
		isExist = false;
		
		// 문제 17) 아래 배열 q에서 내가 입력한 번호만 빼고 다른 번호와 값을 r 에 저장 
		int[] q = { 1001, 40, 1002, 65, 1003,  70 }; // inputINdex = 0, 2  4
		int[] r = { 0,0,0,0,0,0 };						
														// 4    2    0
		// 예) 1002 ==> r = {1001, 40, 1003, 70 , 0, 0};
		
		int inputIndex2 = -1;
		int indexofR = 0;
	
		
		while ( !isExist ) {
			
			System.out.print("번호를 입력하세요 => ");
			int inputNumber = scan.nextInt();
			
			for (int i = 0; i < q.length; i += 2) {
				
				if ( q[i] == inputNumber ) {
					
					inputIndex2 = i;
					isExist = true;
					
					
					break;
				}
			}
			
			if (inputIndex2 == -1) {
				
				System.out.println("다시 입력하세요");
				continue;
			}
			
			//값 저장
	
			for (int i = 0; i < q.length; i++) {
				
				if (i != inputIndex2) r[indexofR++] = q[i];
				else break;
				
			}
			
			for (int j = inputIndex2 ; j < q.length - 2; ++ j) {
				
				r[indexofR ++] = q[j + 2]; 
				
				
			}
			
			
		
		}
		
		System.out.println(Arrays.toString(r));
		System.out.println();
		
		
		// 문제 18) 
		int[] arr = {10,20,30,40,50};
		int[] s = new int[5];
		
		// 숫자를 5개 입력받고 arr 배열안에 입력한값이 있을때마다 
		// s배열안에 해당 값의 인덱스를 차례대로 저장할려고 한다. 
		// 조건) 만약에 입력한 숫자가 arr에 없으면 인덱스 대신 -1 저장 
		
		// 예) 10, 20, 10, 1, 50
		//  s = { 0, 1, 0, -1, 4}
		
		// 예)  30, 40, 1, 10, 2
		// s = { 2, 3, -1, 0, -1}
			
		
		int indexofS = 0;
		
		for (int i = 0; i < s.length; i++) {
			
			int inputIndex3 = -1;
			
			System.out.print("숫자를 입력하세요 => ");
			int inputNumber = scan.nextInt();
			
			for (int j = 0; j < arr.length; j++) {
				
				if (arr[j] == inputNumber ) inputIndex3 = j;
			}
			
			if (inputIndex3 == -1) {
				
				s[indexofS ++] = -1;
			}
			else {
				
				s[indexofS ++] = inputIndex3;
			}
			
		}
		
		
		System.out.println(Arrays.toString(s));
		System.out.println();
	}

}
