package lesson21;

public class Main3 {
    public static void main(String[] args) {
        Thread.currentThread().setName("qwerty");
        Thread myThread2 = new Thread(new MyThread2());
        myThread2.start();
        for(int i = 0; i <= 10; i++){
            System.out.println(i + "----" + Thread.currentThread().getName());
            if(i == 2){
                MyThread myThread = new MyThread();
                myThread.start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
