package garbage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;

import javax.swing.event.MouseInputListener;

import fortress.controllers.ProgramController;
import fortress.controllers.ProgramController.Status;

public class ViewInputTemp implements MouseInputListener, KeyListener{

	ProgramController gc;
	
	public ViewInputTemp(ProgramController gc)
	{
		this.gc=gc;
		gc.vit = this;
		set(gc.gameStat);
	}

	// status를 바꿔달라고 요청하는 매서드
	void set(Status status)
	{
		System.out.println(status.toString());
	}
	
	void drawStatus(ProgramController.Status status)
	{
		// status에 해당하는 View를 구현한다.
		// CardLayout 을 활용하여 이미지를 여러장 겹쳐두고
		// 필요로 할때마다 하나씩 보여주는 방식을 취한다.
	}
	
	
	
	// 이벤트 리스너들
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
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
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
	}


	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.toString());
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
