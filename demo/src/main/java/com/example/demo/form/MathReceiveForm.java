package com.example.demo.form;

public class MathReceiveForm {
    private String num1;
    private String num2;
    private String numkind;

    public String getNumkind() {
        return numkind;
    }
    public void setNumkind(String numkind) {
        this.numkind = numkind;
    }
    public String getNum1() {
        return num1;
    }
    public void setNum1(String num1) {
        this.num1 = num1;
    }
    public String getNum2() {
        return num2;
    }
    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public double totalNum(String num1,String num2,String numkind){
        double a = Integer.parseInt(num1);
        double b = Integer.parseInt(num2);
    
        if(numkind.equals("add")){
            return a + b;
        }else if(numkind.equals("sub")){
            return a - b;
        }else if(numkind.equals("multi")){
            return a * b;
        }else if(numkind.equals("div")){
            return a / b;
        }else{
            return 0;
        }
    }
}
