package org.task.ch05;

class Km2Mile extends Converter{
	public Km2Mile(double mile) {
		ratio = mile;
	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		return "Km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
}

public class Ch05Task04 {
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6); // 1∏∂¿œ¿∫ 1.6km
		toMile.run();
	}
}
