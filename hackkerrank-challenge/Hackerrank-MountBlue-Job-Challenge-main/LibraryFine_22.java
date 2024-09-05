package MountBlue_2;

import java.util.Scanner;

public class LibraryFine_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //returned date day, month and year
        int d1 = input.nextInt();
        int m1 = input.nextInt();
        int y1 = input.nextInt();

        //due date day, month and year
        int d2 = input.nextInt();
        int m2 = input.nextInt();
        int y2 = input.nextInt();

        int ans = libraryFine(d1, m1, y1, d2, m2, y2);
        System.out.println(ans);
    }

    static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2){

        if(y1 > y2){
            return 10000;
        }

        if(y1 == y2){
            if((m1 == m2) && (d1 > d2)){
                return 15 * (d1 - d2);
            }
            else if(m1 > m2){
                return 500 * (m1 - m2);
            }
        }

        return 0;
    }

}
