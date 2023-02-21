//Використовуючи IntelliJ IDEA, створіть проект. Потрібно: Створити клас Vehicle. У тілі класу створіть поля:
//        координати та параметри суден (ціна, швидкість, рік випуску). Створіть 3 похідних класи Plane, Саг та Ship.
//        Для класу Plane має бути визначена висота та кількість пасажирів. Для класу Ship – кількість пасажирів та порт приписки.
//        Написати програму, яка виводить на екран інформацію про кожен засіб пересування.

package ex_3;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        Plane plane = new Plane();
        Ship ship = new Ship();

        System.out.println("Координати авто. \nШирота: " + car.longitude + "\nДовгота: " + car.latitude + "\nЦіна: " + car.price + "\nШвидкість: " + car.speed +
                "\nРік випуску: " + car.year);
        System.out.println();
        System.out.println("Координати літака. \nШирота: " + plane.longitude + "\nДовгота: " + plane.latitude + "\nВисота: " + plane.altitude + "\nЦіна: " + plane.price + "\nШвидкість: " + plane.speed +
                "\nРік випуску: " + plane.year + "\nКількість пасажирів: " + plane.numOfPassengers);
        System.out.println();
        System.out.println("Координати судна. \nШирота: " + ship.longitude + "\nДовгота: " + ship.latitude + "\nЦіна: " + ship.price + "\nШвидкість: " + ship.speed +
                "\nРік випуску: " + ship.year + "\nКількість пасажирів: " + ship.numOfPassengers + "\nПорт приписки: " + ship.homeport);
    }
}
