public class Utility {
    public static void DrawLogo(){
        System.out.println("""

                    ____                                          __   ______                           __           \s
                   / __ \\____ ____________      ______  _________/ /  / ____/__  ____  ___  _________ _/ /_____  _____
                  / /_/ / __ `/ ___/ ___/ | /| / / __ \\/ ___/ __  /  / / __/ _ \\/ __ \\/ _ \\/ ___/ __ `/ __/ __ \\/ ___/
                 / ____/ /_/ (__  |__  )| |/ |/ / /_/ / /  / /_/ /  / /_/ /  __/ / / /  __/ /  / /_/ / /_/ /_/ / /   \s
                /_/    \\__,_/____/____/ |__/|__/\\____/_/   \\__,_/   \\____/\\___/_/ /_/\\___/_/   \\__,_/\\__/\\____/_/    \s
                                                                                                                     \s
                """);
    }

    public static int[] digits = {0,1,2,3,4,5,6,7,8,9};
    public static String[] letters = {"A","a","B","b","C","c","D","d","E","e","F","f","G","g","H","h","I","i","J","j","K","k","L","l","M","m","N","n","O","o","P","p","Q","q","R","r","S","s","T","t","U","u","V","v","W","w","X","x","Y","y","Z","z","_"};


    public static int[] getDigits() {
        return digits;
    }

    public static String[] getLetters() {
        return letters;
    }
}
