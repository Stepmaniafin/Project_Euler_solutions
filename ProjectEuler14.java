package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler14 {
    public static void main(String[] args)
    {
        long longestCollatzSequence = 2;
        long sequence;
        long number;
        for (long i = 2; i<1000000; i++)
        {
            sequence = 0;
            number = i;
            while(number != 1)
            {
                if(number % 2 == 0) number=number/2;
                else number = number*3+1;
                sequence++;
            }
            if(sequence > longestCollatzSequence)
            {
                longestCollatzSequence = sequence;
                System.out.println(i);
            }
        }
        System.out.println(longestCollatzSequence);
    }
}
