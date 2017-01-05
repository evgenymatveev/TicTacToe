package ru.ematveev.view;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;
/**
 * Class ConsolView implements interface ICoordinateGetter. Draws the playing field in the console.
 * @author Matveev Evgeny.
 * @version 1.0.
 * @since 25.12.2016.
 */
public class ConsoleView implements ICoordinateGetter {
    /**
     * Add IPrinter printer for create mock object.
     */
    private final IPrinter printer;

    /**
     * constructor.
     * @param printer printer.
     */
    public ConsoleView(final IPrinter printer) {
        this.printer = printer;
    }

    /**
     * Metod return Point with coordinate 0 and 0.
     * @param field field.
     * @return Point.
     */
    public Point getMoveCoordinate(final FieldSmall field) {
        return new Point(0, 0);
    }
    /**
     * Metod draws the playing field in the console.
     * @param field field.
     */
    void show(final FieldSmall field) {
        final StringBuilder fieldBuilder = new StringBuilder();
        for (int x = 0; x < field.getSize(); x++) {
            if (x != 0) {
                generateSeparator(fieldBuilder);
        }
            generateLine(field, x, fieldBuilder);
        }
        printer.println(fieldBuilder.toString());
    }
    /**
     * Metod draws elements the field in the console (" ", "|").
     * @param field field.
     * @param x field.
     * @param sb sb.
     */
    void generateLine(final FieldSmall field, final int x, final StringBuilder sb) {
        for (int y = 0; y < field.getSize(); y++) {
            if (y != 0) {
                sb.append("|");
        }
            sb.append(" ");
            final Figure figure;
            figure = field.getFigure(new Point(y, x));
            sb.append(figure != null ? figure : " ");
            sb.append(" ");
        }
        sb.append("\n");
    }
    /**
     * Metod draws the separator.
     * @param sb stringBuilder.
     */
    void generateSeparator(final StringBuilder sb) {
        sb.append("~~~~~~~~~~~\n");
    }

    /**
     * Create interface IPrinter for create mock object.
     */
    public interface IPrinter {
        /**
         * Method println instead println of System.out.
         * @param text text.
         */
        void println(String text);
    }
}