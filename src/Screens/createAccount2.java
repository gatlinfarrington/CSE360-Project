import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.scene.control.Label;  
import javafx.scene.control.TextField;  
import javafx.scene.layout.GridPane;  
import javafx.stage.Stage; 

public class createAccount2 extends Application {  
  
      
/*public static void main(String[] args) {  
launch(args);     
}  
  */
@Override  
public void start(Stage stage)
{  
    // TODO Auto-generated method stub  
    Label name = new Label("Name ");  
    Label Age = new Label("Password "); 
    Label Address = new Label("Address ");
    Label phoneNumber = new Label("Phone Number ");
    Label Email = new Label("Email ");
    TextField tf1 = new TextField();  
    TextField tf2 = new TextField();
    TextField tf3 = new TextField();  
    TextField tf4 = new TextField();
    TextField tf5 = new TextField();
    
    Button create = new Button("Create");  
    //create.setOnAction(e->System.out.println("You entered: User_ID: "+tf1.getText()+""+"Password: "+tf2.getText()));  
    GridPane root = new GridPane();  
    root.addRow(0, name, tf1);
    root.addRow(2, Age, tf2);
    root.addRow(4, Address, tf3);
    root.addRow(6, phoneNumber, tf4);
    root.addRow(8, Email, tf5);
    root.addRow(10, create);  
    Scene scene = new Scene(root, 500, 500);  
    stage.setScene(scene);  
    stage.setTitle("Create New Account");  
    stage.show();  
    }  
}  
