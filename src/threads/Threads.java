package threads;

public class Threads {
    public static void main(String[] args) {
        /*Thread t = new Thread(new MyThread());
        Thread t1 = new Thread(new MyThread());
        t.start();
        t1.start();*/
        /*long d = System.currentTimeMillis();
        double s = 0;
        Thread t = new Thread(()->{
            double s1 = 0;
            for (double i = 0; i < 1000000000; i++){
                s1+=i;
            }
        });
        Thread t1 = new Thread(()->{
            double s2 = 0;
            for (double i = 0; i < 1000000000; i++){
                s2+=i;
            }
        });
        Thread t2 = new Thread(()->{
            double s3 = 0;
            for (double i = 0; i < 1000000000; i++){
                s3+=i;
            }
        });
        t1.start();
        t2.start();
        if (t1.isAlive()) {
            if (t2.isAlive())
            try {
                t1.join();
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Время выполнени программы: " + (System.currentTimeMillis() - d));*/



        /*Thread t = new Thread(()->{
            System.out.println("New Thread " + Thread.currentThread());
            for (int i = 0; i < 5; i++){
                System.out.println("New Thread " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("New Thread " + Thread.currentThread());
        });
        t.setName("My Thread");
        t.setPriority(7);
        t.start();
        Thread.currentThread().setPriority(3);
        System.out.println(Thread.currentThread());*/

        /*MyObject obj = new MyObject();
        for (int i = 0; i < 5; i++){
            Thread temp = new Thread(new MyThread(obj));
            temp.start();
        }*/

        Thread t = new Thread(()->{
            int i = 0;
            while (true){
                System.out.println("секунд прошло " + i);
                i++;
                if(i ==3) break;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });
        t.setDaemon(true);
        t.start();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

