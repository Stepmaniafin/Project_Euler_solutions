package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler2 {
    public static void main(String[] args)
    {
        int fibonacci = 1;
        int fibonacciold = 0;
        int fibonaccitemp = 0;
        int sum = 0;
        
        while (fibonacci <= 4000000)
        {
            fibonacci += fibonaccitemp;
            fibonaccitemp = fibonacciold;
            fibonacciold = fibonacci;
            
            if(fibonacci % 2 == 0)
            {
                sum += fibonacci;
                //System.out.println(sum);
            }
        }
        System.out.println(sum);
    }
}
