package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler1 {

    
    public static void main(String[] args) {
        int sum = 0;
        for(int i=0;i<1000;i++)
        {
            if(i % 3 == 0 || i % 5 == 0)
            {
                sum += i;
                if(i < 100)
                {
                    System.out.println(sum);
                }
            }
        }
        System.out.println(sum);
    }
    
}
