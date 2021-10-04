package edu.northeastern.csye7374.factory;
import edu.northeastern.csye7374.buttons.Button;
import edu.northeastern.csye7374.buttons.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class htmlDialog extends Dialog {
	
	
	public Button createButton() {
		// TODO Auto-generated method stub
        return new HtmlButton();
	}

}
