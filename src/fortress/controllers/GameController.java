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
		// ��ũ�� �̵���Ű�� �޼���
		// game.players.get(game.nowPlay).tank�� �ִ� ��ũ ��ü�� ��ġ ������ �����Ѵ�.
	}
	
	public void angleMove(int dir)
	{
		// ��ũ�� ������ �̵���Ű�� �޼���
		// game.players.get(game.nowPlay).tank�� �ִ� ��ũ ��ü�� ���� ������ �����Ѵ�.
	}
	
	public void fire(double power)
	{
		// �ش� �̺�Ʈ �߻���, ��ǲ�� ��ž� ��.
		// game.player.tank�� �߻� �޼��� ����
	}

}
