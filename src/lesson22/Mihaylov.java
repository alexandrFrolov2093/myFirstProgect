package lesson22;

public class Mihaylov extends Thread {
    @Override
    public void run() {
        while (true){
            synchronized (Monitors.MICROFON){
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 2; i++) {
                System.out.println("---fa");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.MICROFON){
                Monitors.MICROFON.notify();
            }
        }

    }
}
