package projecteuler;

import java.math.BigInteger;

/**
 *
 * @author jt
 */
public class ProjectEuler3 {
    public static void main(String[] args)
    {
        long max = 600851475143L;
        long prime = 1;
        while (prime<=max)
        {
            
            if(max % prime == 0)
            {
                System.out.println("prime: "+prime);
                for(long i=1;i<prime;i++)
                {
                    if(prime % i == 0)
                    {
                        System.out.println("i: "+i);
                    }    
                }
            }
            prime++;
        }
    }
}
