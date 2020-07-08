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

        SummingThread t1 = new SummingThread(100);
        SummingThread t2 = new SummingThread(1000);
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println("t1 result is " + t1.getSum());
        System.out.println("t2 result is " + t2.getSum());
        
        Thread.sleep(3000);
        
        System.out.println("Done!");
    }
    
}
