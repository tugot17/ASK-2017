package List;

/**
 * Created by pmazurek on 07.04.2017.
 */
public interface Iterator {
    public void next();

    public void first();

    public boolean isDone();

    public Object current();
}
