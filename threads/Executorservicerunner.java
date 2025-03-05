package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class Task extends Thread {
    private final int num;

    public Task(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Task "+num+" started");
        for (int i = num * 10; i < num * 10 + 10; i++) {
            System.out.print(i + " ");
            // System.out.println("");
        }
        System.out.println("");
        System.out.println("Task "+num + " done");
    }
}

    public class Executorservicerunner {
        public static void main(String[] args) {
            ExecutorService executorService = Executors.newFixedThreadPool(2);
            executorService.execute(new Task(1));
            executorService.execute(new Task(2));
            executorService.execute(new Task(3));
            executorService.execute(new Task(4));


            executorService.shutdown();

        }
    }
