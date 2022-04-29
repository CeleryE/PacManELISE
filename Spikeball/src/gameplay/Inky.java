package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Inky extends Ghosts
{
	private int startX;
	private int startY;
	private final int COUNTDOWN = 8;
	private boolean directionUP = true;
	private final static int SPEED = 6;
	
	public Inky(int x, int y) {
		
	}

	public void render(Graphics g) 
	{
		g.drawImage(Images.blinky, startX, startY);

	}

	public void update() 
	{
		
	}
	public void chase()
	{
		
	}
	public void scatter() 
	{
		
	}
	public void frightened()
	{
		
	}

}




