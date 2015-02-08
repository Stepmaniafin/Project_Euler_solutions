package projecteuler;

/**
 *
 * @author jt
 */
public class ProjectEuler5 {
    public static void main(String[] args)
    {
        boolean all = false;
        int luku = 1;
        int falses = 0;
        while (!all)
        {
            luku++;
            for(int i=1; i<=20; i++)
            {
                if(luku % i == 0)
                {
                    all = true;
                }
                else falses++;
            }
            if (falses > 0) all = false;
            falses = 0;
            //System.out.println(luku);
        }
        System.out.println(luku);
    }
}
