package threadstuff;


// the goal for this thread is to sum the values between 1 and n, inclusive, 
// where n is a parameter to the thread

public class SummingThread extends Thread {
    
    private int n;
    private int sum;
    
    public SummingThread(int n) {
        this.n = n;
    }
    
    @Override
    //public int run(int n) { -- won't work, we must have the signature below
    public void run() {
        for (int i=1; i<= n; i++) {
            sum += i;
            
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
    
    public int getSum() {
        return sum;
    }
    
}
