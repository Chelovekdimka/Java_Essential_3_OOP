package Ex_4;

public class ExpertDocumentWorker extends ProDocumentWorker{
    @Override
    void saveDocument() {
        System.out.println("Документ збережено в новому форматі");
    }
}
