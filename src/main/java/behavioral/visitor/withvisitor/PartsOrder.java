package behavioral.visitor.withvisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PartsOrder implements AtvPart {

    private final List<AtvPart> parts = new ArrayList<>();

    public void addPart(AtvPart part) {
        parts.add(part);
    }

    public List<AtvPart> getParts() {
        return Collections.unmodifiableList(parts);
    }

    public void accept(AtvPartVisitor visitor) {
        parts.forEach(atvPart -> atvPart.accept(visitor));
        visitor.visit(this);
    }
}
