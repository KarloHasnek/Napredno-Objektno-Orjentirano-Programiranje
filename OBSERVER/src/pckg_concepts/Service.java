package pckg_concepts;

public class Service {

//    private User user;
    private ServiceSignIn serviceSignIn;
    private String serviceName;

    public Service(String serviceName) {
        this.serviceName = serviceName;
    }

    public void signInToService(ServiceSignIn serviceSignIn) {
        this.serviceSignIn = serviceSignIn;
        serviceSignIn.provideSignInInfo("user1", "password123");
    }
}
