class myThread extends Thread {

    public myThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 0; i < 5; i++) {
            String a = "";
            for (int j = 0; j < 1000; j++) {
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " : " + "priority: "
                    + Thread.currentThread().getPriority() + " : "
                    + "count:  " + i);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                System.out.println("error");
            }
        }

    }
}

public class setpriority {

    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread("low thread");
        myThread t2 = new myThread("medium thread");
        myThread t3 = new myThread("high thread");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
