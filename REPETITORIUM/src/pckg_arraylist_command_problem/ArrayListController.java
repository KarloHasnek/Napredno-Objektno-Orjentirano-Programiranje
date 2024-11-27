package pckg_arraylist_command_problem;

import java.util.Stack;

public class ArrayListController {

    private final Stack<CommandOnList> undoStack;
    private final Stack<CommandOnList> redoStack;
    private CommandOnList currentCommand;

    public ArrayListController() {
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    public void setCommand(CommandOnList command) {
        this.currentCommand = command;
    }

    public void runCommand() {
        if (currentCommand == null) {
            System.out.println("No command to run!");
        } else {
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    public void undoCommand() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo!");
        } else {
            currentCommand = undoStack.pop();
            currentCommand.undoCommand();
            redoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    public void redoCommand() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo!");
        } else {
            currentCommand = redoStack.pop();
            currentCommand.runCommand();
            undoStack.push(currentCommand);
            listUndoStack();
            listRedoStack();
        }
    }

    private void listUndoStack() {
        if (undoStack.isEmpty()) {
            System.out.println("Undo Stack is empty!");
        } else {
            System.out.println("===============================================");
            System.out.println("Undo Stack:");
            for (CommandOnList command : undoStack) {
                System.out.println(command);
            }
        }
    }

    private void listRedoStack() {
        if (redoStack.isEmpty()) {
            System.out.println("Redo Stack is empty!");
        } else {
            System.out.println("===============================================");
            System.out.println("Redo Stack:");
            for (CommandOnList command : redoStack) {
                System.out.println(command);
            }
        }
    }
}
