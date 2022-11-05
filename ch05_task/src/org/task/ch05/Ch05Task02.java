package org.task.ch05;

class IPTV extends ColorTV {
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("���� IPTV�� " + address + " �ּ��� " + super.getSize() + "��ġ " + super.getColor() + "�÷�");
	}
}

public class Ch05Task02 {

	public static void main(String[] args) {
		// 192.1.1.2 �ּҿ� 32��ġ, 2048 �÷�
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
