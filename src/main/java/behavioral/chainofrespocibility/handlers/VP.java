package behavioral.chainofrespocibility.handlers;

import behavioral.chainofrespocibility.util.Request;
import behavioral.chainofrespocibility.util.RequestType;

public class VP extends AbstractHandler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.PURCHASE) {
            if (request.getAmount() <= 500) {
                System.out.println("VP can approve purchases below 500");
            } else {
                successor.handleRequest(request);
            }
        } else {
            successor.handleRequest(request);
        }
    }
}
