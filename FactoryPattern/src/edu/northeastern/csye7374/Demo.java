package edu.northeastern.csye7374;

import edu.northeastern.csye7374.factory.Dialog;
import edu.northeastern.csye7374.factory.WindowsDialog;
import edu.northeastern.csye7374.factory.htmlDialog;

public class Demo {
	private static Dialog dialog;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		configure();
        runBusinessLogic();
	}
	/**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new htmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
