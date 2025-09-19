class MyThread extends Thread {
    public void run() {
        System.out.println("Thread chal raha hai...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start(); // thread start hota hai
    }
}
