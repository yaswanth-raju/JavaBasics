package threads;

public class SimpleDeadLock {
    public static void main(String[] args) {
        new SimpleDeadLock().deadLock();

    }
    String str1="Hello Good Morning";
    String str2="Have your breakfast?";

    private void deadLock() {
        Runnable thread1=()->{
                synchronized (str1){
                    System.out.println("Thread 1 locks str1");
//                    try {
//                        Thread.sleep(50);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    synchronized (str2){
                        System.out.println("Thread 1 locks str2");
                    }
                }
        };
        Runnable thread2=()->{
                synchronized (str2){
                    System.out.println("Thread 2 locks str2");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str1){
                        System.out.println("Thread 2 locks str1");
                    }
                }
        };

        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
