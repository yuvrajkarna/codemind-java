import java.util.*;
class ss{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j!=i) System.out.printf("x");
                else System.out.printf("0");
            }
            System.out.println();
        }
    }
}