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
			// equals ����� �� �տ� ������ �� �ִ°ɷ� �ֱ�.... ��������,, nullpointer,,,,¥��....
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
//		System.out.println(dic.get("Ȳ����"));//dic.get("Ȳ����");
		dic.put("Ȳ����", "�ڹ�");
		dic.put("���繮", "���̽�");
		dic.put("���繮", "C++");
		System.out.println("���繮�� ���� " + dic.get("���繮"));
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
		
		dic.delete("Ȳ����");
		System.out.println("Ȳ������ ���� " + dic.get("Ȳ����"));
	}

}
