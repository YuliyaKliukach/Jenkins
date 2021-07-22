package com.jenkins;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.println("Batch 9 is great");
            System.out.println("How are you?");
            Thread.sleep(1000);
        }
    }
}
