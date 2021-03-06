package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler6 {
    public static void main(String[] args)
    {
        int sum = 0;
        int square = 0;
        
        for(int i = 1; i<=100; i++)
        {
            sum += Math.pow(i, 2);
            square += i;
        }
        square = (int) Math.pow(square, 2);
        System.out.println("Sum: "+sum+" Square: "+square);
        System.out.println(square-sum);
    }
}
