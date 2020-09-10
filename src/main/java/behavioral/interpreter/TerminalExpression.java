package behavioral.interpreter;

import java.util.StringTokenizer;

public class TerminalExpression implements Expression {

    private final String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String string) {
        StringTokenizer tokenizer = new StringTokenizer(string);
        while (tokenizer.hasMoreTokens()) {
            String test = tokenizer.nextToken();
            if (test.equals(data)) {
                return true;
            }
        }
        return false;
    }
}
