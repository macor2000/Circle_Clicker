import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.math.*;

// Lab 7: Colored circle game
// Matthew Correia

public class Color_Circle extends Application {
	Circle circle = new Circle(10);
	
	 Pane pane = new Pane();
	 long starttime = System.currentTimeMillis();
 int count = 1 ;
	
		public static void main(String[] args) {
			launch(args);
			}

		@Override
		public void start(Stage primaryStage) throws Exception {
			circle.setFill(getColor());   // Get a randomized color for the circle
										
			circle.setCenterX(50);
			circle.setCenterY(50);
			pane.getChildren().add(circle);
			Scene scene = new Scene(pane);	// Set the scene for the circle
			primaryStage.setScene(scene);
			primaryStage.show();
			
		    circle.setOnMouseClicked(e ->{          // Instruction for when the mouse event occurs
		    	  if(count<10) {
				    	
				    	
		    	circle.setCenterX(Math.random()*pane.getWidth());
		    	circle.setCenterY(Math.random()*pane.getHeight());			// Randomize x,y values and color
		    	circle.setFill(getColor());
		    	count++;  // add one to the count
		    	
		    	
		    	// System.out.println(count);	
		    	}
		    	  else {
		    		 pane.getChildren().clear();
			    	   long endtime = System.currentTimeMillis();    // Once count is finished find current time
						
						System.out.println("All done");
						long totaltime = (endtime - starttime)/1000;	// Subtract endtime from startime and devide by 1000 to get total time in seconds
						
						Text txt = new Text(50,50, ("Total time: " + totaltime + " seconds") );
						pane.getChildren().add(txt);		// Add the text to the pane
						
						
						}
		    	
		    });
		    
		  
		    
		    	
		    
		
	}
		 
		public Color getColor() { 	// Method to create a randomized color the circle can be filled with. Only creates color that are easily visible
		        Color color = new Color(Math.random(),Math.random(),Math.random(),1);
		      
		    		  
		    
			return color;
		}

	
}
		
		
		
		
		


				
	
       


				
		
	
	
	
	


