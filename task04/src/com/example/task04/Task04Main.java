package com.example.task04;

import java.text.MessageFormat;

public class Task04Main {

    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(-5));
         */
    }

    static String getSeason(int monthNumber) {
        String month = "";
        String season = "";
        if (monthNumber <= 0){
            String pattern = "monthNumber {0} is invalid, month number should be between 1..12";
            String formatted = MessageFormat.format(pattern, monthNumber);
            throw new MyException(formatted);
        }
        else if (monthNumber > 12){
            String pattern = "monthNumber {0} is invalid, month number should be between 1..12";
            String formatted = MessageFormat.format(pattern, monthNumber);
            throw new MyException(formatted);
        }
        else{
            switch (monthNumber){
                case 1:
                    month = "Январь";
                    season = "зима";
                    break;
                case 2:
                    month = "Февраль";
                    season = "зима";
                    break;
                case 3:
                    month = "Март";
                    season = "Весна";
                    break;
                case 4:
                    month = "Апрель";
                    season = "Весна";
                    break;
                case 5:
                    month = "Май";
                    season = "Весна";
                    break;
                case 6:
                    month = "Июнь";
                    season = "Лето";
                    break;
                case 7:
                    month = "Июль";
                    season = "Лето";
                    break;
                case 8:
                    month = "Август";
                    season = "Лето";
                    break;
                case 9:
                    month = "Сентябрь";
                    season = "Осень";
                    break;
                case 10:
                    month = "Октябрь";
                    season = "Осень";
                    break;
                case 11:
                    month = "Ноябрь";
                    season = "Осень";
                    break;
                case 12:
                    month = "Декабрь";
                    season = "Зима";
                    break;
            }
        }
        return season.toLowerCase();
    }

}

class MyException extends IllegalArgumentException{
    public MyException(String a){
        super(a);
    }
}