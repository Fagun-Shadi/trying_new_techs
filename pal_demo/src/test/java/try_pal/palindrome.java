package try_pal;

import java.util.Scanner;

public class palindrome {
    public static boolean ispal(String s) {
        int i;
        //System.out.println("________");
        for(i=0;i<s.length()/2;i++) {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println("Enter the string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "", small="", big="";
        String[] s_arr = new String[s.length()];
        //char c[s.length()];
        int var=0, i, cw=0;
        s = s + " ";
        //System.out.println("-----" + s);
        for(i=0; i<s.length(); i++)
        {
            if(s.charAt(i)!=' ') {
                t = t + s.charAt(i);
            }
            else {
                s_arr[var] = t;
                var++;
                t = "";
            }

        }

        //System.out.print(":::::");

        //System.out.println(var);
        for(i=0;i<var;i++) {
            if(ispal(s_arr[i])) {
                if(cw==0) {
                    cw++;
                    small = s_arr[0];
                    big = s_arr[0];
                }
                else {
                    if(small.length()>s_arr[i].length()) {
                        small = s_arr[i];
                    }
                    if(big.length()<s_arr[i].length()) {
                        big = s_arr[i];
                    }
                }

            }
        }

        System.out.println("Smallest palindrome is: " + small);
        System.out.println("Biggest palindrome is:" + big);

    }
}
