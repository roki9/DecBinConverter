package com.company;

import com.company.exceptions.NumberNotBinaryException;

public interface INumber {

    public String convert(String number) throws NumberNotBinaryException;
}
