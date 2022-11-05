package org.task.ch05;

import java.util.Scanner;

// �߻� Ŭ����
abstract class Converter {
	abstract protected double convert(double src); // �߻� �޼ҵ�
	abstract protected String getSrcString();
	abstract protected String getDestString();
	protected double ratio; // ����
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println(getSrcString() + "��" + getDestString() + "�� �ٲߴϴ�.");
		System.out.print(getSrcString() + "�� �Է��ϼ��� >> ");
		
		double val = scan.nextDouble();
		double res = convert(val);
		
		System.out.println("��ȯ ��� : " + res + getDestString() + "�Դϴ�.");
		scan.close();
	}
}

class Won2Dollar extends Converter {
	
	public Won2Dollar(double dollar) {
		ratio = dollar;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "��";
	}

	@Override
	protected String getDestString() {
		return "�޷�";
	}
	
}


public class Ch05Task03 {

	public static void main(String[] args) {
		Won2Dollar toDollar = new Won2Dollar(1200); // 1�޷� 1200��
		toDollar.run();
	}

}
