package tasks2.task5;

public class WithoutString {
    public static void main(String[] args) {
        String base = "Hello there";
        String remove = "llo";

        String result = withoutString(base, remove);

        System.out.println("The result is: " + result);
    }

    public static String withoutString(String base, String remove) {
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < base.length()) {
            int foundIndex = baseLower.indexOf(removeLower, i);
            if (foundIndex == -1) {
                result.append(base.substring(i));
                break;
            } else {
                result.append(base.substring(i, foundIndex));
                i = foundIndex + remove.length();
            }
        }
        return result.toString();
    }
}
