import java.io.File;
import java.io.IOException;


public class EditorApp {
    public static void main(String[] args) {
        EditorModel model = new EditorModel();
        EditorController controller;
        EditorView view;
        try {
            File file = new File("C:/Users/MY HP/OneDrive/Máy tính/java/NgoVanHien_23NS027/BaiTap.txt");
            if (!file.exists()) {
                file.createNewFile(); 
            }
            controller = new EditorController(model, view);
            view = new EditorView(controller); 
            model.loadFromFile(file);
            model.saveToFile(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}