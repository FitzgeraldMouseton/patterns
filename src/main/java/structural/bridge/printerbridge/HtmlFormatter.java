package structural.bridge.printerbridge;

import java.util.List;

public class HtmlFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>")
                .append("<th>")
                .append("Classification")
                .append("</th>")
                .append("<th>")
                .append(header)
                .append("</th>");

        details.forEach(detail -> {
            builder.append("<tr><td>")
                    .append(detail.getLabel())
                    .append("</tr><td>")
                    .append(detail.getValue())
                    .append("</tr><td>");
        });
        builder.append("</table>");
        return builder.toString();
    }
}
