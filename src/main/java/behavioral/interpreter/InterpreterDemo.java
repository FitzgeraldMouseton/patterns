package behavioral.interpreter;

public class InterpreterDemo {

    public static void main(String[] args) {

        String context = "Lions Tigers";

        Expression define = buildInterpreterTree();

        System.out.println(context + " is " + define.interpret(context));
    }

    static Expression buildInterpreterTree() {

        final Expression lions = new TerminalExpression("Lions");
        final Expression tigers = new TerminalExpression("Tigers");
        final Expression squirrels = new TerminalExpression("Squirrels");
        final Expression alteration1 = new AndExpression(lions, squirrels);
        final Expression alteration2 = new AndExpression(tigers, squirrels);
        final Expression alteration3 = new OrExpression(tigers, squirrels);
        return alteration3;
    }
}
