class myRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class main {

    public static void main(String[] args) {
        Thread t1 = new Thread(new myRunnable());
        t1.start();
    }
}
