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

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        var cat = 3.6;
        cat = cat + 4;
        var paper = 763789;
        paper = paper +4;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog - 3.5;
        var cat = 3.6;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(dog + "\n" + cat + "\n" + paper + "\n");
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend + "\n");
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog + "\n");
    }

    public static void task6() {
        System.out.println("Задача 6");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var totalWeight = weightBoxer1 + weightBoxer2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг");

        var weightDifference = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг" + "\n");
    }

    public static void task7() {
        System.out.println("Задача 7");
        var weightBoxer1 = 78.2;
        var weightBoxer2 = 82.7;
        var weightDifference1 = weightBoxer2 - weightBoxer1;
        System.out.println("Разница между весами бойцов (вычитание из большего меньшего) " + weightDifference1 + " кг");
        var weightDifference2 = weightBoxer2 % weightBoxer1;
        System.out.println("Разница между весами бойцов (с помощью функции остаток от деления) " + weightDifference2 + " кг" + "\n");
    }

    public static void task8() {
        System.out.println("Задача 8");
        var totalHours = 640;
        var hoursPerWorker = 8;
        var totalWorkers = totalHours / hoursPerWorker;
        System.out.println("Всего работников в компании " + totalWorkers + " человек.");
        var additionalWorkers = 94;
        var totalWorkers2 = totalWorkers + additionalWorkers;
        var totalHours2 = totalWorkers2 * hoursPerWorker;
        System.out.println("Если в компании работает " + totalWorkers2 + " человека, то всего " + totalHours2 + " часов работы может быть поделено между сотрудниками.");

    }



}


