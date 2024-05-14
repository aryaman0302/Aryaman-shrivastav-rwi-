public class Main {
    public static void main(String[] args) {

        int number = 153;

        if (isArmstrong(number, numberOfDigits(number)))
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

    public static boolean isArmstrong(int number, int numberOfDigits) {
        int sum = calculateArmstrongSum(number, numberOfDigits);
        return sum == number;
    }

    public static int calculateArmstrongSum(int number, int numberOfDigits) {
        if (number == 0)
            return 0;
        int digit = number % 10;
        return (int) (Math.pow(digit, numberOfDigits) + calculateArmstrongSum(number / 10, numberOfDigits));
    }

    public static int numberOfDigits(int number) {
        if (number == 0)
            return 0;
        return 1 + numberOfDigits(number / 10);
    }
}