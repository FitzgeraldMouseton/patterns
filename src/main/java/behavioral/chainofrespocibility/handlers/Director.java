package behavioral.chainofrespocibility.handlers;

import behavioral.chainofrespocibility.util.Request;
import behavioral.chainofrespocibility.util.RequestType;

public class Director extends AbstractHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director can approve conference");
        } else {
            successor.handleRequest(request);
        }
    }
}
