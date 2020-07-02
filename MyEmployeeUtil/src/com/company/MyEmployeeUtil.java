package com.company;

public class MyEmployeeUtil <T extends Zaposleni>{
    private T zap;
    public MyEmployeeUtil(T obj){
        zap = obj;
    }
    public int getPlata(){
        return zap.getPlata();

    }
    public boolean isSalaryEqual(MyEmployeeUtil<?> otherEmp ){
        if(zap.getPlata() == otherEmp.getPlata()){
            return true;
        }
        return false;

    }

}
