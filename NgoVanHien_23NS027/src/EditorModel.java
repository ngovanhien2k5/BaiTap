import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EditorModel {
    private List<String> lines;

    public EditorModel(){
        lines = new ArrayList<>();
    }

    public void addLine(String line){
        lines.add(line);
    }

    public List<String> getLines() {
        return lines;
    }

    public void loadFromFile(File file) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
    }

    
    public void saveToFile(File file) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
