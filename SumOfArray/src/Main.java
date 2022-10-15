import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] A= new int[3][3];
        int[][] B=new int[3][3];
        int[][] sum=new int[3][3];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers of A[][] array :");
        for (int i=0; i< A.length; i++) {
            for (int j = 0; j < A.length; j++) {
               A[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter numbers of B[][] array :");
        for (int i=0; i< B.length; i++) {
            for (int j = 0; j < B.length; j++) {
                B[i][j]=sc.nextInt();
            }
        }
// sum of array
        for (int i=0; i< A.length; i++) {

            for (int j = 0; j < B.length; j++) {
               sum[i][j]=A[i][j]+ B[i][j];
            }
        }

        // display sum of array
        System.out.println("The sum of A[][] and B[][] is ");
        for (int i=0; i< A.length; i++) {

            for (int j = 0; j < B.length; j++) {
                System.out.print(sum[i][j]+",");
            }
            System.out.println(" ");
        }
    }
}