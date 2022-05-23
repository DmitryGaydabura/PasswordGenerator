import java.util.Scanner;

public class Logic {

    public static void start() {
        Utility.DrawLogo();
        int l = choosingLength();
        int h = howManyPasswordsNeeded();
        printPasswords(l,h);
    }

    private static void printPasswords(int l, int h){
        System.out.println("Your password is:");
        for (int i = 0; i < h; i++) {
            System.out.println(generatePassword(l));
        }
    }

    private static int howManyPasswordsNeeded() {
        System.out.println("How many passwords do you need?");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        return n;
    }

    private static int choosingLength() {
        System.out.println("Choose length (from 8 to 24)");
        while (true) {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n <= 24 && n >= 8) {
                return n;
            }
            System.out.println("Incorrect input. Try again");
        }
    }

    private static String generatePassword(int l) {

        String password = "";
        String element;
        for (int i = 0; i < l; i++) {
            element = decidingTheElement();
            password += element;
        }
        return password;
    }

    public static String decidingTheElement() {
        double A = (Math.random() * 2);
        if (A > 1) {
            return randomLetterCase();
        } else {
            return randomDigitCase();

        }
    }

    private static String randomDigitCase() {
        int A = (int) (Math.random() * 10);
        return "" + Utility.getDigits()[A];
    }

    private static String randomLetterCase() {
        int A = (int) (Math.random() * 53);
        return Utility.getLetters()[A];

    }
}


