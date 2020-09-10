package structural.bridge.printerbridge;

import java.util.List;

public class PrintFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append(header.toUpperCase()).append(":");
        builder.append("\n");

        details.forEach(detail -> {
            builder.append(detail.getLabel())
                    .append(": ")
                    .append(detail.getValue())
                    .append("\n");
        });
        return builder.toString();
    }
}
