package ex_2;

public class ExcelentPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("high academic achievement");
    }
    @Override
    public void read() {
        System.out.println("enjoys scientific and popular literature");
    }
    @Override
    void write() {
        System.out.println("has calligraphy");
    }
    @Override
    void relax() {
        System.out.println("swimming in the pool");
    }
}
