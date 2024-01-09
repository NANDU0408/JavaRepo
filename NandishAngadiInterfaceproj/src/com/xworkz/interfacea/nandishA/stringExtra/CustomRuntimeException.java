package com.xworkz.interfacea.nandishA.stringExtra;

public class CustomRuntimeException extends RuntimeException{
    public static void main(String[] args) throws CustomRuntimeException {
        throw new CustomRuntimeException();
    }
}
