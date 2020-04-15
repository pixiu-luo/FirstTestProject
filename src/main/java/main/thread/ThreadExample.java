package main.thread;

public class ThreadExample {

    static Thread thread = null;
    public static boolean running = true;
    static int flag = 0;

    public static void main(String[] args) throws InterruptedException {
        traditional();
        Thread.sleep(1000);
        //interrupt()    这个方法 就是解阻塞  优雅的停止一个线程
        thread.interrupt();
        running = false;
    }

    public static void traditional() {
        thread = new Thread() {
            @Override
            public void run() {
                while (running) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        //解阻塞
                        e.printStackTrace();
                    }
                    System.out.println("_________");
                }
            }
        };
    }


    public static void traditionalTwo() {
        thread = new Thread() {
            @Override
            public void run() {
                while (running) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        //解阻塞
                        e.printStackTrace();
                    }
                    System.out.println("_________");
                }
            }
        };
    }

    /**
     * 指令重排
     */
    public static void aa() {
        Integer i = 1;
        i.toString();
    }

}
