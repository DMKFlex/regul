import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "data 48 call 9 read13 blank0a";
        Pattern pattern = Pattern.compile("\\d+");
        for (int num : reg(text, pattern)) {
            System.out.println(num);
        }
    }

    static ArrayList<Integer> reg(String string, Pattern pattern) {
        Matcher matcher = pattern.matcher(string);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int i = 0;
        while (matcher.find()) {
            nums.add(i, 2 * Integer.parseInt(string.substring(matcher.start(), matcher.end())));
            i++;
        }
        return nums;
    }
}
