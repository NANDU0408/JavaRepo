import java.util.Scanner;

class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Pascal's triangle: ");
        int n = scanner.nextInt();
        scanner.close();

        int[][] pascalTriangle = new int[n][n];

        for (int i = 0; i < n; i++) {
            
            pascalTriangle[i][0] = 1;
            pascalTriangle[i][i] = 1;

            
            for (int j = 1; j < i; j++) {
                pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }

        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("   "); 
            }
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", pascalTriangle[i][j]);
            }
            System.out.println();
        }
    }
}
