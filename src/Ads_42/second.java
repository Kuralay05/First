package Ads_42;

import java.io.*;
public class second {

    static int steps(int source, int step, int destination) {
        // Base case: If the absolute value of source exceeds the destination, return a large number
        if (Math.abs(source) > destination)
            return Integer.MAX_VALUE;

        // Base case: If the source equals the destination, return the number of steps
        if (source == destination)
            return step;

        // Recursively calculate the steps if moving in the positive direction
        int pos = steps(source + step + 1, step + 1, destination);

        // Recursively calculate the steps if moving in the negative direction
        int neg = steps(source - step - 1, step + 1, destination);

        // Return the minimum steps required between the two directions
        return Math.min(pos, neg);
    }

    public static void main(String[] args) {
        int destination = 11; // Destination point
        // Call the steps function with initial source 0, step 0, and the destination
        System.out.println(steps(0, 0, destination));
    }
}
