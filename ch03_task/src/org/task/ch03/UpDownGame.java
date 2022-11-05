package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	// 게임 리셋 여부 반환하는 메소드
//	public static String reset_game(String result) {
//	    System.out.print("게임을 다시 시작하겠습니까? (Yes or No) >> ");
//	    String result = scan.next();
//	    
//	    return result;
//	}
//	
	public static void my_test(String[] args) {
		
		int correct_num = 1 + rand.nextInt(100);
		int cnt = 5; //다섯번의 기회
		int min = 1;
		int max = 100;
		int userNum = 0;
		
		System.out.println("=================================================");
		System.out.println("기회는 5번!");
		System.out.printf("%d~%d까지의 랜덤하게 정해진 숫자를 맞춰보세용^______^\n", min, max);
		System.out.println("=================================================");
		
		
		while (cnt > 0) {
			System.out.println();
			// userNum 입력
			System.out.printf("%d~%d 사이의 정수를 입력하세요 >> ", min, max);
			userNum = scan.nextInt();
			
			// 입력 범위 내에 숫자가 입력되었는지 확인
			while(!(userNum >= min && userNum <= max)) {
				System.out.println("입력 숫자가 범위를 벗어났습니다. 다시 입력하세요!");
				System.out.printf("%d~%d 사이의 정수를 입력하세요 >> ", min, max);
				System.out.println();
				userNum = scan.nextInt();
			}
			
			// userNum이 a보다 작을 경우
			if (correct_num > userNum) {
				System.out.println("땡땡땡!! 숫자가 작아요!! UP!");
				System.out.println();
				min = userNum;
			}
			
			// userNum이 a보다 클 경우
			else if (correct_num < userNum) {
				System.out.println("땡땡땡!! 숫자가 커요!! DOWN!");
				System.out.println();
				max = userNum;
			}
			
			// 정답을 맞췄을 경우
			else if (correct_num == userNum) {
				System.out.println("정답입니다~!");
				System.out.printf("정답 : %d, 내가 말한 숫자 : %d", correct_num, userNum);
				System.out.println();
//				
//				// 정답을 맞추고 또 게임을 하고 싶으면?
//				String reset = reset_game();
//				
//				// yes or no 입력을 안했을 경우
//				while(!(reset.equals("Yes") || reset.equals("No"))) {
//					System.out.println("Yes 또는 No를 입력해주세요!");
//					System.out.print("Yes or No? >> ");
//					reset = scan.next();
//				}
//				if (reset.equals("Yes")) {
//					// 초기화
//					cnt = 6;
//					min = 1;
//					max = 100;
//					userNum = 0;
//				} else {
//					break;
//				}
			}
			// cnt - 1
			cnt--;
			
			// 5번의 도전 기회를 다 사용했을 경우
			if (cnt == 0) {
				System.out.println("입력 기회를 모두 잃었습니다.");
				System.out.print("다시 도전하시렵니까? (Yes or No) >> ");
				String reset = scan.next();
				System.out.println();
				
				// yes or no 입력 안했을 경우!
				while(!(reset.equals("Yes") || reset.equals("No"))) {
					System.out.println("Yes 또는 No를 입력해주세요!");
					System.out.print("Yes or No? >> ");
					reset = scan.next();
				}
				if (reset.equals("Yes")) {
					// 초기화
					cnt = 5;
					min = 1;
					max = 100;
					correct_num = 1 + rand.nextInt(100);
					userNum = 0;
				} else {
					break;
				}
			}
			// 기회가 몇번 남았는지 출력
			else {
				System.out.printf("--- %d번의 기회가 남았습니다! ---", cnt);
			}
		}
		// 끝~!
		System.out.println("수고하셨습니다. 다음에 또 도전하러 오세요! See you!");
	}
	

	public static void main(String[] args) {
	    int min = 1, max = 100;
        int sysNum = min + rand.nextInt(max);
        int userNum = 0;
        int cnt = 5;
        
        System.out.println("시스템이 번호를 선택했습니다!");
        while(cnt>0) {
            System.out.printf("%d ~ %d 사이 값 입력하세요 : ", min,max);
            userNum = scan.nextInt();
            while((userNum<min) || (userNum>max)) {
                System.out.println("범위 초과~~");
                System.out.printf("다시 사용자 입력(%d ~ %d 사이)", min, max);
            }
           
            // 비교
            if (sysNum == userNum) {
                System.out.println("빙고!!");
                break;
            } else {
                if (userNum > sysNum) {
                    System.out.println("너무 큽니다.");
                    max = userNum-1;
                } else {
                    System.out.println("너무 작습니다.");
                    min = userNum+1;
                }
            } cnt--;
            System.out.println("기회는 " + cnt + "회 남았습니다.");
        }
        if(cnt==0) {
            System.out.println("기회를 모두 소진했습니다.");
        }
        
        // 재시도 여부
        String yn = "y";
        System.out.println("재시도 하겠습니까? (y/n) : ");
        yn =scan.next();
        while(!("y".equals(yn)|| "n".equals(yn))) {
            System.out.println("y또는 n만 입려하세요.");
            System.out.print("재시도 하겠습니까? (y/n) : ");
            yn = scan.next();
        }
        if("y".equals(yn)) {
            System.out.println("게임을 재실행 합니다.");
            main(null); // 재귀호출
        } else {
            System.out.println("See you:)");
        }
            
    }
	
}
