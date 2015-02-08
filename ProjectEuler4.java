package projecteuler;

import java.util.ArrayList;

/**
 *
 * @author jt
 */
public class ProjectEuler4 {
    public static void main(String[] args)
    {
        String num;
        int number;
        String numReversed;
        int largestNum = 0;
        
        for(int i=100; i<999; i++)
        {
            for(int j=100; j<999; j++)
            {
                number = i*j;
                num = String.valueOf(number);
                numReversed = new StringBuilder(num).reverse().toString();
                if (num.equals(numReversed))
                {
                    if(largestNum < Integer.parseInt(num))
                    {
                        largestNum = Integer.parseInt(num);
                    }
                }
            }
        }
        System.out.println(largestNum);
    }
}
