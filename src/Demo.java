public class Demo {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();

        System.out.println("Thread created! State: " + customThread.getState());

        customThread.start();

        try {
            Thread.sleep(1000);
            customThread.stopp(); // stopping thread t1
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread State: " + customThread.getState());

    }
}
