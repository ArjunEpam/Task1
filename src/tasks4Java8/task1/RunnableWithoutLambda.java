package tasks4Java8.task1;

public class RunnableWithoutLambda {
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    public static void main2(String[] args) {
        Runnable myRunnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(myRunnable);
        thread.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
}
