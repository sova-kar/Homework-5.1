public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Task 1
        for (int i=1; i<11; i++){
            System.out.println(i);
        }

        //Task 2
        for (int i = 10; i > 0; i--){
            System.out.println(i);
        }

        //Task 3
        for (int i = 2; i < 17; i=i+2){
            System.out.println(i);
        }

        //Task 4
        for (int i = 10; i > -11; i--){
            System.out.println(i);
        }

        //Task 5
        for (int i = 1904; i < 2097; i=i+4){
            System.out.println(i+" "+"год является високосным");
        }

        //Task 6
        for (int i = 7; i < 99; i=i+7){
            System.out.println(i);
        }

        //Task 7
        for (int i = 1; i <513; i=i*2){
            System.out.println(i);
        }

        //Task 8
        int total=0;
        int money=29000;
        for (int i = 1; i <13; i++){
            total=total+money;
            System.out.println("Месяц"+" "+i+" "+"сумма накомлений равна"+" "+total+" "+"рублей");
        }

        //Task 9
        total=0;
        money=29000;
        for (int i = 1; i <13; i++){
            total=total+total/100;
            total=total+money;
            System.out.println("Месяц"+" "+i+" "+"сумма накомлений равна"+" "+total+" "+"рублей");
        }

        //Task 10
        int one=2;
        total=1;
        for (int i=1; i<11; i++){
            total=one*i;
            System.out.println(one+"*"+i+"="+total);
        }
    }
}