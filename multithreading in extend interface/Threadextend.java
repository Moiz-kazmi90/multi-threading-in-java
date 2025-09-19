class mythread extends Thread {
    public void run() {
        System.out.println("Thread chal raha hai");
    }
}

public class Threadextend {
    public static void main(String[] args) {
        mythread t1 = new mythread();
        t1.start();

    }
}
