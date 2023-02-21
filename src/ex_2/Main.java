//Використовуючи IntelliJ IDEA, створіть проект. Потрібно:
//
//        Створити клас, який представляє навчальний клас ClassRoom. Створіть клас учень Pupil. У тілі класу створіть методи void study(),
//        void read(), void write(), void relax(). Створіть 3 похідні класу ExcelentPupil, GoodPupil, BadPupil від класу базового класу Pupil
//        і перевизначте кожен із методів, залежно від успішності учня. Конструктор класу ClassRoom приймає аргументи типу Pupil,
//        клас має складатися із 4 учнів. Передбачте можливість,
//        що користувач може передати 2 або 3 аргументи. Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися,
//        читати, писати, відпочивати.

package ex_2;

public class Main {
    public static void main(String[] args) {

        Pupil pupil1 = new ExcelentPupil();
        Pupil pupil2 = new GoodPupil();
        Pupil pupil3 = new GoodPupil();
        Pupil pupil4 = new BadPupil();

        ClassRoom classRoom = new ClassRoom(pupil1, pupil2, pupil3, pupil4);

        classRoom.study();
        classRoom.read();
        classRoom.write();
        classRoom.relax();
    }
}
