import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//https://javarush.ru/groups/posts/431-10-voprosov-po-abstraktnihm-klassam-i-interfeysam-s-sobesedovaniy-po-jazihku-java
// ЕСЛИ СПРАШИВАЮТ ПРО ПАТТЕРНЫ, НЕ НАЗЫВАЙТЕ СИНГЛТОН
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
