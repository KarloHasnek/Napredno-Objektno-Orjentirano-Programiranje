package pckg_arraylist_command_problem;

public interface CommandOnList<E> {

    void runCommand();
    void undoCommand();
}
