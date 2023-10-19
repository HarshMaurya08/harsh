import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner my=new Scanner(System.in);
        System.out.println("enter the value of p,r,t");
        int p=my.nextInt();
        int r=my.nextInt();
        int t=my.nextInt();
        calculatesi(p, r, t );
        my.close();
    }


    public static void calculatesi(int x,int y,int z){
        int si;
        si=(x*y*z)/100;
        System.out.println("The calculated simple interest is:"+si);
    }
}
