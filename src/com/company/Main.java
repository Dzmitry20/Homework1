package com.company;

public class Main {

    public static void main(String[] args) {
        int yearOfBirthday = 1986;
        int monthOfBirthday = 2;
        int dayOfBirthday = 4;
        int sum = yearOfBirthday + monthOfBirthday + dayOfBirthday;
        System.out.println("Сумма моего года, месяца и дня рождения:"+ sum);

        boolean monthBiggerDay;
        monthBiggerDay = monthOfBirthday > dayOfBirthday;
        System.out.println("Месяц моего рождения больше даты рождения: "+ monthBiggerDay);  // почему подчеркнута переменная?

         char[] name = new char[7];
         name[0]='Д';
         name[1]='м';
         name[2]='и';
         name[3]='т';
         name[4]='р';
         name[5]='и';
         name[6]='й';
        System.out.print("Массив с моим именем: ");
        for (int i = 0; i < 7; i++) {
            System.out.print(name[i]);}
            System.out.println();
            double myAge = 34;
            double partYear = 8.0 / 12.0;
            double rez = myAge + partYear;
            double rezRound = Math.round(rez*100.0)/100.0;
            System.out.println("Мне: "+ rezRound + " лет.");

    }
}
