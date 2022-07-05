package ocp.t_09.aufgabe_04;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class MainController {

  @FXML
  private TextField sourceFolder_tf;

  @FXML
  private TextField rootPackage_tf;

  @FXML
  private TextField chapterCount_tf;

  @FXML
  private TextField prefix_tf;

  @FXML
  private TextField postfix_tf;

  @FXML
  private TextField startIndex_tf;

  @FXML
  private TextField endIndex_tf;

  @FXML
  private TextField step_tf;

  @FXML
  private TextField packageCharCount_tf;


  @FXML
  private CheckBox generateTestClass_check;

  @FXML
  private TextField testClassName_tf;


  @FXML
  private TextField referenceClassName_tf;

  @FXML
  private CheckBox generateMavenResourceFolders_check;

  @FXML
  private TextArea output_ta;

  private Stage stage;

  @FXML
  void initialize() {
    System.out.println("===> MainController.initialize()");
  }

  private void sortContentTextArea() {
    String sortedContent = Stream.of(output_ta.getText().split("\n"))
                               .sorted()
                               .collect(joining("\n"));
    output_ta.setText(sortedContent);
    output_ta.appendText("\n\nGenerierung ausgefÃ¼hrt!");
  }

  @FXML
  void chooseSourceFolder(ActionEvent event) {
    // FileChooser
    System.out.println("Choose Source Folder");

  }

  @FXML
  void generate(ActionEvent event) throws IOException {
    clearTextAreaOutput();
    System.out.println("===> Generating Packages and Test Classes ...");
    // TODO
    
  }

  private String textOf(TextField tf) {
    return tf.getText();
  }

  private int intOf(TextField tf) {
    return Integer.parseInt(tf.getText());
  }

  public void clearTextAreaOutput() {
    output_ta.setText("");
  }

}
