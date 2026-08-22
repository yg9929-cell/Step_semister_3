package com.srm.java;

import java.util.Scanner;

public class VotingEligibility {

    void checkVotingEligibility(int age) {
        boolean eligible = age >= 18;

        if (eligible) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        VotingEligibility obj = new VotingEligibility();
        obj.checkVotingEligibility(age);

        sc.close();
    }
}