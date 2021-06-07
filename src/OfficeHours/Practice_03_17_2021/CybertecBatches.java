package OfficeHours.Practice_03_17_2021;
/*
In Cybertek we have three batch types: US morning, US evening, EU.
Depending on a batch type (String) print information about the batch.

First figure out is a US batch or EU batch

      - for US batch:

        > Figure out is it a morning batch or evening batch
           > morning - print: Class time are 10 - 5 EST. M, T, Th, F.
           > evening - print: Class time are 7 - 10 EST. M, T, W, Th, S, S.

      - or EU batches:
           > print: Class times are 10 - 5 EST. M, T, W, Th, F.


 */
public class CybertecBatches {

    public static void main(String[] args) {

        String batchType = "EU";

        if (batchType.equals("US") || batchType.equals("us")) {
            boolean isMorning = false;
            if (isMorning) {
                System.out.println("Class time are 10 - 5 EST. M, T, Th, F.");
            } else {
                System.out.println("Class time are 7 - 10 EST. M, T, W, Th, S, S.");
            }
        } else if (batchType.equals("EU") || batchType.equals("eu")) {
            System.out.println("Class times are 10 - 5 EST. M, T, W, Th, F.");
        } else {
            System.out.println("Invalid Batch type");
        }



    }

}