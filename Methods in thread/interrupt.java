class myThread extends Thread {
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("error");
        }

    }
}

public class interrupt {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
        t1.interrupt();
    }
}
