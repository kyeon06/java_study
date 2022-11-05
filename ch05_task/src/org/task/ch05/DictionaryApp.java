package org.task.ch05;


abstract class PairMap {
	protected String keyArray [];
	protected String valueArray [];
	abstract String get(String key);
	abstract void put(String key, String value);
	
	abstract String delete(String key);
	
	abstract int length();
}

class Dictionary extends PairMap {
	
	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
	}

	@Override
	String get(String key) {
		for ( int i = 0 ; i < keyArray.length ; i++) {
			// equals 사용할 때 앞에 무조건 값 있는걸로 넣기.... 오류있음,, nullpointer,,,,짜증....
			if (key.equals(keyArray[i])) {
				return valueArray[i];
			}
		}
		return null;
	}
	
	int getIdx(String key) {
		int idx = -1;
		for ( int i = 0 ; i < keyArray.length ; i++) {
			if (key.equals(keyArray[i])) {
				idx = i;
			}
		}
		return idx;
	}

	@Override
	void put(String key, String value) {
		if (get(key) == null) {
			keyArray[length()] = key;
			valueArray[length()-1] = value;
		}
		else {
			valueArray[getIdx(key)] = value;
		}
	}

	@Override
	String delete(String key) {
		String value = "";
		for ( int i = 0 ; i < keyArray.length ; i++) {
			if (key.equals(keyArray[i])) {
				value = valueArray[i];
				keyArray[i] = null;
				valueArray[i] = null;
			}
		}
		return value;
	}
	

	@Override
	int length() {
		int cnt = 0;
		for ( int i = 0; i < keyArray.length ; i++) {
			if (!(keyArray[i] == null)) {
				cnt++;
			}
		}
		return cnt;
	}
}


public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
//		System.out.println(dic.get("황기태"));//dic.get("황기태");
		dic.put("황기태", "자바");
		dic.put("이재문", "파이썬");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값은 " + dic.get("이재문"));
		System.out.println("황기태의 값은 " + dic.get("황기태"));
		
		dic.delete("황기태");
		System.out.println("황기태의 값은 " + dic.get("황기태"));
	}

}
