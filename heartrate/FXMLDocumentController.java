package heartrate;


import java.math.BigDecimal;
import java.text.NumberFormat;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController {

    @FXML private Label ageLable;
    @FXML private Label maximunLable;
    @FXML private TextField ageTextField;
    @FXML private Button calculateButton;
    @FXML private Label targetLable;
    

   
    @FXML
    void handleButtonAction(ActionEvent event) {
        try {
            Double age = Double.valueOf(ageTextField.getText());
            Double max = (220 - age);
            int roundoff = max.intValue();
            maximunLable.setText(Integer.toString(roundoff));
            Double min = (0.5*max);
            int targetmin = min.intValue();
            
            Double maxm = (0.85*max);
            int targetmax = maxm.intValue();
            targetLable.setText(targetmin+ " to " + targetmax);
        }
        
        catch (NumberFormatException ex){
            ageTextField.setText("Invalid Value");
            ageTextField.selectAll();
            ageTextField.requestFocus();
            
    }
    }

    }

  


