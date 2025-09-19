class myThread extends Thread {
    public void run() {

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}

public class join {

    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread();
        t1.start();
        t1.join();
        System.out.println("hello");
    }
}
