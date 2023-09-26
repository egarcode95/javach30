package com.citibanamex;


@SuppressWarnings("serial")
public class NegativeAmountException extends Exception{
    public NegativeAmountException(String message) {
        super(message);
    }
}
