package pckg_mvc_1.controller;

import pckg_mvc_1.model.Database;
import pckg_mvc_1.model.Programmer;
import pckg_mvc_1.view.ViewPanel;

import java.io.File;
import java.util.List;

public class AppController {

    private Database database;

    public AppController() {
        database = new Database();
    }

    public void addNewProgrammerToDatabase(Programmer programmer) {
        database.addProgrammerToDatabase(programmer);
    }

    public List<Programmer> getProgrammerList() {
        return database.getProgrammerList();
    }

    public void showAllDataFromDatabaseOnViewPanel(ViewPanel viewPanel) {
        viewPanel.showDataFromDatabase(database.getProgrammerList());
    }

    public void saveDataToFile(File file) {
        database.saveDataToFile(file);

    }

    public List<Programmer> loadDataFromFile(File file) {
        List<Programmer> programmerList = database.loadDataFromFile(file);
        return programmerList;
    }
}
