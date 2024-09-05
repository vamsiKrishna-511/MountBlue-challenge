package MountBlue_2;

import java.util.Scanner;

public class CatsAndMouse_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int testCases = input.nextInt();

        for (int i = 0; i < testCases; i++) {
            // catx, caty and mouse locations
            int catx = input.nextInt();
            int caty = input.nextInt();
            int mouse = input.nextInt();

            System.out.println(catAndMouse(catx, caty, mouse));
        }
    }

    static String catAndMouse(int catx, int caty, int mouse) {
        // variable to store the difference between the positions of catx and caty
        // We are using Math class's abs method to calculate the absolute difference
        int diffx = Math.abs(catx - mouse);
        int diffy = Math.abs(caty - mouse);

        // if the difference is same the mouse escaped so return Mouuse C
        if(diffx == diffy) return "Mouse C";

        // if the diffx is less return Cat A else return Cat B
        return (diffx < diffy ? "Cat A" : "Cat B");
    }
}
