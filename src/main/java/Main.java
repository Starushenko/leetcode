import java.util.*;

public class Main {
    public static void main(String[] args) {
      //palindrome
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть текст: ");
        String input = scanner.nextLine();
        String cleanText = input.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");
        String lowercaseText = cleanText.toLowerCase();

        if (isPalindrome(lowercaseText)) {
            System.out.println("Текст є паліндромом.");
        } else {
            System.out.println("Текст не є паліндромом.");
        }

        //arrays
        int[] nums1 = {1,2,3,1}; //true
        int[] nums2 = {1,2,3,4}; //false
        int[] nums3 = {1,1,1,3,3,4,3,2,4,2}; //true
        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));

        //arrays+target
        int[] nums_1 = {2,7,11,15};
        int target_1 = 9;
        int[] nums_2 = {3,2,4};
        int target_2 = 6;
        int[] nums_3 = {3,3};
        int target_3 = 6;

        System.out.println(Arrays.toString(twoSum(nums_1,target_1)));
        System.out.println(Arrays.toString(twoSum(nums_2,target_2)));
        System.out.println(Arrays.toString(twoSum(nums_3,target_3)));

        //maxProfit
        int[] prices1 = {7,1,5,3,6,4};//5
        int[] prices2 = {7,6,4,3,1};//0
        System.out.println(MaxProfit.maxProfit(prices1));
        System.out.println(MaxProfit.maxProfit(prices2));

        //reverseArray
        int[] startArray = {1,2,3,4,5};
        System.out.println("Start array: "+Arrays.toString(startArray));
        System.out.println("Reversed array: "+Arrays.toString(ReverseArray.reverseArray(startArray)));


    }
    private static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length / 2; i++) {
            if (text.charAt(i) != text.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = map.get(complement);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
