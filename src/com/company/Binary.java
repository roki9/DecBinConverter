package com.company;

import com.company.exceptions.NumberNotBinaryException;

import static java.lang.Math.pow;

public class Binary implements INumber {
    @Override
    public String convert(String number) throws NumberNotBinaryException {
        Integer result = 0;
        Double power;
        for(int i=0;i!=number.length();i++){
            if(!number.substring(number.length()-i-1,number.length()-i).equals("1")&&!number.substring(number.length()-i-1,number.length()-i).equals("0")){
                throw new NumberNotBinaryException("Number is not binary");
            }
            power = pow(2,i);
            result+=power.intValue()*(Integer.parseInt(number.substring(number.length()-i-1,number.length()-i)));
        }
        return result.toString();
    }
}
