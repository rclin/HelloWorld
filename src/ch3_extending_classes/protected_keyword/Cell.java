package ch3_extending_classes.protected_keyword;

/**
 * Created by rilin on 12/9/2015.
 */
public class Cell {
    private Cell next;
    private Object element;

    public Cell(Object element) {
        this.element = element;
    }

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }
}
