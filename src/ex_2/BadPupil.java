package ex_2;

public class BadPupil extends Pupil {

    @Override
    public void study(){
        System.out.println("doesn't study well");
    }
    @Override
    public void read() {
        System.out.println("reads very badly");
    }
    @Override
    void write() {
        System.out.println("can't write");
    }
    @Override
    void relax() {
        System.out.println("goes to nightclubs");
    }

}
