package vjezba3.zadatak1;

public class AppCli {

    public static void main(String[] args) {

        NovelWriter novelWriter = new NovelWriter("Karlo");
        OldNovelist oldNovelist = new OldNovelist("Ivan");

        WriterAdapter writerAdapter = new WriterAdapter(oldNovelist);

        novelWriter.writeNovel("SF");
        writerAdapter.writeNovel("SF");
    }
}
