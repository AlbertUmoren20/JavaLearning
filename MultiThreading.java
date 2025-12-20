// Is the ability of a program to execute multiple threads simultaneously. Each thread runs a separate path of execution within the same program.
//Two methods to create threads in Java:
//1. Extending the Thread class
//2. Implementing the Runnable interface


public class MultiThreading extends Thread {
    private int threadNumber;

    public MultiThreading(int threadNumber){
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + " from Thread " + threadNumber);
        }    
        // if (threadNumber == 3) {
        //     throw new RuntimeException();
        // }
        try{
            Thread.sleep(1000); // Pause for 1000 milliseconds
        }
        catch (InterruptedException e){
            System.out.println("Thread " + threadNumber + " interrupted.");
    
    }

    }
public static void main (String [] args){
    MultiThreading t1 = new MultiThreading(1);  
    MultiThreading t2 = new MultiThreading(2);
    MultiThreading t3 = new MultiThreading(3);
    MultiThreading t4 = new MultiThreading(4);
    MultiThreading t5 = new MultiThreading(5);

    t1.start();
    t2.start();
    t3.start();
    t4.start(); 
    t5.start();

  

}
    
}


