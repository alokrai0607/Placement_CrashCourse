package Day01Assignment;

public class StringConcatenationPerformance {
	public static void main(String[] args) {

		long startTime = System.nanoTime();
		String concatenatedString = "";
		for (int i = 0; i < 10000; i++) {
			concatenatedString += "a";
		}
		long endTime = System.nanoTime();
		long durationWithString = endTime - startTime;
		System.out.println("Time taken with String concatenation: " + durationWithString + " nanoseconds");

		startTime = System.nanoTime();
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			stringBuilder.append("a");
		}
		endTime = System.nanoTime();
		long durationWithStringBuilder = endTime - startTime;
		System.out.println("Time taken with StringBuilder: " + durationWithStringBuilder + " nanoseconds");

		startTime = System.nanoTime();
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < 10000; i++) {
			stringBuffer.append("a");
		}
		endTime = System.nanoTime();
		long durationWithStringBuffer = endTime - startTime;
		System.out.println("Time taken with StringBuffer: " + durationWithStringBuffer + " nanoseconds");
	}
}
