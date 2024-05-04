public class Main {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: "+t);
        t.setName("My Thread");
        System.out.println("After Name Chnaged: "+t);
        try{
            for (int i=0; i<5; i++){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupt");
            throw new RuntimeException(e);
        }
    }
}