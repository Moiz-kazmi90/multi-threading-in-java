class myThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("error");
            }
            System.out.println(i);
        }
    }
}

public class sleep {

    public static void main(String[] args) {
        myThread t1 = new myThread();
        t1.start();
    }
}
