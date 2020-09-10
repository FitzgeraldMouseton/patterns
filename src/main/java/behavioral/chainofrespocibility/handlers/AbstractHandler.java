package behavioral.chainofrespocibility.handlers;

import behavioral.chainofrespocibility.util.Request;

public abstract class AbstractHandler {

    protected AbstractHandler successor;

    public AbstractHandler() {
    }

    public AbstractHandler(AbstractHandler successor) {
        this.successor = successor;
    }

    public AbstractHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(AbstractHandler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(Request request);
}
