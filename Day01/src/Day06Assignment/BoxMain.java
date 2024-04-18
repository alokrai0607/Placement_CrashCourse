package Day06Assignment;

class Box<T> {
	private T object;

	public void set(T object) {
		this.object = object;
	}

	public T get() {
		return object;
	}
}

public class BoxMain {

	public static void main(String[] args) {

		Box<Integer> integerBox = new Box<>();

		integerBox.set(10);

		int intValue = integerBox.get();

		Box<String> stringBox = new Box<>();

		stringBox.set("Hello");

		String stringValue = stringBox.get();

		System.out.println("Integer value: " + intValue);

		System.out.println("String value: " + stringValue);
	}

}
