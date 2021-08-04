public class CustomThread extends Thread{

    @Override
    public synchronized void start() {
        super.start();
    }

    @Override
    public void run() {
        super.run();
    }

    public void stopp(){
        try {int a = 4/0;}
        catch (ArithmeticException e){
            System.out.println("Terminating...");
        }
    }
}
