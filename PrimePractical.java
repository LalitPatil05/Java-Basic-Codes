import java.util.*;
public class PrimePractical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int x,y;
        int flag;

        System.out.print("Enter the Range : ");
        N = sc.nextInt();

        for(x=1;x<=N;x++){
            if(x==0 || x==1)
                continue;
            
            flag = 1;

            for(y=2;y<=x/2;++y){
                if(x%y==0){
                    flag = 0;
                    break;
                }

            }

            if(flag == 1){
                System.out.print(x+",");
            }


            
        }
    }
}
