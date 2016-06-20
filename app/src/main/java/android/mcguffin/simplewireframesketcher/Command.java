package android.mcguffin.simplewireframesketcher;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * Created by etienne on 2016-06-20.
 */
public class Command {

    public CommandType type;
    public TreeMap<Integer,Stroke> map;

    public Command(CommandType type, HashMap<Integer, Stroke> map) {
        this.type = type;
        this.map = new TreeMap<Integer, Stroke>(map);
    }
}

enum CommandType {
    DRAW,
    ERASE
}
