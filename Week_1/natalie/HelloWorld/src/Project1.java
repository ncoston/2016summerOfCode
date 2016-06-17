/**
 * Comments are nice to explain what the class is/what is it for
 */
public class Project1{
    
	public static void main(String[] args){
            int S = 1;
		for(int i = 0; i<1000; i++){
                    if (i % 3 == 0){
                        S = S+i;
                        
                    }
                    else if (i % 5 == 0){
                        S = S+i;
                    }
                    else {
                        S = S+0;
                    }
		}
                System.out.println(S);
	}
}