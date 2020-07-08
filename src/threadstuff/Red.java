
package threadstuff;


public class Red extends Thread {
    
    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            System.out.println("Red: " + i);
                

        }
    }
    
}
