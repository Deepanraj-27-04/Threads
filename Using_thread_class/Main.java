package Using_thread_class;
public class Main{
    public static void main(String[] args) {
        Notepad n= new Notepad();
        n.start();
        Chrome c= new Chrome();
        c.start();
        try {
           n.join(); 
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        for(int i=0;i<10;i++)
            System.out.println("in the main"+i);
    }
}