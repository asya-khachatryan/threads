public class Demo {

    public static void main(String[] args) {
        CustomThread customThread = new CustomThread();

        System.out.println("Thread created! State: " + customThread.getState());
        customThread.start();
        System.out.println("Thread started! State: " + customThread.getState());
        customThread.stopp();
        System.out.println("Oops! Thread stopped! State: " + customThread.getState());

    }
}
