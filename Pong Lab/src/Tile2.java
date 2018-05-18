import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Tile2 extends Block
{
	private ArrayList<Block> topTiles;
	private ArrayList<Block> bottomTiles;
	private ArrayList<Block> leftTiles;
	private ArrayList<Block> rightTiles;
	private Graphics window;
	
	
	public Tile2()
	{
		topTiles = new ArrayList<Block>();
		bottomTiles = new ArrayList<Block>();
		leftTiles = new ArrayList<Block>();
		rightTiles = new ArrayList<Block>();
		for (int i = 0; i < 760; i+=40)
		{
			topTiles.add(new Block(i, 0, 39, 20, Color.PINK));
			topTiles.add(new Block(i, 20, 39, 20, Color.GRAY));
			topTiles.add(new Block(i,40,39,20,Color.RED));
			bottomTiles.add(new Block(i, 540, 39, 20, Color.PINK));
			bottomTiles.add(new Block(i, 520, 39, 20, Color.GRAY));
			bottomTiles.add(new Block(i,500,39,20,Color.RED));
		}
		
		for (int j = 0; j < 560; j+=40)
		{
			leftTiles.add(new Block(0,j,20,39,Color.PINK));
			leftTiles.add(new Block(20, j, 20, 39, Color.GRAY));
			leftTiles.add(new Block(40,j,20,39,Color.RED));
			rightTiles.add(new Block(765, j, 20, 39, Color.PINK));
			rightTiles.add(new Block(745, j, 20, 39, Color.GRAY));
			rightTiles.add(new Block(725,j,20,39,Color.RED));
		}
	}
	
	

	public void drawEmAll( Graphics window )
	{
		this.window = window;
		for (Block t: topTiles)
		{
			t.draw(window);
		}
		for (Block t: rightTiles)
		{
			t.draw(window);
		}
		for (Block t: bottomTiles)
		{
			t.draw(window);
		}
		for (Block t: leftTiles)
		{
			t.draw(window);
		}
		
		
	}
	public int removeDeadOnes(Ball ball)
	{
		int x = 0;
		for(int i = 0; i < topTiles.size(); i ++){
			if(ball.getX()>=topTiles.get(i).getX()&&ball.getX()<=topTiles.get(i).getX()+topTiles.get(i).getWidth()){
				if(ball.getY()>=topTiles.get(i).getY()&&ball.getY()<=topTiles.get(i).getY()+topTiles.get(i).getHeight()){
					window.setColor(Color.WHITE);
					window.fillRect(topTiles.get(i).getX(), topTiles.get(i).getY(), topTiles.get(i).getWidth(), topTiles.get(i).getHeight());
					if(topTiles.get(i).getHeight()<75){
						x = 1;
					}
					if(topTiles.get(i).getHeight()>=75){
						x = 2;
					}
					topTiles.remove(i);
				}
			}
		}
		for(int i = 0; i < bottomTiles.size(); i ++){
			if(ball.getX()>=bottomTiles.get(i).getX()&&ball.getX()<=bottomTiles.get(i).getX()+bottomTiles.get(i).getWidth()){
				if(ball.getY()>=bottomTiles.get(i).getY()&&ball.getY()<=bottomTiles.get(i).getY()+bottomTiles.get(i).getHeight()){
					window.setColor(Color.WHITE);
					window.fillRect(bottomTiles.get(i).getX(), bottomTiles.get(i).getY(), bottomTiles.get(i).getWidth(), bottomTiles.get(i).getHeight());
					if(bottomTiles.get(i).getHeight()<75){
						x = 1;
					}
					if(bottomTiles.get(i).getHeight()>=75){
						x = 2;
					}
					bottomTiles.remove(i);
				}
			}
		}
		for(int i = 0; i < leftTiles.size(); i ++){
			if(ball.getX()>=leftTiles.get(i).getX()&&ball.getX()<=leftTiles.get(i).getX()+leftTiles.get(i).getWidth()){
				if(ball.getY()>=leftTiles.get(i).getY()&&ball.getY()<=leftTiles.get(i).getY()+leftTiles.get(i).getHeight()){
					window.setColor(Color.WHITE);
					window.fillRect(leftTiles.get(i).getX(), leftTiles.get(i).getY(), leftTiles.get(i).getWidth(), leftTiles.get(i).getHeight());
					if(leftTiles.get(i).getHeight()<75){
						x = 1;
					}
					if(leftTiles.get(i).getHeight()>=75){
						x = 2;
					}
					leftTiles.remove(i);
				}
			}
		}
		for(int i = 0; i < rightTiles.size(); i ++){
			if(ball.getX()>=rightTiles.get(i).getX()&&ball.getX()<=rightTiles.get(i).getX()+rightTiles.get(i).getWidth()){
				if(ball.getY()>=rightTiles.get(i).getY()&&ball.getY()<=rightTiles.get(i).getY()+rightTiles.get(i).getHeight()){
					window.setColor(Color.WHITE);
					window.fillRect(rightTiles.get(i).getX(), rightTiles.get(i).getY(), rightTiles.get(i).getWidth(), rightTiles.get(i).getHeight());
					if(rightTiles.get(i).getHeight()<75){
						x = 1;
					}
					if(rightTiles.get(i).getHeight()>=75){
						x = 2;
					}
					rightTiles.remove(i);
				}
			}
		}
		return x;
	}
	
	public int getSize(){
		return topTiles.size()+bottomTiles.size()+leftTiles.size()+rightTiles.size();
	}
}