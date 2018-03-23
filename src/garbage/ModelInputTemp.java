package garbage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.MouseInputListener;

import fortress.controllers.ProgramController;
import fortress.controllers.ProgramController.Status;
import fortress.models.Game;
import fortress.models.Player;

public class ModelInputTemp implements MouseInputListener,KeyListener{
	
	ProgramController gc;
	Game game;
	
	public ModelInputTemp(ProgramController gc)
	{
		this.gc = gc;
		gc.mit = this;
		set(gc.gameStat);
		this.game = Game.getInstance();
	}


	void set(Status status)
	{
		System.out.println(status.toString());
	}
	
	void setGameLocal(boolean local)
	{
		game.setLocal(local);
	}
	
	void addGamePlayer(Player player)
	{
		game.addPlayer(player);
	}
	
	void setGameWind(int n)
	{
		game.setWind(n);
	}
	
	void setGameWindDir(int n)
	{
		game.setWindDir(n);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(" ModelInputTemp " + e.toString());
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
	}

}
