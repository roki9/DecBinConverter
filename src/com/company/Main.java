package com.company;

import com.company.exceptions.NumberNotBinaryException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        INumber number;
        String converterType = new String();
        Scanner scanner = new Scanner(System.in);
        String numberToConvert;

        if(args.length == 0){
            System.out.println("To convert from binary to decimary type 1, to convert otherwise type 2");
            converterType = scanner.nextLine();
        }
        else{
            converterType = args[0];
        }
        if(converterType.equals("1")){
            number = new Binary();
        }
        else if(converterType.equals("2")){
            number = new Decimary();
        }
        else{
            System.out.println("There's no such convertion type available. Try again");
            return;
        }
        
        if(args.length>1){
            numberToConvert = args[1];
        }
        else{
            System.out.println("Now type in number to convert");
            numberToConvert=scanner.nextLine();//saving number in String to allow converting larger numbers
        }
        try {
            System.out.println(number.convert(numberToConvert));
        } catch (NumberNotBinaryException e) {
            System.out.println(e.getMessage());
        }


    }
}
