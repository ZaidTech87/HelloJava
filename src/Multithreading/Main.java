package Multithreading;
import static java.lang.Thread.sleep;
class ChromeTab2 implements Runnable {
    public void run(){
        for(int i=0;i<6;i++){
            try{
                sleep(2);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }

            System.out.println("thired thread +"+i);
        }
    }
}

class chromeTab extends Thread{
    public void run(){
        for(int i=0;i<6;i++){

            System.out.println("zaid+"+i);
            try{
                sleep(2);
            }catch(InterruptedException e){
                throw new RuntimeException(e);
            }
        }
        //System.out.println("hello word");
    }


}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello World");

        chromeTab tab = new chromeTab();
        tab.start();
        Thread thread = new Thread(new ChromeTab2());

        thread.start();
        for(int i=0;i<6;i++){
            sleep(2);
            System.out.println("Main zaid+"+i);
        }
      thread.isAlive();

    }
}
