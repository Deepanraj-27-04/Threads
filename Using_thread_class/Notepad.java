package Using_thread_class;
public class Notepad extends Thread {
    @Override
    public void run()
    {
        for(int i=0;i<10;i++){
            System.out.println("process in Notepad "+i);
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
    }
}

 class Chrome extends Thread {
@Override
public void run()
{
    for(int i=0;i<10;i++)
        System.out.println("process in chrome "+i);
}
}
