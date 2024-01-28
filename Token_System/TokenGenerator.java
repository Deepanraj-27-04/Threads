package Token_System;

public class TokenGenerator extends Thread {
    private static int token = 0;

    @Override
    public void run() {
       generateToken1(); 
    //    generateToken2();
        
    }
    public synchronized void generateToken1()
    {
        token++;
        System.out.println(token+" "+" is genrated");
    }
    public  void generateToken2()
    {
        synchronized(this){
        token++;
        }
        System.out.println(token+" "+" is genrated");
    }
}


