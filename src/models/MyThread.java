package models;

public abstract class MyThread implements Runnable{

    private final Thread thread;
    private boolean isExecute;
    private long sleepTime;

    public MyThread() {
        thread = new Thread(this);
        sleepTime = 1000;
    }

    public void start(){
        isExecute = true;
        thread.start();
    }
    public void stop(){
    }

    public void pause(){

    }

    public void reStart(){

    }
    public void sleepThread(long time){
        this.sleepTime = time;
    }

    public abstract void executeTask();

    @Override
    public void run() {
        while (isExecute) {
            executeTask();
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
