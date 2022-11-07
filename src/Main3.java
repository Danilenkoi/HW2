public class Main3 {
    public static void main(String[] args) {

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var generalFighter = firstFighter + secondFighter;
        System.out.println("Общий вес боксеров " + generalFighter);

        var differenceFighter = firstFighter - secondFighter;
        System.out.println("Разница в весе " + differenceFighter + " кг");

        var differenceFighter2 = secondFighter - firstFighter;
        System.out.println("Разница в весе " + differenceFighter2 + " кг!");

        var differenceBoxers = secondFighter % firstFighter;
        System.out.println("Разница в весе " + differenceBoxers + " кг.");

        var hoursToWork = 640.0;
        var oneStaff = 8;
        var howMenuStaff = hoursToWork / oneStaff;
        System.out.println("Всего работников в компании " + howMenuStaff + " человек");

        var moreOnStaff = 94;
        var amountStaff = 80;
        var totalStaff = moreOnStaff + amountStaff;
        System.out.println("Всего сотрудников " + totalStaff);

        var hoursOneStaff = hoursToWork / totalStaff;
        System.out.println("Если в компании работает " + totalStaff + " человек, то всего " + hoursOneStaff + " часов работы может быть поделено между сотрудниками");
    }
}
