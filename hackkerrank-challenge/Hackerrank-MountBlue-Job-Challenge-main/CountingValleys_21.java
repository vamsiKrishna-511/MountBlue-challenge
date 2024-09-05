package MountBlue_2;

import java.util.Scanner;

public class CountingValleys_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String str = input.next();

        int ans = countingValleys(str, n);
        System.out.println(ans);
    }

    static int countingValleys(String str, int n){
        int count = 0;
        int altitude = 0;

        for (int i = 0; i < n; i++) {
            if(str.charAt(i) == 'U'){
                //the nest step is U and if the altitude is -1 it means the hiker coming back to the sea level from down it means he complete the valley 1
                
                if(altitude == -1){
                    count++;
                }
                altitude++;
            }

            if(str.charAt(i) == 'D'){
                altitude--;
            }
        }

        return count;
    }
}

/*
1. if the step is u then we increase the altitude by 1
2. if the step is D then we decrease the altitude by 1
3. when the the altitude is -1 before the step U then increase the count by 1 as A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and ending with a step up to sea level.
 */