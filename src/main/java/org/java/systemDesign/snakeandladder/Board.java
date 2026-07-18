package org.java.systemDesign.snakeandladder;
import java.util.ArrayList;
import java.util.List;
public class Board {

    private List<Snake> snakes = new ArrayList<>();
    private List<Ladder> ladders = new ArrayList<>();

    public Board() {

        snakes.add(new Snake(99,54));
        snakes.add(new Snake(70,55));
        snakes.add(new Snake(52,42));
        snakes.add(new Snake(25,2));

        ladders.add(new Ladder(6,25));
        ladders.add(new Ladder(11,40));
        ladders.add(new Ladder(60,85));
        ladders.add(new Ladder(46,90));
    }

    public int checkPosition(int position){

        for(Snake snake : snakes){

            if(position == snake.getHead()){

                System.out.println("Bitten by Snake!");

                return snake.getTail();
            }
        }

        for(Ladder ladder : ladders){

            if(position == ladder.getStart()){

                System.out.println("Climbed Ladder!");

                return ladder.getEnd();
            }
        }

        return position;
    }
}
