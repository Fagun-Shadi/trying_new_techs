import java.util.Scanner;

public class try_inverse {
    public static float determ( float[][] arr){
        float det=0;
        int i, j;
        for(i=0; i<3; i++)
        {
            for(j=0; j<3; j++)
            {
                det = det + (arr[0][i] * (arr[1][(i+1)%3] * arr[2][(i+2)%3] - arr[1][(i+2)%3] * arr[2][(i+1)%3]));
            }
        }
        return det;
    }
    public static void main(String[] args) {
        float[][] arr = new float[3][3];
        float [][] arr2 = new float[3][3];
        int i, j;
        float det;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements: ");

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                arr[i][j] = sc.nextFloat();
            }
        }

        det = determ(arr);
        if(det==0){
            System.out.println("Not Possible");
        }
        else {
            for (i = 0; i < 3; ++i) {
                for (j = 0; j < 3; ++j)
                    arr2[i][j] = (arr[(j + 1) % 3][(i + 1) % 3] * arr[(j + 2) % 3][(i + 2) % 3] - (arr[(j + 1) % 3][(i + 2) % 3] * arr[(j + 2) % 3][(i + 1) % 3])) / det;
            }

            for (i = 0; i < 3; i++) {
                for (j = 0; j < 3; j++) {
                    System.out.print(arr2[i][j] + " ");
                }
                System.out.println("");
            }
        }


    }


}
