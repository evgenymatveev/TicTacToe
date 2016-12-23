package ru.ematveev.view;


import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

public class ConsoleView implements ICoordinateGetter {

    public Point getMoveCoordinate(final FieldSmall field) {
    	return new Point(0, 0);	
    }

        void show(final FieldSmall field) {
	    final StringBuilder fieldBuilder = new StringBuilder();
	        for (int x = 0; x < field.getSize(); x++) {
                if (x != 0)
                    generateSeparator(fieldBuilder);
                    generateLine(field, x, fieldBuilder);
        }
	    System.out.println(fieldBuilder.toString());
    }

        void generateLine(final FieldSmall field, final int x, final StringBuilder sb) {
            for (int y = 0; y < field.getSize(); y++) {
                if (y != 0)
                    sb.append("|");
                    sb.append(" ");
                    final Figure figure;
                    figure = field.getFigure(new Point(y, x));
                    sb.append(figure != null ? figure : " ");
                    sb.append(" ");
        }
            sb.append("\n");
    }
        void generateSeparator(final StringBuilder sb) {
	    sb.append("~~~~~~~~~~~\n");
    }

}