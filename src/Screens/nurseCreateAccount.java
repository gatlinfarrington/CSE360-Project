import java.awt.Insets;

import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage; 

public class nurseCreateAccount extends Application {  
  
      
/*public static void main(String[] args) {  
launch(args);     
}  
  */
@Override  
public void start(Stage stage)
{  
    // TODO Auto-generated method stub  
    Label name = new Label("Nurse Name ");  
    Label Age = new Label("Password "); 
    Label Address = new Label("Address ");
    Label phoneNumber = new Label("Phone Number ");
    Label Email = new Label("Email ");
    TextField textField1 = new TextField();  
    TextField textField2 = new TextField();
    TextField textField3 = new TextField();  
    TextField textField4 = new TextField();
    TextField textField5 = new TextField();
    
    Button create = new Button("Create");  
    //create.setOnAction(e->System.out.println("You entered: User_ID: "+tf1.getText()+""+"Password: "+tf2.getText()));  
    GridPane root = new GridPane();
    root.setHgap(20);
    root.setVgap(20);
    root.addRow(0, name, textField1);
    root.addRow(2, Age, textField2);
    root.addRow(4, Address, textField3);
    root.addRow(6, phoneNumber, textField4);
    root.addRow(8, Email, textField5);
    root.addRow(10, create);  
    Scene scene = new Scene(root, 500, 500);  
    stage.setScene(scene);  
    stage.setTitle("Create New Account");  
    stage.show();  
    }  
}  