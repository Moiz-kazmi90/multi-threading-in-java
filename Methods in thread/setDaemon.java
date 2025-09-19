class myThread extends Thread {
    public void run() {
        while (true) {
            System.out.println("hello world");
        }
    }
}

public class setDaemon {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.setDaemon(true);
        t1.start();
        System.out.println("main done");
    }
}
