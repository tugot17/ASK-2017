package Ques;

import java.util.Comparator;

/**
 * Created by pmazurek on 12.05.2017.
 */
public class HeapOrderedListPriorityQueue implements Queue {

    //<editor-fold desc="Elements">
    private LinkedList _list;
    private Comparator _comparator;

    private int amountOfComparation;
    private int amountOfSwaps;
    //</editor-fold>

    //<editor-fold desc="Constructor">
    public HeapOrderedListPriorityQueue( Comparator _comparator) {
        this._list = new LinkedList();
        this._comparator = _comparator;

        amountOfComparation = 0;
        amountOfSwaps = 0;
    }
    //</editor-fold>

    //<editor-fold desc="Public Methods">
    public void enqueue(Object value) {
        _list.add(value);
        swim(_list.size() - 1);
    }

    public Object dequeue() throws EmptyQueueException {
        if (isEmpty()) throw new EmptyQueueException();
        Object result = _list.get(0);
        if (_list.size() > 1) {
            _list.set(0, _list.get(_list.size() - 1));
            sink(0);
        }
        _list.delete(_list.size() - 1);
        return result;
    }

    public void clear() {
        _list.clear();
    }
    public int size() {
        return _list.size();
    }
    public boolean isEmpty() {
        return _list.isEmpty();
    }

    public int getAmountOfComparation() {
        return amountOfComparation;
    }

    public int getAmountOfSwaps() {
        return amountOfSwaps;
    }

    //</editor-fold>

    //<editor-fold desc="Private Methods">
    private void swim(int index) {
        int parent;
        while(index != 0 && _comparator.compare(_list.get(index), _list.get(parent= (index - 1) / 2)) > 0)
        { swap(index, parent);
            index=parent;
        amountOfComparation++;
        }
    }
    private void swap(int index1, int index2) {
        Object temp = _list.get(index1);
        _list.set(index1, _list.get(index2));
        _list.set(index2, temp);
        amountOfSwaps += 2;
    }
    private void sink(int index) {
        boolean isDone=false;
        int child;
        while(!isDone && (child=2*index+ 1 ) < _list.size()) {
            if (child < _list.size()-1 && _comparator.compare(_list.get(child), _list.get(child+1)) < 0)
                ++child;
            if (_comparator.compare(_list.get(index), _list.get(child)) < 0)
                swap(index, child);
            else isDone=true;
            index = child;

            amountOfComparation+=2;
        }
    }
    //</editor-fold>

}


