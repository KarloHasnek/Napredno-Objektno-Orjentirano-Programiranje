package vjezba3.zadatak1;

public class NovelWriter implements WriterInterface{

    private String writerName;

    public NovelWriter(String writerName) {
        this.writerName = writerName;
    }

    @Override
    public void writeNovel(String novelType) {
        System.out.println("Novel writer " + writerName + " is writing a novel of type " + novelType);
    }

    @Override
    public String toString() {
        return "NovelWriter{" +
                "writerName='" + writerName + '\'' +
                '}';
    }
}
