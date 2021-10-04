package edu.northeastern.csye7374.factory;

import edu.northeastern.csye7374.buttons.Button;
import edu.northeastern.csye7374.buttons.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
	  
	    public Button createButton() {
	        return new WindowsButton();
	    }
}
