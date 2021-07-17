package models;

public abstract class MyThread implements Runnable{

    private Thread thread;
    private boolean isExecute;
    public MyThread() {
        thread = new Thread(this);
    }

    public void start(){
        thread.start();
    }
    public void stop(){
    }

    public void pause(){

    }

    public void reStart(){

    }

    public abstract void executeTask();

    @Override
    public void run() {
        while (isExecute){
            executeTask();
        }

    }
}
