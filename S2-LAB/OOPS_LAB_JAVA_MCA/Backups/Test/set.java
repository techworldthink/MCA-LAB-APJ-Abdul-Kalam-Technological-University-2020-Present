import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class set {
    public static void main(String []arg){
        String sentannce = "one two three one";
        String[] arrOfStr = sentannce.split(" ");
        Set<String> set = new HashSet<String>(Arrays.asList(arrOfStr));
        
        for(String i:set){
            System.out.println(i);
        }
        
    }
}
