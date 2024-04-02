import java.io.File;
import java.io.IOException;

public class EditorController {
    private EditorModel model;
    private EditorView view;

    public EditorController(EditorModel model, EditorView view) {
        this.model = model;
        this.view = view;
    }

    public void save() {
        if (view != null) {
            String text = view.getText();
            model.addLine(text);
        }
    }

    public void load(File file) throws IOException {
        if (view != null) { 
            model.loadFromFile(file);
            view.setText(String.join("\n", model.getLines()));
        }
    }
}