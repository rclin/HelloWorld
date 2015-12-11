package nested_classes_and_interfaces;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rilin on 12/10/2015.
 * sample inner class (non-static nested class)
 */
public class BankAccount {
    private long number;    // account #
    private long balance;
    //private Action lastAct; // last action performed
    private History historyList = new History();

    public class Action {
        private String act;
        private long amount;
        Action(String act, long amount) {
            this.act= act;
            this.amount = amount;
        }
        public String toString() {
            // identify enclosing account
            return number + ": " + act + " " + amount;
        }
    }

    public class History {

        private static final int MAX = 10;
        // list of actions

        // add until fill up, then additional add will remove last one
        List<Action> actionsList;

        // capture last ten actions
        public History() {

            // intialize to # actions
            actionsList = new ArrayList<Action>();
        }

        public void add(Action action) {

            if (actionsList.size() < MAX) {
                actionsList.add(action);
            } else {
                actionsList.remove(MAX);
                actionsList.add(action);
            }

        }


    }

    public void deposit(long amount) {
        balance += amount;
        //lastAct = new Action("deposit", amount);
        historyList.add(new Action("deposit", amount));
    }

    public void withdraw(long amount) {
        balance -= amount;
        //lastAct = new Action("withdraw", amount);
        historyList.add(new Action("withdraw", amount));
    }

//    public void transfer(BankAccount other, long amount) {
//        other.withdraw(amount);
//        deposit(amount);
//        lastAct = this.new Action("transfer", amount);
//        other.lastAct = other.new Action("transfer", amount);
//    }

    public static void main(String[] args) {

        BankAccount ba1 = new BankAccount();
        ba1.deposit(100);

    }

}
