package Valid_Number;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 1234567890123L
    public boolean validNumber(long number)
    {
        List<Long> digits=getDigit(number);
        System.out.println(digits);
        if(digits.size()<13 || digits.size()>16)
            return false;
        if(digits.get(0)<4 && digits.get(0)>6)
            return false;
        
        long oddSum=sumodd(digits);
        System.out.println(oddSum);
        long evenSum=sumeven(digits);
        System.out.println(evenSum);
        long result=oddSum+evenSum;
        System.out.println(result);
        return (result%10==0)? true: false;    
    }
    List<Long>  getDigit(long number)
    {
        List<Long> list = new ArrayList<>();
        while(number!=0)
        {
            long rem=number%10;
            list.add(0,rem);
            number=number/10;

        }
        return list;
    }
    long sumodd (List<Long> list)
    {
        long sum=0;
        for(int i=list.size()-1;i>=0;i=i-2)
        {
            sum+=list.get(i);
        }


        return sum;
    }
    long sumeven(List<Long> list)
    {
        long sum=0;
        for(int i=list.size()-2;i>=0;i=i-2)
        {
           long temp=list.get(i)*2;
           if(temp>9)
            {
                sum=sum+getDIGIT(temp);
            }
            else
                sum=sum+temp;


        }


        return sum;
    }
    long getDIGIT(long number)
    {
        long sum=0;
        while(number!=0)
        {
            long rem=number%10;
            sum=sum+rem;
            number=number/10;

        }
        return sum;
    }


}
