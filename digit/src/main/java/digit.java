import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class digit {

        /*public static String ten_place(int[] c1){
            if(c1[1]==1 && c1[0]==0)
            {
                return("ten");
            }
            else if(c1)
        }*/
        public static void main(String[] args) {

            System.out.println("Enter the 4 digit number:");
            Scanner sc = new Scanner(System.in);
            String op = "";
            //char c1[] = new char[4];
            int[] c1 = new int[4];
            for(int i=3; i>=0; i--)
            {
                c1[i] = sc.nextInt();
            }
            //char [] c1 = sc.next().toCharArray();
            //c1[] = sc.next().charAt(2);
            //c1[1] = sc.next().charAt(1);
            //c1[0] = sc.next().charAt(0);

            Map<Integer, String> map1 = new HashMap<Integer, String>();
            map1.put(1, "one");
            map1.put(2, "two");
            map1.put(3, "three");
            map1.put(4, "four");
            map1.put(5, "five");
            map1.put(6, "six");
            map1.put(7, "seven");
            map1.put(8, "eight");
            map1.put(9, "nine");

            Map<Integer, String> map2 = new HashMap<Integer, String>();
            map2.put(1, "eleven");
            map2.put(2, "twelve");
            map2.put(3, "thirteen");
            map2.put(4, "fourteen");
            map2.put(5, "fifteen");
            map2.put(6, "sixteen");
            map2.put(7, "seventeen");
            map2.put(8, "eighteen");
            map2.put(9, "nineteen");

            Map<Integer, String> map3 = new HashMap<Integer, String>();
            map3.put(1, "ten");
            map3.put(2, "twenty");
            map3.put(3, "thirty");
            map3.put(4, "fourty");
            map3.put(5, "fifty");
            map3.put(6, "sixty");
            map3.put(7, "seventy");
            map3.put(8, "eighty");
            map3.put(9, "ninety");

            //System.out.println("----"+map1.get(c1[3]));
            op = op + map1.get(c1[3]) + " " + "thousand";

            if(c1[3]==0){
                System.out.println("Invalid");
            }

            if(c1[3]!=0 && c1[2]!=0 && c1[1]!=0 && c1[1]!=1 && c1[0]!=0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred" + " " + map3.get(c1[1]) + " " + map1.get(c1[0]);
            }
            else if(c1[3]!=0 && c1[2]!=0 && c1[1]!=0 && c1[1]!=1 && c1[0]==0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred" + " " + map3.get(c1[1]);
            }
            else if(c1[3]!=0 && c1[2]!=0 && c1[1]==0 && c1[0]==0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred";
            }
            else if(c1[3]!=0 && c1[2]!=0 && c1[1]==1 && c1[0]!=0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred" + " " + map2.get(c1[0]);
            }
            else if(c1[3]!=0 && c1[2]!=0 && c1[1]==1 && c1[0]==0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred" + " " + map3.get(c1[1]);
            }
            else if(c1[3]!=0 && c1[2]==0 && c1[1]!=0 && c1[1]!=1 && c1[0]!=0)
            {
                op = op + " " + map1.get(c1[2]) + " " + "Hundred" + " " + map3.get(c1[1]) + " " + map1.get(c1[0]);
            }
            else{
                System.out.println("Unable");
            }
            /*if (c1[0] == 0) {
                if (c1[1] == 0) {

                    op = op + " " + map1.get(c1[1]) + "hundred";

                } else {
                    op = op + " " + map1.get(c1[1]) + "hundred" + " " + map3.get(c1[1]);
                }
            }*/

            System.out.println(op);
        }
}
