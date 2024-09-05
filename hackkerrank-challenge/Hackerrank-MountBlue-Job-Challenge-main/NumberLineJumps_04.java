package MountBlue_01;

import java.util.Scanner;

    public class NumberLineJumps_04 {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int pos1 = input.nextInt();
            int speed1 = input.nextInt();
            int pos2 = input.nextInt();
            int speed2 = input.nextInt();

            String ans = kangaroo(pos1, speed1, pos2, speed2);
            System.out.println(ans);

        }

        private static String kangaroo(int pos1, int speed1, int pos2, int speed2) {

            // When speed2 > speed1  i.e if the speed of kangaroo 2 is greater than kangaroo 1 then kangaroo 1 is never going to meet or cross the kangaroo 2
            if(speed2 >= speed1) return "NO";

            // we run while loop until the position of kangaroo 2 is greater than or equal to kangaroo 1
            // Because once the kangaroo 1 pass the position of kangaroo 2 they are never going to meet and we have to find out if whether they both meet on one point or not

            while(pos2 >= pos1){
                //if we find the position both kangaroo meet we return Yes
                if(pos1 == pos2) return "YES"; // 0 3 4 2

                // We will keep adding the speed of respective kangaroos to their position
                // until they meet on a certain point or until the kangaroo one passes the kangaroo 2]

                pos1 += speed1;
                pos2 += speed2;
            }

            // If they did not meet at any particular point then we simply return NO
            return "NO";
        }
    }


