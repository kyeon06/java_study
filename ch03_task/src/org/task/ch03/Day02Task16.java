package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class Day02Task16 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
	public static void main(String[] args) {
	    System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
	    
	    
	    while(true) {
	        
	        System.out.print("가위 바위 보! >> ");
	        String my_rsp = scan.next();
	        String rsp_list[] = {"가위", "바위", "보"};
	        int com_rsp = rand.nextInt(3);
	        
	        if (my_rsp.equals("그만")) {
	            System.exit(0); 
	        }
	        
	        if (my_rsp.equals(rsp_list[com_rsp])) {
	            System.out.printf("사용자 = %s, 컴퓨터 = %s, 비겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	        }

	        if(rsp_list[com_rsp].equals("가위")) {
	           if (my_rsp.equals("바위")){
	               System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.\n", my_rsp, rsp_list[com_rsp]);
	     
	           } else if (my_rsp.equals("보")) {
	               System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	           }
	        } else if (rsp_list[com_rsp].equals("바위")) {
	            if (my_rsp.equals("보")){
	                   System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	           } else if (my_rsp.equals("가위")) {
	               System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	           }
	        } else if (rsp_list[com_rsp].equals("보")) {
	            if (my_rsp.equals("가위")){
	                System.out.printf("사용자 = %s, 컴퓨터 = %s, 사용자가 이겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	            } else if (my_rsp.equals("바위")) {
	                System.out.printf("사용자 = %s, 컴퓨터 = %s, 컴퓨터가 이겼습니다.\n",my_rsp, rsp_list[com_rsp]);
	            }  
	        }
	    }

     }
	    
	}


