public class pattern3 {
    public static void main(String[] args) {
        int rows = 5;
        int n=6;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <=n-i; ++j) { 
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) { 
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}