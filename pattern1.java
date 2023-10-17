import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        int i,j,k;
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the number of rows for triangle: ");  
    int n= sc.nextInt();  
    for(i=n;i>=1;i--){
		    for(j=1;j<=n-i;j++){
                     System.out.print("*");
		    }
		    for(k=1;k<=n;k++){
		        System.out.print(" ");
		}
		 System.out.println("");
	    }
    }
    
}
