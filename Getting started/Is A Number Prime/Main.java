import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      for (int i=0; i<t; i++){
          int n = scn.nextInt();
          int cout = 0;
          for (int div =2 ; div*div <= n; div++){
              if (n%div ==0){
                  cout++;
                  break;
                }
            }
        
    
      
          if (cout == 0){
           System.out.println("prime");
            }else{
            System.out.println("not prime");
            }
        }
    }
}
