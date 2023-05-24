import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
}
