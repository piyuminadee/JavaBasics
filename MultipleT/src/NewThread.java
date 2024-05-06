public class NewThread implements Runnable {
    String name;
    Thread t;

    public NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread:" + t);
    }

    @Override
    public void run() {
        try {
            for (int i=5; i>0; i--){
                System.out.println("Name: "+t.getName()+" "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name +"Exiting");
    }
}
