import java.util.HashSet;
import java.util.Iterator;

public class HumanIterator implements Iterator<Human> {
    private int index;
    private HashSet<Human> familyTree;

    public HumanIterator(HashSet<Human> familyTree) {

        this.familyTree = familyTree;
    }

    @Override
    public boolean hasNext() {
        return index < familyTree.size();
    }

    @Override
    public Human next() {
        return null;
    }

}
