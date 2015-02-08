package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler9 {
    public static void main(String[] args)
    {
        int lower = 1;
        int higher = 2;
        int a = 0;
        int b = 0;
        int c = 0;
        
        for(higher = 2; higher < 300; higher++)
        {
            for(lower = 1; lower < higher; lower++)
            {
                a = (int) (Math.pow(higher, 2) - Math.pow(lower, 2));
                b = 2 * higher * lower;
                c = (int) (Math.pow(higher, 2) + Math.pow(lower, 2));
                
                if(a+b+c == 1000)
                {
                    System.out.println(a + " " + b + " " + c);
                }
            }
        }
    }
}
