public class Main {


    public static void main(String[] args) {
        System.out.println(calculateGrade(79));
        System.out.println(fizzBuzz(16));
        System.out.println(frontBack("hello"));
        System.out.println(twoAsOne(4,11,-7));
        System.out.println(endUp("for sure"));
    }

    // Question 1 - calculateGrade
    public static char calculateGrade (int a){
        if (a >= 90){
            return 'A';
        }
        if (a <= 89 && a >= 80){
            return 'B';
        }
        if (a <= 79 && a >= 70){
            return 'C';
        }
        if (a <= 69 && a >= 60){
            return 'D';
        }
        if (a <= 59 && a >= 50){
            return 'E';
        }
        return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz (int a){
        if (a != 0) {
            if ((a % 5 == 0) && (a % 3 == 0)) {
                return "fizzbuzz";
            }
            if (a % 5 == 0) {
                return "buzz";
            }
            if (a % 3 == 0) {
                return "fizz";
            }
        }
        return "unlucky";
    }
    // Question 3 - frontBack
    public static String frontBack (String a){
        if (a.length() >= 2){
            return a.substring(0,2) + a + a.substring(0,2);
        }
        return a;
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne (int a, int b, int c){
        return ((a+b == c) || (b+c == a) || (a+c == b));
    }
    // Question 5 - endUp
    public static String endUp (String a){
        if (a.length() >= 3){
            return (a.substring(0,a.length()-3)) + (a.substring(a.length()-3, a.length())).toUpperCase();
        }
        return a.toUpperCase();
    }

}
