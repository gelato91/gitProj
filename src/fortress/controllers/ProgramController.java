package fortress.controllers;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.MouseInputListener;

import fortress.models.Game;
import fortress.models.Player;
import garbage.ModelInputTemp;
import garbage.ViewInputTemp;

public class ProgramController {

	// ���α׷� ���¸� enumeration���� ��Ÿ��
	// ���º��� �� �� �ڼ��� ������ �����ϰ� �ʹٸ� enumeration��  �� ��Ҹ� class ���·� View�� �߰��ϴ� ����� �ִ�.
	public static enum Status{First,Loading,Game,Win,Lose,Pause,Ending};
	
	// ���α׷��� ���¸� �����ϴ� ����
	Status gameStat;
	
	// ���α׷��� �Բ��ϴ� ������Ʈ�ѷ� ����
	GameController gc;
	
	
	// ���α׷� �������ڸ��� ùȭ�� ����.
	public ProgramController()
	{
		gameStat = Status.First;
	}

	// �ܺο��� status�� ������ �� �ֵ��� �� �޼���
	// View���� ������ �� �ִ�.
	void setStatus(Status status)
	{
		gameStat = status;
	}
	
	void setController(GameController gc)
	{
		this.gc = gc;
	}
}



