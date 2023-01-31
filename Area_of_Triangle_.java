import java.util.*;
class sample{
    public static void main(String args[]){
        Scanner mySc=new Scanner(System.in);
        float a=mySc.nextFloat();
        float b=mySc.nextInt();
        float c=mySc.nextInt();
        float s=(a+b+c)/2;
        float ans=s*(s-a)*(s-b)*(s-c);
        System.out.printf("%.2f",Math.sqrt(ans));
    }
}