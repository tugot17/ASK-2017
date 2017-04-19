/**
 * Created by pmazurek on 19.04.2017.
 */
public class Stoper {

    //region Variables
    private long start;

    private long stop;

    private String nazwa;
    //endregion

    //region Constructors
    public Stoper()
    {

        this("");
    }

    public Stoper(String nazwa)
    {

        this.nazwa = nazwa;
    }
    //endregion

    //region Public Methods
    public void start()
    {
        start = System.currentTimeMillis();
    }

    public void stop()
    {
        stop = System.currentTimeMillis();
    }

    public double getResult()
    {
        return ((stop - start) / 1000.0);
    }

    public String toString()
    {
        return nazwa + ": " + this.getResult() + " s.";
    }
    //endregion
}
