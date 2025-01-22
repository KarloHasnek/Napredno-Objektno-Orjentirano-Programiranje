package pckg_mvc_1.model;

import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private List<Programmer> programmerList;

    public Database() {
        programmerList = new ArrayList<>();
    }

    public void addProgrammerToDatabase(Programmer programmer) {
        if (programmer == null) {
            throw new NullPointerException("Programmer cannot be null");
        } else if (programmerList.contains(programmer)) {
            JOptionPane.showMessageDialog(null, "Programmer already exists in the database");
            throw new IllegalArgumentException("Programmer already exists in the database");
        } else {
            programmerList.add(programmer);
        }
    }

    public List<Programmer> getProgrammerList() {
        if (programmerList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Database is empty");
            throw new IllegalArgumentException("Database is empty");
        } else {
            return programmerList;
        }
    }

    public void saveDataToFile(File file) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(programmerList);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving data to file", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public List<Programmer> loadDataFromFile(File file) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            programmerList = (List<Programmer>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error loading data from file", "Error", JOptionPane.ERROR_MESSAGE);
        }

        return programmerList;
    }
}
