public class Main {
    public static void main(String[] args) {
        //Задача 1
        for (int i=1; i<=10; i++){
            System.out.println("Итерация цикла "+i);
        }
        System.out.println();
        //Задача 2
        for (int i=10; i>0; i--){
            System.out.print(i+", ");
        }
        System.out.println();
        //Задача 3
        for (int i=0; i<17; i=i+2){
            System.out.print(i+", ");
        }
        System.out.println();
        //Задача 4
        for (int i=10; i>=-10; i--){
            System.out.print(i+", ");
        }
        System.out.println();
        //Задача 5
        for (int year=1904; year<=2096; year=year+4){
            System.out.println(year+" год является високосным");
        }
        System.out.println();
        for (int year=1904; year<=2096; year++) {
            if (year % 4 == 0) {
                System.out.println(year + " год является високосным");
            }//Не знаю зачем, но захотелось ещё такой вариант попробовать
        }
        System.out.println();
        //Задача 6
        for (int i=7; i<99; i=i+7){
            System.out.print(i+", ");
        }
        System.out.println();
        //Задача 7
        for (int i=1; i<999; i=i*2){
            System.out.print(i+", ");
        }
        System.out.println();
        //Задача 8
        int saveMoneyPerMonth=29000;
        int totalMoney=0;
        for (int m=1; m<=12; m++){
            totalMoney=totalMoney+saveMoneyPerMonth;
            System.out.println("Месяц "+m+", сумма накоплений равна "+totalMoney+" рублей");
        }
        System.out.println("За год накопил "+totalMoney+" рублей, можно взять поддержанный автомобиль или собрать хороший компьютер");
        System.out.println();
        //Задача 9
        //Я вижу так, что процент начисляется с первого месяца на уже внесённые деньги
        int deposit=29000;
        int total=0;
        for (int m=1; m<=12; m++){
            total=total+deposit;
            total=total+total/100;
            System.out.println("Месяц "+m+", сумма накоплений равна "+total+" рублей");
        }
        System.out.println("Со вкладом в банке накопил больше на "+(total-totalMoney)+" рублей");
        System.out.println();
        //Задача 10
        int result;
        for (int i=1; i<=10; i++){
            result=i*2;
            System.out.println(i+"*2="+result);
        }
    }
}