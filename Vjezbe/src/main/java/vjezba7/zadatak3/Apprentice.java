package vjezba7.zadatak3;

public class Apprentice extends Master {


    public Apprentice(String name) {
        this.name = name;
        if(description==null) {
            this.description = "Apprentice";
        }

    }

    @Override
    public void askforAdvice() {

        System.out.println(description + " ask for an advice...");

    }

    @Override
    public void giveAdvice() throws Exception {
        throw new Exception("Can't give an advice!!!");

    }

    @Override
    public void bringTools() {

        System.out.println("Every repairman can and should bring a tool bag ...");

    }

    @Override
    public void performRepair() throws Exception {

        throw new Exception("Still can not perform repairs!!!");

    }

    @Override
    public void performMaintance() throws Exception {

        throw new Exception("Not able to do maintance jobs...");

    }


}
