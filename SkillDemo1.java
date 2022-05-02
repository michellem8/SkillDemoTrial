
public class SkillDemo1 {

    public static boolean evenOrOdd(int n){

        boolean x = true;
        if (n%2 == 0){
            System.out.println(n + " is an even number!");
            x = true;
            
        }
        if (n%2 == 1){
            System.out.println(n + " is an odd number!");
            x = false;
            
        }
        
        return x;

    }

}
