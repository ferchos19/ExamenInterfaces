package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;


public class SceneControler implements Initializable{


	    @FXML
	    private Pane pane1;

	    @FXML
	    private Pane pane2;

	    @FXML
	    private ImageView imagen;
	    

    
   public void initialize(URL location, ResourceBundle resources) {
	   translateAnimation(0.1,pane2,600);

	   rotateAnimation();

   }
   public void rotateAnimation() {
	   RotateTransition rotation = new RotateTransition(Duration.seconds(2),imagen);
	   rotation.setByAngle(360*2);
	   rotation.play();
	   
	   
	   
   }
   public void translateAnimation(double duracion, Node node, int distancia) {
	   TranslateTransition translate = new TranslateTransition(Duration.seconds(duracion),node); 
	   translate.setByY(distancia);
	   translate.play();
   }
   
   int slideActual=1;
   @FXML
   void nextAction()  {
	   if(slideActual ==1) {
		   translateAnimation(0.5,pane2,-600);
		   slideActual++;
		   }
		   
	   
   }
   
   @FXML
   void backAction() {
	   if(slideActual ==2) {
		   translateAnimation(0.5,pane2,600);
		   slideActual--;
	   }
	   
   }

}
