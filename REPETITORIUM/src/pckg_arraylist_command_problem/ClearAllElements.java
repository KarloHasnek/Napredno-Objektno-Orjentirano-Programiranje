package pckg_arraylist_command_problem;

import java.util.ArrayList;

public class ClearAllElements<E> implements CommandOnList<E>{

    private ArrayList<E> list;
    private final ArrayList<E> backupList;

    public ClearAllElements(ArrayList<E> list) {
        this.list = list;
        this.backupList = new ArrayList<>();
    }

    @Override
    public void runCommand() {
        if (list.isEmpty()) {
            System.out.println("List is already empty!");
        } else {
            backupList.addAll(list);
            list.clear();
            System.out.println("All elements removed from the list!");
        }
    }

    @Override
    public void undoCommand() {
        if (!backupList.isEmpty()) {
            list.addAll(backupList);
            backupList.clear();
            System.out.println("Undo command: All elements added back to the list!");
        } else {
            System.out.println("Nothing to undo!");
        }
    }

    @Override
    public String toString() {
        return "Command class: " + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode());
    }
}
