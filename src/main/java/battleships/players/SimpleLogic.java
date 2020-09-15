package battleships.players;

import battleships.game.*;
import battleships.ships.Ship;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;


public class SimpleLogic implements PlayerLogic{
    private Random random = new Random();
    private Board board;

    private Set<Field> salvoHistory = new HashSet<>();


    @Override
    public Field salvo() {
        Field target = null;
        do {
            char row = (char) ('A' + random.nextInt(10));
            int col = 1 + random.nextInt(10);
            target = new Field(row, col);
        } while (salvoHistory.contains(target));
        salvoHistory.add(target);
        return target;
    }

    @Override
    public ShootResult callOut(Field field) {
        Field target = board.getFields()[field.getRow()-'A'][field.getCol()-1];
        if(target.isEmpty()){
            return ShootResult.MISS;
        }else {
            Ship ship = target.getShip();
            if(ship.isDestroyed()){
                return ShootResult.MISS;
            }
            //do tego pola nie można już strzelać dzięki setShip
            target.setShip(null);
            if(ship.hit()){
                return ShootResult.HIT_AND_SINK;
            }else{
                return ShootResult.HIT;

            }
        }
    }

    @Override
    public Board prepareBoard() {
        board = new BoardBuilder()
                .carrier('D',4,true)
                .warship('A',1,false)
                .cruiser('G',7,true)
                .destroyer('I',4,true)
                .destroyer('F',1,false)
                .submarine('I',10,true)
                .submarine('A',9,true)
                .build();
        return board;
    }

}
