package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler10 {
    public static void main(String[] args)
    {
        int num = 0;
        long primeSum = 0;
        
        while(num < 2000000)
        {
            num++;
            if(isPrime(num))
            {
                primeSum += num;
            }
        }
        System.out.println(primeSum);
    }
    
    public static boolean isPrime(long n) {
        if (n <= 3) {
            return n > 1;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= n; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
