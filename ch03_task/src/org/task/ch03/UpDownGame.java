package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	
	// ���� ���� ���� ��ȯ�ϴ� �޼ҵ�
//	public static String reset_game(String result) {
//	    System.out.print("������ �ٽ� �����ϰڽ��ϱ�? (Yes or No) >> ");
//	    String result = scan.next();
//	    
//	    return result;
//	}
//	
	public static void my_test(String[] args) {
		
		int correct_num = 1 + rand.nextInt(100);
		int cnt = 5; //�ټ����� ��ȸ
		int min = 1;
		int max = 100;
		int userNum = 0;
		
		System.out.println("=================================================");
		System.out.println("��ȸ�� 5��!");
		System.out.printf("%d~%d������ �����ϰ� ������ ���ڸ� ���纸����^______^\n", min, max);
		System.out.println("=================================================");
		
		
		while (cnt > 0) {
			System.out.println();
			// userNum �Է�
			System.out.printf("%d~%d ������ ������ �Է��ϼ��� >> ", min, max);
			userNum = scan.nextInt();
			
			// �Է� ���� ���� ���ڰ� �ԷµǾ����� Ȯ��
			while(!(userNum >= min && userNum <= max)) {
				System.out.println("�Է� ���ڰ� ������ ������ϴ�. �ٽ� �Է��ϼ���!");
				System.out.printf("%d~%d ������ ������ �Է��ϼ��� >> ", min, max);
				System.out.println();
				userNum = scan.nextInt();
			}
			
			// userNum�� a���� ���� ���
			if (correct_num > userNum) {
				System.out.println("������!! ���ڰ� �۾ƿ�!! UP!");
				System.out.println();
				min = userNum;
			}
			
			// userNum�� a���� Ŭ ���
			else if (correct_num < userNum) {
				System.out.println("������!! ���ڰ� Ŀ��!! DOWN!");
				System.out.println();
				max = userNum;
			}
			
			// ������ ������ ���
			else if (correct_num == userNum) {
				System.out.println("�����Դϴ�~!");
				System.out.printf("���� : %d, ���� ���� ���� : %d", correct_num, userNum);
				System.out.println();
//				
//				// ������ ���߰� �� ������ �ϰ� ������?
//				String reset = reset_game();
//				
//				// yes or no �Է��� ������ ���
//				while(!(reset.equals("Yes") || reset.equals("No"))) {
//					System.out.println("Yes �Ǵ� No�� �Է����ּ���!");
//					System.out.print("Yes or No? >> ");
//					reset = scan.next();
//				}
//				if (reset.equals("Yes")) {
//					// �ʱ�ȭ
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
			
			// 5���� ���� ��ȸ�� �� ������� ���
			if (cnt == 0) {
				System.out.println("�Է� ��ȸ�� ��� �Ҿ����ϴ�.");
				System.out.print("�ٽ� �����Ͻ÷ƴϱ�? (Yes or No) >> ");
				String reset = scan.next();
				System.out.println();
				
				// yes or no �Է� ������ ���!
				while(!(reset.equals("Yes") || reset.equals("No"))) {
					System.out.println("Yes �Ǵ� No�� �Է����ּ���!");
					System.out.print("Yes or No? >> ");
					reset = scan.next();
				}
				if (reset.equals("Yes")) {
					// �ʱ�ȭ
					cnt = 5;
					min = 1;
					max = 100;
					correct_num = 1 + rand.nextInt(100);
					userNum = 0;
				} else {
					break;
				}
			}
			// ��ȸ�� ��� ���Ҵ��� ���
			else {
				System.out.printf("--- %d���� ��ȸ�� ���ҽ��ϴ�! ---", cnt);
			}
		}
		// ��~!
		System.out.println("�����ϼ̽��ϴ�. ������ �� �����Ϸ� ������! See you!");
	}
	

	public static void main(String[] args) {
	    int min = 1, max = 100;
        int sysNum = min + rand.nextInt(max);
        int userNum = 0;
        int cnt = 5;
        
        System.out.println("�ý����� ��ȣ�� �����߽��ϴ�!");
        while(cnt>0) {
            System.out.printf("%d ~ %d ���� �� �Է��ϼ��� : ", min,max);
            userNum = scan.nextInt();
            while((userNum<min) || (userNum>max)) {
                System.out.println("���� �ʰ�~~");
                System.out.printf("�ٽ� ����� �Է�(%d ~ %d ����)", min, max);
            }
           
            // ��
            if (sysNum == userNum) {
                System.out.println("����!!");
                break;
            } else {
                if (userNum > sysNum) {
                    System.out.println("�ʹ� Ů�ϴ�.");
                    max = userNum-1;
                } else {
                    System.out.println("�ʹ� �۽��ϴ�.");
                    min = userNum+1;
                }
            } cnt--;
            System.out.println("��ȸ�� " + cnt + "ȸ ���ҽ��ϴ�.");
        }
        if(cnt==0) {
            System.out.println("��ȸ�� ��� �����߽��ϴ�.");
        }
        
        // ��õ� ����
        String yn = "y";
        System.out.println("��õ� �ϰڽ��ϱ�? (y/n) : ");
        yn =scan.next();
        while(!("y".equals(yn)|| "n".equals(yn))) {
            System.out.println("y�Ǵ� n�� �Է��ϼ���.");
            System.out.print("��õ� �ϰڽ��ϱ�? (y/n) : ");
            yn = scan.next();
        }
        if("y".equals(yn)) {
            System.out.println("������ ����� �մϴ�.");
            main(null); // ���ȣ��
        } else {
            System.out.println("See you:)");
        }
            
    }
	
}
