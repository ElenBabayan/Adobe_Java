package com.aca.week10.Class18;

import java.util.Random;
import java.util.concurrent.*;

public class FutureMain {
    // 5 vrk sleep , returns random number, print in Mainthread
    // execService , submit , future ic get

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                Thread.sleep(5000);
                throw new IllegalStateException("not valid state"); // throws Execution exception
                // RETHROW another exception, try catch
            //    return new Random().nextInt();
  
            }
        });

        System.out.println("point1");
        System.out.println(future.get()); //get y blocking call a, join methodn el hwi
        System.out.println("point2");
        executorService.shutdown();
    }
}


/*
docker ps

docker exec -it *id* bash

docker run -p 6666:5432 postgres:9.6.12


 */