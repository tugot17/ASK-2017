package Messages;

import java.text.MessageFormat;

/**
 * Created by pmazurek on 19.04.2017.
 */
public class SortMessage {

    static public String showSortInformations(String sortName, int amountOfSortedElements, int amountOfComparasions, double totalSortingTime){

            String message= MessageFormat.format("{0} Sort in which {1} were used has taken {3} s. and {2} comparasions has been done\n",
                    sortName, amountOfSortedElements, totalSortingTime, totalSortingTime);
            System.out.print(message);
            return message;
    }

}
