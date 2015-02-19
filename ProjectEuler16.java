package projecteuler;
import java.math.BigInteger;
/**
 *
 * @author jt
 */
public class ProjectEuler16 {
    
    public static void main(String[] args) {
        
        BigInteger twoThousand = BigInteger.valueOf(2);
        String s = ""+twoThousand.pow(1000);
        int sum = 0;
        
        for(int i=0; i<s.length(); i++) {
            sum += Character.digit(s.charAt(i), 10);
        }
        System.out.println(sum);
    }
}