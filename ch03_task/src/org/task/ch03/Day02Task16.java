package org.task.ch03;

import java.util.Random;
import java.util.Scanner;

public class Day02Task16 {
    static Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
	public static void main(String[] args) {
	    System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
	    
	    
	    while(true) {
	        
	        System.out.print("���� ���� ��! >> ");
	        String my_rsp = scan.next();
	        String rsp_list[] = {"����", "����", "��"};
	        int com_rsp = rand.nextInt(3);
	        
	        if (my_rsp.equals("�׸�")) {
	            System.exit(0); 
	        }
	        
	        if (my_rsp.equals(rsp_list[com_rsp])) {
	            System.out.printf("����� = %s, ��ǻ�� = %s, �����ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	        }

	        if(rsp_list[com_rsp].equals("����")) {
	           if (my_rsp.equals("����")){
	               System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.\n", my_rsp, rsp_list[com_rsp]);
	     
	           } else if (my_rsp.equals("��")) {
	               System.out.printf("����� = %s, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	           }
	        } else if (rsp_list[com_rsp].equals("����")) {
	            if (my_rsp.equals("��")){
	                   System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	           } else if (my_rsp.equals("����")) {
	               System.out.printf("����� = %s, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	           }
	        } else if (rsp_list[com_rsp].equals("��")) {
	            if (my_rsp.equals("����")){
	                System.out.printf("����� = %s, ��ǻ�� = %s, ����ڰ� �̰���ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	            } else if (my_rsp.equals("����")) {
	                System.out.printf("����� = %s, ��ǻ�� = %s, ��ǻ�Ͱ� �̰���ϴ�.\n",my_rsp, rsp_list[com_rsp]);
	            }  
	        }
	    }

     }
	    
	}


