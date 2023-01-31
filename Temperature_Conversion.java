import java.util.*;
class ConversionTemp{
    public static void main(String args[]){
        float cel;
        Scanner sc=new Scanner(System.in);
        cel=sc.nextFloat();
        float fr=32+(cel*9/5);
        System.out.printf("%.2f",fr);

    }
}