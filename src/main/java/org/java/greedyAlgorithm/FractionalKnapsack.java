package org.java.greedyAlgorithm;
import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapsack {

    static class Item {

        int value, weight;

        Item(int value, int weight) {

            this.value = value;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {

        Item[] items = {

                new Item(60,10),
                new Item(100,20),
                new Item(120,30)
        };

        int capacity = 50;

        Arrays.sort(items,(a,b)->Double.compare(
                (double)b.value/b.weight,
                (double)a.value/a.weight));

        double profit = 0;

        for(Item item : items){

            if(capacity >= item.weight){

                profit += item.value;
                capacity -= item.weight;

            }else{

                profit += ((double)item.value/item.weight)*capacity;
                break;
            }
        }

        System.out.println("Maximum Profit = "+profit);
    }
}
