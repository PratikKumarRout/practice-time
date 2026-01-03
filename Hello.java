// challenge 1
public class Hello {

    public static void main(String[] args) {
        SlowThread thread1 = new SlowThread();
        thread1.start();
        System.out.println("Main thread is done.");
    }
}

class SlowThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Background Count: " + i);
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted.");
            }
        }
    }
}