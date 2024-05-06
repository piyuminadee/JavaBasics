public class NewThread extends Thread{
    public NewThread() {
        super("Demo Thread");
        System.out.println("Child Thread: "+ this);
    }

    @Override
    public void run() {
        try {
            for (int i=0; i<5; i++){
                System.out.println("Child thread:"+i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("Child Thread intterruoted");
        }
        System.out.println("Child thread exiting");

    }
}
