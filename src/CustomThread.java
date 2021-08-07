public class CustomThread extends Thread {
    private boolean exit;

    public CustomThread() {
        this.exit = false;
    }

    public void run() {
        System.out.println("Thread started! State: " + this.getState());
        int i = 0;
        while (!exit) {
            System.out.println(i);
            i++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Oops! Thread stopped!");
    }

    public void stopp() {
        exit = true;
    }
}
