package lesson22;

public class Buskov extends Thread {
    private boolean stop = false;

    @Override
    public void run() {
        int count = 0;
        while (!stop) {
            for (int i = 0; i < 3; i++) {
                System.out.println("-------la");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if(count == 4){
                stop = true;
            }
            synchronized (Monitors.MICROFON) {
                Monitors.MICROFON.notify();
            }
            synchronized (Monitors.MICROFON) {
                try {
                    Monitors.MICROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
