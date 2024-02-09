package vjezba3.zadatak1;

public class WriterAdapter implements WriterInterface{

    private OldNovelist oldNovelist;

    public WriterAdapter(OldNovelist oldNovelist) {
        this.oldNovelist = oldNovelist;
    }

    @Override
    public void writeNovel(String novelType) {
        System.out.println("Old novelist is writing a novel...");
    }
}
