import java.util.ArrayList;
import java.util.List;

public class Tree {
    private int _root;
    private List<Tree> _subtrees;
    // TODO complete this Tree class to replicate the implementation from the Tree class in adts.py

    public Tree(Integer root, List<Tree> subtrees) {
        this._root = root;
        if (subtrees == null) {
            this._subtrees = new ArrayList<Tree>();
        } else {
            List<Tree> temp_list = new ArrayList<Tree>(subtrees);
            this._subtrees = temp_list;
        }
    }
}
