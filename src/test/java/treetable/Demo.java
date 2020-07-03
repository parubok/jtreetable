package treetable;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;

public class Demo {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Demo::buildUI);
    }

    private static void buildUI() {
        JPanel contentPanel = new JPanel(new BorderLayout());

        JTreeTable treeTable = new JTreeTable(new DemoTreeTableModel());
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(treeTable);
        contentPanel.add(scrollPane, BorderLayout.CENTER);

        JFrame frame = new JFrame("JTreeTable");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(contentPanel);
        frame.pack();
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
    }
}
