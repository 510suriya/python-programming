import java .util.*;
public class composite{
      public static void main(String[] args){
            Scanner s=new Scanner(System.in);
            int m=0,ct=0;
            int n=s.nextInt();
            m=n/2;
            if(n==0||n==1)
            {
                   System.out.println("yes");
            }else{
            for(int i=2;i<=m;i++){
                  if(n%i==0){
                        System.out.println("yes");
                        ct=1;
                        break;
                  }
            }
            if(ct==0)
                   System.out.println("no");
                  
            }
      }
}
