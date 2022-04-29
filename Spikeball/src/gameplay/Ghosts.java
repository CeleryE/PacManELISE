package gameplay;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;

public class Ghosts
{
	boolean moreEast;
	boolean moreWest;
	boolean moreSouth;
	boolean moreNorth;
	private int x;
	private int y;



	public void Ghost(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	

	public void render(Graphics g) 
	{
		g.drawImage(Images.blinkyScaled,Cell.CELL_SIZE*13,Cell.CELL_SIZE*14);
		g.drawImage(Images.inkyScaled,Cell.CELL_SIZE*12,Cell.CELL_SIZE*14);
		g.drawImage(Images.clydeScaled,Cell.CELL_SIZE*13,Cell.CELL_SIZE*15);
		g.drawImage(Images.pinkyScaled,Cell.CELL_SIZE*16,Cell.CELL_SIZE*14);

	}

	public void update() 
	{
		
	}
	public void bestCell(int x, int y) {
		if(x>Pacman.getX(x)) {
			moreEast=true;
		}
		if(y>Pacman.getY(y)) {
			moreNorth=true;
		}
		if(x<Pacman.getX(x)) {
			moreWest=true;
		}
		if(y<Pacman.getY(y)) {
			moreSouth=true;
		}
	}
	public void decidingMove(int x, int y) {
		if(moreEast==true) {
			x=x+5;
		}
	}

}





