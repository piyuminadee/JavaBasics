public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        NewThread nt1 = new NewThread("one");
        NewThread nt2 = new NewThread("two");
        NewThread nt3 = new NewThread("three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread exiting");
    }
}