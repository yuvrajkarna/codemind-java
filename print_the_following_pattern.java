import java.util.*;
class ass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.printf(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==n || j==1)
                System.out.printf("*");
                else System.out.printf(" ");
            }
            System.out.println();
        }
            
    }
}