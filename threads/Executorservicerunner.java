package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executorservicerunner {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Myrun()));

    }
}
