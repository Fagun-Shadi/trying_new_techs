import java.util.Scanner;

public class inv2 {
    public static int determ( int[][] arr){
        int det=0;
        det = arr[0][0]*arr[1][1] - arr[0][1]*arr[1][0];
        return det;
    }
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int [][] arr2 = new int[3][3];
        int i, j, det;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        det = determ(arr);

        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                if (i == j && i==0) {

                    System.out.print(((arr[1][1]/ (float)det) + " "));
                }
                else if (i==j && i==1){
                    System.out.print((arr[0][0]) / (float)det + " ");
                }

                else{
                    System.out.print(((arr[i][j]-2*arr[i][j] + " ")));
                }
            }

            System.out.println();
        }



    }


}
