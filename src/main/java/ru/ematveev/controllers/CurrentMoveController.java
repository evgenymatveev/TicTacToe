package ru.ematveev.controllers;

import ru.ematveev.model.FieldSmall;
import ru.ematveev.model.Figure;
import ru.ematveev.model.Point;

public class CurrentMoveController {
    public Figure currentMove(final FieldSmall fieldSmall){

        int countX = 0;
        int countO = 0;

        for(int i = 0; i < fieldSmall.getSize(); i++){
            for(int j =0; j < fieldSmall.getSize(); j++){

                if(fieldSmall.getFigure(new Point(i, j)) == null){
                    continue;
                }
                if(fieldSmall.getFigure(new Point(i, j)) == Figure.X){
                    countX++;
                }

                if(fieldSmall.getFigure(new Point(i, j)) == Figure.O){
                    countO++;
                }
            }
        }
        return countX == countO ? Figure.X : Figure.O;
    }
}
