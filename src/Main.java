public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1 () {
        System.out.println("Задача 1");
     var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);// Пишем код для задачи 1
    }
    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);

        // Пишем код для задачи 2
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 12.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 7.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763793;
        paper = paper - 7639;
        System.out.println(paper);

    }

    public static void  task4(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void task5(){
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task6(){
        System.out.println("Задача 6");
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var generalWeight = weightOneBoxer + weightTwoBoxer;
        System.out.println("Общий вес боксеров " + generalWeight + " кг");
        var differnceWeight = weightTwoBoxer - weightOneBoxer;
        System.out.println("Разница в весе боксеров " + differnceWeight + " кг");

    }

    public static void task7(){
        System.out.println("Задача 7");
        var weightOneBoxer = 78.2;
        var weightTwoBoxer = 82.7;
        var differenceWeight1 = weightTwoBoxer - weightOneBoxer;
        System.out.println("Разница в весе боксеров " + differenceWeight1 + " кг (1 способ)");
        var differenceWeight2 = weightTwoBoxer % weightOneBoxer;
        System.out.println("Разница в весе боксеров " + differenceWeight2 + " кг (2 способ)");

    }
    public static void task8(){
        System.out.println("Задача 8");
        var workingTime = 640;
        var manWorkingTime = 8;
        var worker = workingTime / manWorkingTime;
        System.out.println("Всего работников в компании " + worker + " человек");
        worker = worker + 94;
        manWorkingTime = workingTime / worker;
        System.out.println("Если в компании работает " + worker + " человек, то всего " + manWorkingTime + " часа(ов) работы может быть поделено между сотрудниками");

    }

}