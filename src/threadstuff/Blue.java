
package threadstuff;


public class Blue implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println("Blue: " + i);
        }
    }
    
}
