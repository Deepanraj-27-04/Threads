package Using_interface;

public class Main {
    public static void main(String[] args) {
        Implement_using_runnable im = new Implement_using_runnable();
        Thread t = new Thread(im);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("runnable "+i);
        }
    }
}
