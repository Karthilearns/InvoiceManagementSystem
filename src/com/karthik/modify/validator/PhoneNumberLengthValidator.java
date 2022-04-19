package com.karthik.modify.validator;

public class PhoneNumberLengthValidator implements ValidaterWithString{

    @Override
    public boolean validate(String phoneNumberToValidate) {
    return (phoneNumberToValidate.length()==10 || phoneNumberToValidate.length()==13);
    }
}
