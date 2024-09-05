package MountBlue_2;

import java.util.Scanner;

public class SaveThePrisoner_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for (int i = 0; i < t; i++) {
            int n = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();
            System.out.println(saveThePrisoner(n, m, s));
        }
    }

    static int saveThePrisoner(int n, int m, int startIndex){
        // failing some test cases due to timeOut
//        // take a variable to store the ans
//        int ans = 0;
//        // startIndex and treats in temp if its less than or equal to the prisoners it mean we need to warn ans - 1 prisoner
//        int temp = startIndex + m;
//        if(temp <= n){
//            ans = temp - 1;
//        }
//        else{
//            // if temp is less than prisoner then we assign startIndex to ans and run a for loop till from 1 to treats as 1st treat is already given
//            ans = startIndex;
//            for (int i = 1; i < m; i++) {
//                // we will increment the ans by 1 and if ans is greater than prisoner it and there are still treats left ot distribure we assign ans to 1 as again distribution starts from 1 that is distribution is going on in circular
//                ans++;
//                if(ans > n){
//                    ans = 1;
//                }
//            }
//        }
//        return ans;


        //We start off at some random prisoner S and try to distribute M candies. So we could just do S + M to see which prisoner we end up at. However, we may have more candies than prisoners,
        // so we loop back around to the first prisoner by doing the % N where N is number of prisoners.
        //ach +1 and -1 that you see in the equation is to fix the off-by-one problems that exist since prisoners are counted from 1 to N while modular arithmetic is counted from 0.
        //
        int ans = ((m - 1) + (startIndex - 1)) % n + 1 ;
        return ans;

    }
}
/*

 */