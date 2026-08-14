package com.auctionplatform.phase1.week1;

public class CharType {

    public static void main(String[] args)
    {

        char euroSign       = '€';
        char dollarSign     = '$';

        String auctionTitle = "Vintage Land Cruiser";
        for (int i = 0; i < auctionTitle.length(); i++) {
            char c = auctionTitle.charAt(i);
            if (Character.isUpperCase(c)) {
                System.out.print("[" + c + "]");
            } else {
                System.out.print(c);
            }
        }
        char input = '7';
        boolean isDigit   = Character.isDigit(input);     // true
        boolean isLetter  = Character.isLetter(input);    // false
        boolean isSpace   = Character.isWhitespace(input); // false
    }
}
