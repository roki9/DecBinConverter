package com.company;

public class Decimary implements INumber {
    @Override
    public String convert(String number){
        String result = new String();
        Integer intNumber = Integer.parseInt(number);
        if(intNumber == 0){
            return "0";
        }
        while (intNumber > 0){
            if(intNumber%2==1){
                result="1"+result;
            }
            else{
                result="0"+result;
            }
            intNumber/=2;
        }

        return result;
    }
}
