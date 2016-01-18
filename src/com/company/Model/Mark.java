package com.company.Model;

/**
 * Created by jonas on 2016-01-18.
 */
public enum  Mark {
    CIRCLE ("O"),
    CROSS ("X");

    private String symbol;

    public String getSymbol(){
        return symbol;
    }
    Mark(String symbol) {
        this.symbol = symbol;
    }
}
