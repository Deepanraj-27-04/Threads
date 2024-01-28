package profit_loss;



public class Sales extends Thread{
    Datas data = new Datas();
    Integer sum=0;
    Integer items;
    public Sales(int n)
    {
        this.items=n;
    }
    @Override
    public void run()
    {

        for(int i=0;i<this.items;i++)
            {
                System.out.println(" Enter the selling amount "+i+" :" );
                int sales=data.readSellAmount();
                sum+=sales;
            }
    }
}
