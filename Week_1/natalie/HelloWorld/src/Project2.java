/**
 * Comments are nice to explain what the class is/what is it for
 */
import java.util.*;
public class Project2{
    
	public static void main(String[] args){
            long S = 0;
            ArrayList<Integer> fibonacci = new ArrayList<Integer>();
            fibonacci.add(1);
            fibonacci.add(2);
            for (int i = 2; i <= 200; i++){
                fibonacci.add( fibonacci.get(i-1)+fibonacci.get(i-2));
            }
            /*for (int i = 0; i <=fibonacci.size(); i++){
            if(i % 2 == 0 ){
                S=S+i;
            }
            else{
                S = S+0;
            }
        }
            System.out.println(S);
            */
            for (int i = 0; i <=fibonacci.size(); i++){
            System.out.println( fibonacci.get(i) );
            }
}
		

}