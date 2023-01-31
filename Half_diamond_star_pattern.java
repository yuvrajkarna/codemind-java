import java.util.*;
class h{
    public static void main(String args[]){
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<3) {
            System.out.println("The pattern is not possible");
        }
        else{
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.printf("*");
                }
                System.out.println();
            }
            for(int i=1;i<n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.printf("*");
                }
                System.out.println();
            }
        }
    }
}