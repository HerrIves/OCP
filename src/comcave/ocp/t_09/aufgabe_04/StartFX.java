package ocp.t_09.aufgabe_04;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartFX extends Application {
  
  @Override
  public void start(Stage window) throws Exception {
//    Parent root = FXMLLoader.load(getClass().getResource("/aufgabe09a_create_exam_files/view/Main.fxml"));
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/Main.fxml"));
    Parent root = (Parent)loader.load();
    Scene scene = new Scene(root);
    window.setScene(scene);
    window.setTitle("Source Generator");
    window.show();
  }

  public static void main(String[] args) {
    launch(args);
  }

}
