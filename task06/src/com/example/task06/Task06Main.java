package com.example.task06;

public class Task06Main {
    public static void main(String[] args) {

        new Task06Main().printMethodName();

    }

    void printMethodName(){
        try{
            e();
        } catch (Exception e){
            StackTraceElement[] stackTrace = e.getStackTrace();

            if (stackTrace.length > 1) {
                String callerMethodName = stackTrace[2].getMethodName();
                System.out.println(callerMethodName);
            }
        }
    }

    void e() throws Exception{
        throw new Exception("Исключение для поимки");
    }

}