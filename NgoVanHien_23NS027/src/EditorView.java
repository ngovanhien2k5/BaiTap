import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class EditorView extends JFrame{
    private JTextArea textArea;
    private JButton saveButton;
    private EditorController controller;

    public EditorView(EditorController controller) {
        this.controller = controller;
        initComponents();
    }

    private void initComponents() {
        textArea = new JTextArea(20, 40);
        saveButton = new JButton("Save");
        saveButton.addActionListener(e -> controller.save());

        JScrollPane scrollPane = new JScrollPane(textArea);

        JPanel panel = new JPanel();
        panel.add(scrollPane);
        panel.add(saveButton);

        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public String getText() {
        return textArea.getText();
    }

    public void setText(String text) {
        textArea.setText(text);
    }
}
