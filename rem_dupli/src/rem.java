import java.util.Scanner;

public class rem {
    public int trythis(int n) {
        return n;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of elements in the array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp[] = new int[n];
        int n_arr[] = new int[n];
        int c=0;

        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

            if(temp[arr[i]]==0){
                temp[arr[i]]++;
                n_arr[c] = arr[i];
                c++;
            }
        }
        System.out.println("Elements in the original array are:");
        for (int i=0; i<n; i++)
        {
            System.out.print(arr[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Hello There");
        System.out.println("Elements in the new array are:");
        for (int i=0; i<c; i++)
        {
            System.out.print(n_arr[i] + " ");
        }

    }

}
