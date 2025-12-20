public class MultiThreadingRunnable implements Runnable {
    private int threadNumber;

    public MultiThreadingRunnable(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " from Thread " + threadNumber);
        }    
        try{
            Thread.sleep(1000); // Pause for 1000 milliseconds
        }
        catch (InterruptedException e){
            System.out.println("Thread " + threadNumber + " interrupted.");
    
    }

    } {
    
}}
