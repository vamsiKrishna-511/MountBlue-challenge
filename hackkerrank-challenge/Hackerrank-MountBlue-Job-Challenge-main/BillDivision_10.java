package MountBlue_01;

import java.util.Scanner;

public class BillDivision_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // number of items ordered
        int k = input.nextInt(); // 0-based index of the item that Anna did not eat

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int chargedMoney = input.nextInt();
        bonAppetit(arr, k, chargedMoney);
    }

    static void bonAppetit(int[] arr, int k, int chargeMoney){
        // first will find the total cost of shared items and store int a variable called actualPrize that anna has to pay
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == k){
                continue;
            }
            sum += arr[i];
        }

        // Now we have the actual amount of shared item will find the Anna's share simpy just dividing the sum by 2
        int actualPrice = sum / 2;

        // If chargedMoney and actualPrice is same that means Anna did not overcharge then will simply print  the Bon Appetit else we will print the amount Brain owed to the Anna that is (chargedMoney - actualPrice)
        if(chargeMoney == actualPrice){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(chargeMoney - actualPrice);
        }
    }

}
