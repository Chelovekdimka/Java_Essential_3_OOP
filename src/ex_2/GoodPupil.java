package ex_2;

public class GoodPupil extends Pupil {
    @Override
    public void study(){
        System.out.println("has good academic performance");
    }
    @Override
    public void read() {
        System.out.println("enjoys reading");
    }
    @Override
    void write() {
        System.out.println("good handwriting, few mistakes");
    }
    @Override
    void relax() {
        System.out.println("goes to the movies with friends, goes to the gym");
    }
}
