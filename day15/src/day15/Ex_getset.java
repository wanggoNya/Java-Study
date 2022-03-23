package day15;

public class Ex_getset {
	public static void main(String[] args) {
		
	}
}

class KeyValue<K, V>{
	private K key = null;
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	private V value = null;
	
}