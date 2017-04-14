package List;

import java.io.Serializable;

/**
 * Created by pmazurek on 07.04.2017.
 */
public class LinkedList implements List {

    //<editor-fold desc="Variables & Objects">
    private final Element _headAndTail = new Element(null); // wartownik
    private int _size;
    //</editor-fold>


    //<editor-fold desc="Constructors">
    public LinkedList()
    { clear();}
    //</editor-fold>


    //<editor-fold desc="Public Methods">
    public void insert(int index, Object value) throws IndexOutOfBoundsException {
        if(index<0 || index>_size) throw new IndexOutOfBoundsException();
        Element element = new Element(value);
        element.attachBefore(getElement(index));
        ++_size;
    }

    public Object delete(int index) throws IndexOutOfBoundsException {
        checkOutOfBounds(index);
        Element element = getElement(index);
        element.detach();
        --_size;
        return element.getValue();
    }

    public boolean delete(Object value) {
        Element e = _headAndTail.getNext();
        while (e != _headAndTail && ! value.equals(e.getValue()))
            e = e.getNext();
        if (e != _headAndTail) {
            e.detach(); --_size; return true;
        }
        else return false;
    }

    public void add(Object value)
    {
        insert(size(), value);
    }

    public boolean contains(Object value)
    {
        return indexOf(value) != -1;
    }

    public boolean isEmpty()
    {
        return _size == 0;
    }

    public void clear()
    {
        _headAndTail.setPrevious(_headAndTail);
        _headAndTail.setNext(_headAndTail);
        _size = 0;
    }

    public Object set(int index, Object value) throws IndexOutOfBoundsException
    {
        checkOutOfBounds(index);
        Element element = getElement(index);
        Object oldValue = element.getValue();
        element.setValue(value);
        return oldValue;
    }

    public Object get(int index) throws IndexOutOfBoundsException
    {
        checkOutOfBounds(index);
        return getElement(index).getValue();
    }

    public Iterator iterator()
    {
        return new ValueIterator();
    }

    public int indexOf(Object value)
    {
        int index = 0;
        Element e = _headAndTail.getNext();
        while( e != _headAndTail && ! value.equals(e.getValue()))
        { e = e.getNext(); ++index; }
        return e!=_headAndTail ? index : -1;
    }

    public int size()
    {
        return _size;
    }


    public String toString()
    {
        Iterator it= iterator();


        while (!it.isDone())
        {

        }

        return "";
    }
    //</editor-fold>


    //<editor-fold desc="Private Methods">
    private Element getElement(int index)
    {
        return index< _size/2 ? getElementForwards(index) : getElementBackwards(index);
    }

    private Element getElementForwards(int index)
    {
        Element element = _headAndTail.getNext();

        for (int i = index; i > 0; --i)
            element = element.getNext();
        return element;
    }

    private Element getElementBackwards(int index)
    {
        Element element = _headAndTail;
        for (int i = _size - index; i > 0; --i)
            element = element.getPrevious();
        return element;
    }


    private void checkOutOfBounds(int index) throws IndexOutOfBoundsException
    {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
    }
    //</editor-fold>


    //<editor-fold desc="Inner Classes">
    private static final class Element implements Serializable {
        private Object _value;
        private Element _previous;
        private Element _next;

        public Element(Object value)
        { setValue(value); }

        public void setValue(Object value)
        { _value = value;  }

        public Object getValue()
        { return _value;   }

        public Element getPrevious()
        { return _previous;}

        public void setPrevious(Element previous)
        { _previous = previous; }

        public Element getNext()
        { return _next; }

        public void setNext(Element next)
        { _next = next; }

        public void attachBefore(Element next) {
            Element previous = next.getPrevious();
            setNext(next);
            setPrevious(previous);
            next.setPrevious(this);
            previous.setNext(this);
        }
        public void detach() {
            _previous.setNext(_next);
            _next.setPrevious(_previous);
        }
    }


    private final class ValueIterator implements Iterator {
        private Element _current = _headAndTail;
        public void first()
        { _current = _headAndTail.getNext(); }

        public void last()
        { _current = _headAndTail.getPrevious(); }

        public boolean isDone()
        { return _current == _headAndTail; }

        public void next()
        { _current = _current.getNext(); }

        public void previous()
        { _current = _current.getPrevious(); }

        public Object current() throws IndexOutOfBoundsException
        {
            if (isDone())
                throw new IndexOutOfBoundsException();
            return _current.getValue();
        }
    }
    //</editor-fold>
}
