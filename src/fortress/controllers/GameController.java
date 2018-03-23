package fortress.controllers;

import fortress.models.Game;

public class GameController{
	ProgramController pc;
	Game game;
	TurnTimer tt;
	
	public GameController(ProgramController pc)
	{
		this.game = Game.getInstance();
		this.pc = pc;
		pc.setController(this);
	}
	
	public void tankMove(int dir)
	{
		// 탱크를 이동시키는 메서드
		// game.players.get(game.nowPlay).tank에 있는 탱크 객체의 위치 정보를 수정한다.
	}
	
	public void angleMove(int dir)
	{
		// 탱크의 각도를 이동시키는 메서드
		// game.players.get(game.nowPlay).tank에 있는 탱크 객체의 각도 정보를 수정한다.
	}
	
	public void fire(double power)
	{
		// 해당 이벤트 발생시, 인풋을 잠궈야 함.
		// game.player.tank의 발사 메서드 실행
	}

}
