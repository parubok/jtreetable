package treetable;

public class DemoTreeTableModel extends AbstractTreeTableModel {

    private static final String root = "Root";

    DemoTreeTableModel() {
        super(root);
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Class getColumnClass(int column) {
        return column == 0 ? TreeTableModel.class : Object.class;
    }

    @Override
    public String getColumnName(int column) {
        return "Column " + column;
    }

    @Override
    public Object getValueAt(Object node, int column) {
        return node.toString() + "@" + column;
    }

    @Override
    public Object getChild(Object parent, int index) {
        return "Child " + index;
    }

    @Override
    public int getChildCount(Object parent) {
        return parent.equals(root) ? 3 : 0;
    }
}
