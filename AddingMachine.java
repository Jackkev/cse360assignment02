package cse360assignment02;

public class AddingMachine {
  private int total;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    string history = "";
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
    total += value;
    history = history + " + " + total;
  }

  public void subtract (int value) {
    total -= value;
    history = history + " - " + total;
  }

  public String toString () {
    return "0" + history;
  }

  public void clear() {
    history = "";
  }
}
