package Day01Assignment;

public class MultiThreadedAlphabetAppender {
    public static void main(String[] args) {
        StringBuffer sharedBuffer = new StringBuffer();

        Thread thread1 = new Thread(new AlphabetAppender(sharedBuffer, 'A', 'Z'));
        Thread thread2 = new Thread(new AlphabetAppender(sharedBuffer, 'a', 'z'));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final content:\n" + sharedBuffer.toString());
    }

    static class AlphabetAppender implements Runnable {
        private final StringBuffer buffer;
        private final char startChar;
        private final char endChar;

        public AlphabetAppender(StringBuffer buffer, char startChar, char endChar) {
            this.buffer = buffer;
            this.startChar = startChar;
            this.endChar = endChar;
        }

        @Override
        public void run() {
            for (char c = startChar; c <= endChar; c++) {
                synchronized (buffer) {
                    buffer.append(c);
                }
            }
        }
    }
}

