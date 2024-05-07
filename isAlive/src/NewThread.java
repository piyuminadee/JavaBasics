public class NewThread implements Runnable {
    String name;
    Thread t;

    public NewThread(String name) {
        this.name = name;
        t = new Thread(this, name);
        System.out.println("New Thread:"+ t);
    }

    @Override
    public void run() {
          try {
              for(int i=0; i<5; i++){
                  System.out.println("Name"+ i);
                  Thread.sleep(1000);
              }
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
        System.out.println(name + "Exiting");
    }
}
