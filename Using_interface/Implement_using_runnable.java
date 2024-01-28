package Using_interface;
public class Implement_using_runnable  implements Runnable{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
            System.out.println("runnable "+i);
    }
}
