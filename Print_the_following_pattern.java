import java.util.*;
class ass{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.printf(j+" ");
            }
            System.out.println();
        }
    }
}