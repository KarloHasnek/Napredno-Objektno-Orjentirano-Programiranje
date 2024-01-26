package vjezba2.zadatak4;

public class AppTest {

    public static void main(String[] args) {

        SourceProject sourceProject = new SourceProject();
        FrontendProgrammer frontendProgrammer = new FrontendProgrammer("Karlo");
        BackendProgrammer backendProgrammer = new BackendProgrammer("Ivan");

        sourceProject.addObserver(frontendProgrammer);
        sourceProject.addObserver(backendProgrammer);
        sourceProject.setCode("Some code written in Java programming language", frontendProgrammer);
        sourceProject.notifyObservers();

    }
}
