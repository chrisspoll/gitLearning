package tests;

public class Array {

    public static void main(String[] args) {

        int[] nums1 = {1, 5, 5, 1, 1};
        int[] nums2 = {1, 8, 5, 5, 0};
        int[] nums3 = {1, 5, 4, 1, 5};
        int[] nums4 = {1, 4, 4, 1, 99};

        System.out.println(consecutiveFives(nums1));
        System.out.println(consecutiveFives(nums2));
        System.out.println(consecutiveFives(nums3));
        System.out.println(consecutiveFives(nums4));

    }

    public static boolean consecutiveFives(int[] array){

        for (int i = 0; i < (array.length-1); i++) {
            if (array[i]==5 && array[i+1]==5){
                return true;
            }
        }

        return false;
    }
}
