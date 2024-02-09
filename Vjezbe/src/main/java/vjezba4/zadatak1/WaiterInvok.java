package vjezba4.zadatak1;

public class WaiterInvok {

    private String waiterName;
    private IntCmd command;

    public WaiterInvok(String waiterName) {
        this.waiterName = waiterName;
    }

    public void setOrderCmd(IntCmd command) {
        this.command = command;
        this.command.executeOrder();
    }

    public void setUpOrder(){
        System.out.println(waiterName + " is setting up order");
    }

    public void withdrawOrder(){
        command.undoOrder();
        System.out.println(waiterName + " is withdrawing order");
    }
}
