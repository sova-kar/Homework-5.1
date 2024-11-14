public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //Task 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        //Task 3
        for (int i = 2; i < 17; i = i + 2) {
            System.out.println(i);
        }

        //Task 4
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }

        //Task 5
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " " + "год является високосным");
        }

        //Task 6
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }

        //Task 7
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }

        //Task 8
        int total = 0;
        int money = 29000;
        for (int i = 1; i < 13; i++) {
            total = total + money;
            System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 9
        total = 0;
        money = 29000;
        for (int i = 1; i < 13; i++) {
            total = total + total / 100;
            total = total + money;
            System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 10
        int one = 2;
        total = 1;
        for (int i = 1; i < 11; i++) {
            total = one * i;
            System.out.println(one + "*" + i + "=" + total);
        }
        //Homework.Part 2
        //Task 1
        System.out.println("Задание 1");

        total = 0;
        money = 15000;
        int i = 0;
        while (total < 2_459_000) {
            i++;
            total = total + money;
            total = total + total / 100;
            System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 2
        System.out.println("Задание 2");

        i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println(" ");
        i = 11;
        while (i > 1) {
            i--;
            System.out.print(i + " ");
        }
        //Task 3
        {
            System.out.println("Задание 3");
        }

        int people = 12_000_000;
        int death = 8;
        int birth = 17;
        int year1=2024;
        for (int year2=year1; year2<year1+10; year2++) {
            people += people*birth/1000 - people*death/1000;
            System.out.println("Год" + " " + year2 + " " + "численность населения составляет" + " " + people);
        }

        //Task 4
        System.out.println("Задание 4");

        total = 15000;
        i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + total / 100 * 7;
            System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 5
        System.out.println("Задание 5");

        total = 15000;
        i = 0;
        while (total < 12_000_000) {
            i++;
            total = total + total / 100 * 7;
            if (i % 6 == 0)
                System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 6
        System.out.println("Задание 6");
        total = 15000;
        i = 0;
        while (i < 108) {
            i++;
            total = total + total / 100 * 7;
            if (i % 6 == 0)
                System.out.println("Месяц" + " " + i + " " + "сумма накомлений равна" + " " + total + " " + "рублей");
        }

        //Task 7
        System.out.println("Задание 7");
        for (int dayNumber = 1; dayNumber <= 31; dayNumber = dayNumber + 7) {
            System.out.println("Сегодня пятница -" + " " + dayNumber + " " + "число." + " " + "Необходимо сделать отчет.");
        }
        //Task 8
        {
            System.out.println("Задание 8");
        }
        int begin=0;
        int pastComet=year1-200;
        int futureComet=year1+100;
        for (int year = begin; year< futureComet; year =year+ 79){
            if(year>pastComet)
            System.out.println(year);
        }
    }
}