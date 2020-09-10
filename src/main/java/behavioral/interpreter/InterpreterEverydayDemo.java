package behavioral.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    public static void main(String[] args) {

        String string = "Lions, and tigers, and bears and squirrels!";
        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|tiger|liger)");
        Matcher matcher = pattern.matcher(string);
        while (matcher.find()) {
            System.out.println("Found a " + matcher.group());
        }
    }
}
