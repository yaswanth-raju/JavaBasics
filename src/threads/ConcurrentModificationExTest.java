package threads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class ConcurrentModificationExTest {
    public static void main(String[] args) {
//        Hashtable<String, Integer> hashtable = new Hashtable<>();
        ConcurrentHashMap<String, Integer> hashtable = new ConcurrentHashMap<>();
        hashtable.put("Key1", 1);
        hashtable.put("Key2", 2);
        hashtable.put("Key3", 3);
        AtomicBoolean exceptionCaught = new AtomicBoolean(false);

        Thread iteratorThread = new Thread(() -> {
            Iterator<String> it = hashtable.keySet().iterator();
            try {
                while (it.hasNext()) {

                    System.out.println("value"+ it.next());
                    Thread.sleep(100);
                }
            } catch (ConcurrentModificationException e) {
                exceptionCaught.set(true);
                e.printStackTrace();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread modifierThread = new Thread(() -> {
            try {
                Thread.sleep(50);
                hashtable.put("Key4", 4);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        iteratorThread.start();
        modifierThread.start();

        try {
            iteratorThread.join();
            modifierThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(exceptionCaught.get());
    }
}
