package threads;

import java.util.Objects;

public class MyThread implements Runnable{
    MyObject obj;
    public MyThread(MyObject obj){
        this.obj = obj;
    }

    @Override
    public void run(){

        /*int delay =(int)Math.random()*2000;
        for (int i = 0; i < 3; i++){
            System.out.println("Новый поток: " + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }*/


        synchronized (obj){
            obj.x = 0;
            for (int i = 0; i < 5; i++){
                obj.x++;
                System.out.println(Thread.currentThread()+"obj.x" + obj.x);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
