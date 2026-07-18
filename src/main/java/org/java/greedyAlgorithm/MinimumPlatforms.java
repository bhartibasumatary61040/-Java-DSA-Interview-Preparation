package org.java.greedyAlgorithm;
import java.util.Arrays;
public class MinimumPlatforms {

    public static void main(String[] args) {

        int[] arrival={900,940,950,1100,1500,1800};

        int[] departure={910,1200,1120,1130,1900,2000};

        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platform=1;
        int maxPlatform=1;

        int i=1;
        int j=0;

        while(i<arrival.length && j<departure.length){

            if(arrival[i]<=departure[j]){

                platform++;
                i++;

            }else{

                platform--;
                j++;
            }

            maxPlatform=Math.max(maxPlatform,platform);
        }

        System.out.println("Minimum Platform = "+maxPlatform);
    }
}
