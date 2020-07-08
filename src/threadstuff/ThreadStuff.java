package threadstuff;

public class ThreadStuff {

    public static void main(String[] args) throws InterruptedException {
        
//        Thread redThread = new Red();
//        Thread blueThread = new Thread(new Blue());
//        
////        redThread.setPriority(5);
////        blueThread.setPriority(1);
//        
//        redThread.start();
//        blueThread.start();
//        
//        redThread.join();
//        blueThread.join();

        // Create two sample summing threads (these compute the sum of 
        // the integers from 1 to the value they are passed)
        SummingThread t1 = new SummingThread(100);
        SummingThread t2 = new SummingThread(1000);
        
        // Start up the threads
        t1.start();
        t2.start();
        
        // Join back to the threads when they've finished
        t1.join();
        t2.join();
        
        // print the results
        System.out.println("t1 result is " + t1.getSum());
        System.out.println("t2 result is " + t2.getSum());
        
        System.out.println("Done!");
    }
    
}
