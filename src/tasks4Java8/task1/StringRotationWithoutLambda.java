package tasks4Java8.task1;

public class StringRotationWithoutLambda {
    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String str1 = "waterbottle";
        String str2 = "erbottlewat";

        boolean result = areRotations(str1, str2);
        System.out.println("Are rotations? (Without Lambda): " + result);
    }

    
}
