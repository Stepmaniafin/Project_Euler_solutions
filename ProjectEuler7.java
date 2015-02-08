package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler7 {
    public static void main(String[] args)
    {
        int nthPrime = 0;
        int luku = 0;
        while(nthPrime < 10001)
        {
            luku++;
            if(isPrime(luku))
            {
                nthPrime++;
            }
        }
        System.out.println(luku);
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
