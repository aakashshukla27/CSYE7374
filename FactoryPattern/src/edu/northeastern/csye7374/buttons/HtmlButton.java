package edu.northeastern.csye7374.buttons;

/**
 * 
 * @author aakash
 *	HTML Button implementation
 *	Concrete Product	
 */
public class HtmlButton  implements Button
{
	public void render() {
		System.out.println("<button>Test Button</button>");
	}
	
	public void onClick() {
		System.out.println("Click!!! Button says Hello World!!!!");
	}
}
