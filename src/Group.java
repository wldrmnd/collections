import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Group {

    private List<String> members;

    public Group(LinkedList<String> members) {
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<String> members) {
        this.members = members;
    }
}
