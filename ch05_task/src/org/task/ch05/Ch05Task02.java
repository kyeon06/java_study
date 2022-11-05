package org.task.ch05;

class IPTV extends ColorTV {
	private String address;
	
	public IPTV(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	public void printProperty() {
		System.out.println("나의 IPTV는 " + address + " 주소의 " + super.getSize() + "인치 " + super.getColor() + "컬러");
	}
}

public class Ch05Task02 {

	public static void main(String[] args) {
		// 192.1.1.2 주소에 32인치, 2048 컬러
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
