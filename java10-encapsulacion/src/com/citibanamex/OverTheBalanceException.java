package com.citibanamex;

@SuppressWarnings("serial")
public class OverTheBalanceException extends Exception{
    public OverTheBalanceException(String message) {
        super(message);
    }
}

