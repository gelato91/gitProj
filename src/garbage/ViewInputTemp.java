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

	// status�� �ٲ�޶�� ��û�ϴ� �ż���
	void set(Status status)
	{
		System.out.println(status.toString());
	}
	
	void drawStatus(ProgramController.Status status)
	{
		// status�� �ش��ϴ� View�� �����Ѵ�.
		// CardLayout �� Ȱ���Ͽ� �̹����� ������ ���ĵΰ�
		// �ʿ�� �Ҷ����� �ϳ��� �����ִ� ����� ���Ѵ�.
	}
	
	
	
	// �̺�Ʈ �����ʵ�
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
