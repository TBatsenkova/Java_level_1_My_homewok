public class Main {

    public static void main(String[] args) {

                printThreeWords("Orange", "Banana", "Apple");
                checkSumSign(20,-45);
                printColor(-125);
                compareNumbers(-458, 45);

            }

            static void printThreeWords(String one, String two, String three) {

                System.out.println(one);
                System.out.println(two);
                System.out.println(three);
                System.out.println();

            }

            static void checkSumSign(int a, int b) {
                int c;
                c = a + b;
                System.out.println(c >= 0? "Sum is positive." : "Sam is negative.");
                System.out.println();

            }

            static void printColor(int value) {

                if (value <= 0) {
                    System.out.println("Red");
                }
                else if (value>0 && value<=100) {
                    System.out.println("Yellow");
                }
                else {
                    System.out.println("Green");
                }
                System.out.println();

            }

            static void compareNumbers(int a, int b) {

                System.out.println( a >= b? "a >= b" : "a < b" );

            }
        }


