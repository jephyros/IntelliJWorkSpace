package com.cis.krchismvc.util;

public class Result {
    public  boolean valid;
    public  String errorMsg;



    private Result(boolean valid,String errorMsg ) {
        this.valid = valid;
        this.errorMsg = errorMsg;

    }

    public static Result ok(){
        return new Result(true,null);
    }
    public static Result fail(String errorMsg){
        return new Result(false,errorMsg);
    }

    public Boolean isValid(){

        return this.valid;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
