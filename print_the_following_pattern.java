import java.util.*;
class ji{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1 || j==1 || i==n || j==i){
                    System.out.printf("*");
                }
                else System.out.printf(" ");
            }
            System.out.println();
        }
    }
}