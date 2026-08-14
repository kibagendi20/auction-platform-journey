package com.auctionplatform.phase1.week1;

public class IntegerOverflow {
    public static void main(String[] args){
        int totalBidsToday = Integer.MAX_VALUE;
        System.out.println("Maximum Integer Value: " + totalBidsToday );
        totalBidsToday++;
        System.out.println("Total bids: " + totalBidsToday);
    }
}
