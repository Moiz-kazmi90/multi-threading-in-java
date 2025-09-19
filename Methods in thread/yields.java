class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}

public class yields {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}
