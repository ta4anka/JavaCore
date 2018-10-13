package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinDemo {
    static long numOfOperations = 10_000_000_000L;
    static int numOfThreads = Runtime.getRuntime().availableProcessors();


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ForkJoinPool pool = new ForkJoinPool(numOfThreads);
        System.out.println(pool.invoke(new MyFork(0, numOfOperations)));
        long finish = System.currentTimeMillis();
        System.out.println((finish - start)/1000 + " sec");
    }


    static class MyFork extends RecursiveTask<Long> {
        long from, to;

        public MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= numOfOperations / numOfThreads) {

                long sum = 0;
                for(long i = 0; i < numOfOperations; i++){
                    sum += i;
                }
                return sum;

            } else {
                long middle = (to + from) / 2;
                MyFork firstHalf = new MyFork(from, middle);
                firstHalf.fork();
                MyFork secondHalf = new MyFork(middle + 1, to);
                long secondValue = secondHalf.compute();
                return firstHalf.join() + secondValue;
            }
        }
    }
}

