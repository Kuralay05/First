package Assignment_41;
public class ex3 {
    public static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer cand = null;

        for (int num : nums) {
            if (count == 0) {
                cand = num;
            }
            count += (num == cand) ? 1 : -1;
        }
        count = 0;
        for (int num : nums) {
            if (num == cand) {
                count++;
            }
        }
        return (count > nums.length / 2) ? cand : -1;
    }
    public static void main(String[] args) {
        int[] input1 = {4, 7, 4};
        int[] input2 = {7, 7, 4, 4, 4, 3, 3};

        System.out.println("Output for input1: " +
                findMajorityElement(input1));
        System.out.println("Output for input2: " +
                findMajorityElement(input2));
    }
}