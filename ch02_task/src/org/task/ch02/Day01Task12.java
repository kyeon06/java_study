package org.task.ch02;

import java.util.Scanner;

public class Day01Task12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("¿¬»ê>>");
		float n1 = scanner.nextFloat();
		String operator = scanner.next();
		float n2 = scanner.nextFloat();
		float result = 0;
		
		// µ¡¼À
		if (operator.equals("+")) {
			result = n1 + n2;
			
		}
		// »¬¼À
		else if (operator.equals("-")) {
			result = n1 - n2;
			
		}
		// °ö¼À
		else if (operator.equals("*")) {
			result = n1 * n2;
			
		}
		// ³ª´°¼À
		else if (operator.equals("/")) {
			if (n2 != 0)
				result = n1 / n2;
			else
				System.out.println("0À¸·Î ³ª´­ ¼ö ¾ø½À´Ï´Ù.");
		}
		
		// °á°ú Ãâ·Â
		System.out.printf("%.0f%s%.0fÀÇ °è»ê °á°ú´Â %.1f", n1, operator,n2, result);
		scanner.close();
		
	}
}
