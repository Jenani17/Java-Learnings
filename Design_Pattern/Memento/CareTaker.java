package Memento;

import java.util.Stack;

import Memento.editTool.Memento;

public class CareTaker {

  Stack<editTool.Memento> history = new Stack<Memento>();

  public void save(editTool editTool) {
    history.push(editTool.save());
  }

  public void revert(editTool editTool) {
    if (!history.isEmpty()) {
    	editTool.revert(history.pop());
    } else {
      System.out.println("Cannot UNDO");
    }
  }
}
