package MountBlue_2;

import java.util.*;

public class ElectronicsShop_31 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int b = input.nextInt(); // budget
        int n = input.nextInt(); // length of keyboards
        int m = input.nextInt(); // length of usbs

        int[] keyBoards = new int[n];
        for(int i = 0; i < n; i++){
            keyBoards[i] = input.nextInt();
        }

        int[] usb = new int[m];
        for(int i = 0; i < m; i++){
            usb[i] = input.nextInt();
        }

        int ans = getMoneySpent(keyBoards,usb,b);
        System.out.println(ans);
    }

    static int getMoneySpent(int[] keyBoards, int[] usb, int b){
        int ans = -1;
        for(int i = 0; i < keyBoards.length; i++ ){
            int temp = 0;
            for(int j = 0; j < usb.length; j++){
                temp = keyBoards[i] + usb[j];
                if(temp <= b && temp > ans){
                    ans = temp;
                }
            }
        }

        return ans;
    }
}

/*
ALGORITHM
1. Initialzed a ans varible to -1 because if it is not possible to buy both the items we will return -1
2. take 2 for loops, first for keyboard and second for usbs
3. initialized a temp variable to 0 after first for loop, this will use to store the addition of keyboard and usb at every index
4. assign a keyboard + usb value to temp
5. check if its less than the budget && shold be less than the prevous ans that is most expensive keyboard and usb
    we have to check that temp should be less than or equal to budget else if budget is temp is more than budget we will not able to buy
6. if its true then update ans value to temp
7. at last return the ans variable

*/
