package org.java.systemDesign.snakeandladder;

public class Main {

    public static void main(String[] args) {

        Player player = new Player("Bharti");

        Dice dice = new Dice();

        Board board = new Board();

        while(player.getPosition() < 100){

            int diceValue = dice.roll();

            System.out.println("\nDice : " + diceValue);

            int newPosition = player.getPosition() + diceValue;

            if(newPosition <= 100){

                player.setPosition(newPosition);

                player.setPosition(
                        board.checkPosition(player.getPosition()));
            }

            System.out.println(player.getName()
                    + " Position : "
                    + player.getPosition());
        }

        System.out.println("\nWinner : " + player.getName());
    }
}
