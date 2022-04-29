package gameplay;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class Images 
{
	public static Image pacmanUp;
	public static Image upScaled;
	public static Image pacmanDown;
	public static Image downScaled;
	public static Image pacmanRight;
	public static Image rightScaled;
	public static Image pacmanLeft;
	public static Image leftScaled;
	public static Image blinkyScaled;
	public static Image blinky;
	public static Image pinkyScaled;
	public static Image pinky;
	public static Image inkyScaled;
	public static Image inky;
	public static Image clydeScaled;
	public static Image clyde;

	
	public static void loadImages() throws SlickException
	{
		pacmanUp= new Image("res/pacUp.png");
		upScaled=pacmanUp.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanDown= new Image("res/pacDown.png");		
		downScaled=pacmanDown.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanRight= new Image("res/pacRight.png");
		rightScaled=pacmanRight.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		pacmanLeft= new Image("res/pacLeft.png");
		leftScaled=pacmanLeft.getScaledCopy(Cell.CELL_SIZE,Cell.CELL_SIZE);
		blinky=new Image("res/purpleghost.png");
		blinkyScaled= blinky.getScaledCopy(10,10);
		pinky=new Image("res/pinkghost.png");
		pinkyScaled= pinky.getScaledCopy(10,10);
		inky=new Image("res/blueghost.png");
		inkyScaled= inky.getScaledCopy(10,10);
		clyde=new Image("res/greenghost.png");
		clydeScaled= clyde.getScaledCopy(10,10);
	}
	
}
