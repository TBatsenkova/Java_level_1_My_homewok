public class Main {

        public static void main (String[] args) {
            System.out.println("Range of the sum is " + (isSumRange(5,6)? "true" : "false"));
            numSign(10);
            System.out.println("The number is negative: " + (isNamNegativ(10)? "true" : "false"));
            printString("Hello", 8);
            System.out.println("The year is leap: " + (isYearLeap(1300)? "true" : "false"));
        }

        static boolean isSumRange(int a, int b) {
            return ((a + b >= 10) && (a + b <= 20));
        }

        static void numSign(int a) {
            System.out.println("The number is " + (a >= 0? "positive" : "negative"));
        }

        static boolean isNamNegativ(int a) {
            return a < 0;
        }

        static void printString(String text, int a) {
            for (int i = 0; i < a ; i++){
                System.out.println(text);
            }
        }

        static boolean isYearLeap(int a) {
            return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
        }
}
