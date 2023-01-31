import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner myScn=new Scanner(System.in);
        float a=myScn.nextFloat();
        float b=myScn.nextFloat();
        float c=myScn.nextFloat();
        float s=(a+b+c)/2;
        
        float ans=s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(ans));
    }
}