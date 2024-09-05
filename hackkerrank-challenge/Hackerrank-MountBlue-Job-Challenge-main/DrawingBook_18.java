package MountBlue_01;

import java.util.Scanner;

public class DrawingBook_18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int p = input.nextInt();

        int ans = pageCount(n, p);
        System.out.println(ans);
    }

    static int pageCount(int n, int p){
        int ans = 0;
//        return Math.min(p/2, (n/2 - p/2)); // this find the mininum of two value ans returns it

        // The front variable stores the number of turns required to reach the p, as each page has 2 sides other than the first and last page we calculate front = p/2
        // and from back , turn the pages from the back we have to substrack p/2 from n/2
        int front = p / 2;
        int back = n / 2 - p / 2;
        ans = Math.min(front, back);
        return ans;
    }
}

/*
1. initialize variables turns to count the number of turns we need to get to the target page
2. declare two variables front and back and store the numbers of turns it takes from front and back
3. compare the front and back value and store the smallest one in ans variable
4. return the ans
 */