package Ques;

/**
 Created by pmazurek on 26.03.2017. based on Gamma idea
 */

public interface Iterator {

    public void previous();

    public void next();

    public void first();

    public void last();

    public boolean isDone();

    public Object current();

}
