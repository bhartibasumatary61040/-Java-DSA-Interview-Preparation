package org.java.greedyAlgorithm;
import java.util.Arrays;
public class JobSequencing {

    static class Job{

        char id;
        int deadline;
        int profit;

        Job(char id,int deadline,int profit){

            this.id=id;
            this.deadline=deadline;
            this.profit=profit;
        }
    }

    public static void main(String[] args) {

        Job[] jobs={

                new Job('A',2,100),
                new Job('B',1,19),
                new Job('C',2,27),
                new Job('D',1,25),
                new Job('E',3,15)
        };

        Arrays.sort(jobs,(a,b)->b.profit-a.profit);

        boolean[] slot=new boolean[4];

        char[] result=new char[4];

        for(Job job:jobs){

            for(int j=job.deadline;j>0;j--){

                if(!slot[j]){

                    slot[j]=true;
                    result[j]=job.id;
                    break;
                }
            }
        }

        System.out.print("Jobs : ");

        for(int i=1;i<result.length;i++){

            if(result[i]!='\0')
                System.out.print(result[i]+" ");
        }
    }
}
