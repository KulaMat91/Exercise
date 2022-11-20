package org.example.Multithreading;
//Volatile - niestabilny
public class VolatileExample {
    public class VolatileCounter implements Runnable {
        private volatile Integer currentCount;

        public VolatileCounter() {
            this.currentCount = 1;
        }



        public void increaseTo(Integer target) {
            for (Integer i = 0; i < target; i++) {
                 currentCount++;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.printf("%s after increase: %d\n", Thread.currentThread().getName(), currentCount);
        }

        public void decreaseTo(Integer target){
            for (Integer i = 0; i < target; i++) {
                currentCount--;
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.printf("%s after decrease: %d\n",Thread.currentThread().getName(), currentCount);
        }

        @Override
        public void run() {
            increaseTo(100);
            decreaseTo(100);
        }
    }
}
