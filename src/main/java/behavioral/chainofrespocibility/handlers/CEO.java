package behavioral.chainofrespocibility.handlers;

import behavioral.chainofrespocibility.util.Request;

public class CEO extends AbstractHandler {

    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO can approve everything");
    }
}
