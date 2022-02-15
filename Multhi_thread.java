public class  Multhi_thread implements Runnable {
 
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("This is thread " + i);
 
            try {
                Thread.sleep(2000);
                continue;
            } catch (InterruptedException ex) {
                System.out.println("I'm resumed");
            }
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println("this is join method" + i);
 
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                System.out.println("I'm about to stop");
                return;
            }
        }
    }
 
    public static void main(String[] args) {
        Thread t1 = new Thread(new  Multhi_thread());
        t1.start();
 
        try {
            Thread.sleep(5000);
            t1.interrupt();
 
        } catch (InterruptedException ex) {
        	System.out.println("I'm resumed");
        }
        Thread t2 = new Thread(new  Multhi_thread ());
        t2.start();
 
        try {
 
            t2.join();
 
        } catch (InterruptedException ex) {
        }
 
        System.out.println("I'm " + Thread.currentThread().getName());
    }
 
}
