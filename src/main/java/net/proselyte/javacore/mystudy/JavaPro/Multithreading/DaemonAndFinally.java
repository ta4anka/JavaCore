package net.proselyte.javacore.mystudy.JavaPro.Multithreading;

public class DaemonAndFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread daemon = new Thread(runnable);
        daemon.setDaemon(true);
        daemon.start();
        Thread.sleep(20);
        System.out.println("Last non-daemon thread exits.");
    }
    //---------------------------------------------------------

    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Is alive");
                    Thread.sleep(10);
                }
            } catch (Throwable t) {
                t.printStackTrace();
            } finally {
                System.out.println("This will never be executed.");
            }
        }
    };

   //-----------------------------------------------------------
}

/*
    Is alive
    Is alive
    Last non-daemon thread exits.
    Is alive
*/
