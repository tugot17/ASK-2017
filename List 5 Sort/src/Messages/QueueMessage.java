package Messages;

import java.text.MessageFormat;

/**
 * Created by pmazurek on 12.05.2017.
 */
public class QueueMessage {
    static public String showQueueInformations(String queName, int amountOfComparasion, int amountOfSwaps ){

        String message= MessageFormat.format("In {0} queue {1} comparations between numbers has been done and {2} numbers has been swaped",
                queName, amountOfComparasion, amountOfSwaps);
        System.out.print(message);

        return message;
    }
}
