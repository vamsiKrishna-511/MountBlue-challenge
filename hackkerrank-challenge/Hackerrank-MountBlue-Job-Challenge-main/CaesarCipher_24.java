package MountBlue_2;

import java.util.Scanner;

public class CaesarCipher_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // the size string
        String str = input.next();
        int k = input.nextInt(); //  the alphabet rotation factor

        String ans = caesarCipher(str, k);
        System.out.println(ans);
    }

    public static String caesarCipher(String str, int k) {
        // works fine but failing some test cases when we submit the code
        char[] ans = new char[str.length()]; // new char array to store the encrypted message
        k = k % 26; // this was the reason why my test cases were failing
        for(int i = 0; i <str.length(); i++){

            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){

                if( (str.charAt(i) + k) > 90 ){
                    ans[i] = (char) ((str.charAt(i) - 26) + k); // if in case if we pass the end of the alphabet while ecrypting just e.g z+2, then rotating back to first alphabet i.e a - this is for capital
                }
                else{
                    ans[i] = (char) (str.charAt(i) + k);
                }

            }else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){

                if( (str.charAt(i) + k) > 122 ){
                    ans[i] = (char) ((str.charAt(i) - 26) + k); // this is for small letters
                }
                else{
                    ans[i] = (char) (str.charAt(i) + k);
                }

            }else{
                ans[i] = str.charAt(i);
            }
        }

        String s = new String(ans); // converting char array to string
        return s;


    }

}
