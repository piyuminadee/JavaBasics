public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        NewThread n1 = new NewThread("one");
        NewThread n2 = new NewThread("one1");
        NewThread n3 = new NewThread("one2");

        n1.t.start();
        n2.t.start();
        n3.t.start();

        System.out.println("Thread one is alive:"+n1.t.isAlive());
        System.out.println("Thread one1 is alive:"+n2.t.isAlive());
        System.out.println("Thread one2 is alive:"+n3.t.isAlive());

        try {
            System.out.println("Waiting for t to finish");
            n1.t.join();
            n2.t.join();
            n3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");

            throw new RuntimeException(e);
        }
        System.out.println(("Thread 1 is alive:"+ n1.t.isAlive()));
        System.out.println(("Thread2 is alive:"+ n2.t.isAlive()));
        System.out.println(("Thread 3 is alive:"+ n3.t.isAlive()));

    }
}