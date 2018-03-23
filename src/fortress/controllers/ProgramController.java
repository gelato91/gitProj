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

	// 프로그램 상태를 enumeration으로 나타냄
	// 상태별로 좀 더 자세한 로직을 구현하고 싶다면 enumeration의  각 요소를 class 형태로 View에 추가하는 방법도 있다.
	public static enum Status{First,Loading,Game,Win,Lose,Pause,Ending};
	
	// 프로그램의 상태를 저장하는 변수
	Status gameStat;
	
	// 프로그램과 함께하는 게임컨트롤러 변수
	GameController gc;
	
	
	// 프로그램 시작하자마자 첫화면 설정.
	public ProgramController()
	{
		gameStat = Status.First;
	}

	// 외부에서 status를 설정할 수 있도록 한 메서드
	// View에서 설정할 수 있다.
	void setStatus(Status status)
	{
		gameStat = status;
	}
	
	void setController(GameController gc)
	{
		this.gc = gc;
	}
}



