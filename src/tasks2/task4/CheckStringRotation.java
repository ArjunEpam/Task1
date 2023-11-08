package tasks2.task4;

public class CheckStringRotation {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "cdefab";
        if (areRotations(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are rotations of each other.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not rotations of each other.");
        }
    }

    public static boolean areRotations(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }
}
