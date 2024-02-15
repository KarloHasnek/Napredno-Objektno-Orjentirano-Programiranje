package vjezba8.MVC.controller;

import java.util.List;
import vjezba8.MVC.model.DataBase;
import vjezba8.MVC.model.Programmer;
import vjezba8.MVC.view.PresentationPanel;


public class Controller {

    private DataBase db;

    public Controller() {
        db = new DataBase();
    }

    public void addNewProgrammer2DB(Programmer programmer) {
        db.setProgrammer2DB(programmer);
    }

    public List<Programmer> getAllProgrammers(){
        return db.getAll4DB();
    }

    public void showOnPresPanel(Programmer prgm, PresentationPanel presPanel) {
        presPanel.showOnPresPanel(prgm);
    }

}