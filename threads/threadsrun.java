package threads;

class Task1 extends Thread
{
    public void run()
    {
        System.out.println("Task1 started");
        for(int i=0;i<10;i++)
        {
            System.out.print(i+" ");
            // System.out.println("");
        }
        System.out.println("");
        System.out.println("Task 1 done");

    }
}
class Myrun implements Runnable
{

    @Override
    public void run() {
        for(int i=10;i<20;i++)
        {
            System.out.print(i+" ");
            // System.out.println("");
        }
        System.out.println("");
        System.out.println("Task2 End");

    }
}

public class threadsrun {
    public static void main(String[] args) throws InterruptedException {
        //task1
        System.out.println("Task1 Kicked");
        Task1 task1=new Task1();
       task1.setPriority(1);
        task1.start();

       // System.out.println("Task1 Kicked");
        //task2
        System.out.println("Task2 Kicked");
        Myrun task2=new Myrun();
        Thread thread=new Thread(task2);
        thread.setPriority(10);
        thread.start();
      //  task1.join();
       // thread.join();
        System.out.println("Task 3 Started");
        for(int i=20;i<30;i++)
        {
            System.out.print(i+" ");
            // System.out.println("");
        }
        System.out.println("");
        System.out.println("Task 3 End");

    }
}

