package profit_loss;



public class Investment extends Thread {
    Integer  sum=0;
    Datas data= new Datas();
    Integer items;
    public Investment(int n)
    {
        this.items=n;
    }
    @Override
    public void run()
    {

        
        for(int i=0;i<this.items;i++)
            {
              
                System.out.println(" Enter the cost amount "+i+" :" );
                
                int invest=data.readCostAmount();
                sum+=invest;
            }
        
    }
}
