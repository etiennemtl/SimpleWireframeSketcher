package android.mcguffin.simplewireframesketcher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by etienne on 2016-06-20.
 */
public class ActionMemento {

    private List<Command> commands;

    public ActionMemento() {
        commands = new ArrayList<Command>();
    }

    public void addAction(Command command) {
        commands.add(command);
    }

    public void undo(List<Stroke> strokes) {
        if (!commands.isEmpty()) {
            Command removedCommand = commands.remove(commands.size() - 1);
            if (removedCommand.type == CommandType.DRAW) {
                for (Integer key: removedCommand.map.keySet()) {
                    strokes.remove(removedCommand.map.get(key));
                }
            } else {
                for (Integer key: removedCommand.map.keySet()) {
                    strokes.add(key.intValue(),removedCommand.map.get(key));
                }
            }
        }
    }

}
