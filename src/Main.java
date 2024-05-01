public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

       var firstBoxer = 78.2;
       var secondBoxer = 82.7;
       var totalWeight = firstBoxer + secondBoxer;
       System.out.println("Общий вес боксеров " + totalWeight + " кг.");

       var weightDifference = secondBoxer - firstBoxer;
       System.out.println("Разница между массами боксеров составляет "+ weightDifference + " кг!");

       var totalDifference = totalWeight % weightDifference;
       System.out.println("Разница общая составляет " + totalDifference + " кг.");

       var boxerDifference = secondBoxer % firstBoxer;
       System.out.println("Разница бойцов составляет " + boxerDifference + " кг!");
       // не поняла, между какими весами нужно было найти остаток от деления, поэтому сделала две на всякий)

        var workingHours = 640;
        var oneEmployee = 8;
        var numberOfEmployee = workingHours / oneEmployee;
        System.out.println("Всего работников в компании " + numberOfEmployee + " человек.");

        numberOfEmployee = numberOfEmployee + 94;
        var totalNumberOfWorkingHours = numberOfEmployee * oneEmployee;
        System.out.println("Если в компании работает " + numberOfEmployee + " человека, то всего " + totalNumberOfWorkingHours + " часа работы может быть поделено между сотрудниками");


    }
}