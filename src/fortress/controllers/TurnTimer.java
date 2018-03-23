package fortress.controllers;

public class TurnTimer extends Thread{
	
	final int TURNTIME = 30;
	boolean gameEnd;
	boolean gameBreak;
	int time;
	GameController gc;
	
	TurnTimer(GameController gc)
	{
		this.gc = gc;
		gc.tt = this;
	}
	
	@Override
	public void run()
	{
		while(!gameEnd)
		{
			while(gameBreak);
			try {
				Thread.sleep(1000);
				++time;
				if(time==TURNTIME)
				{
					gc.game.turnChange();
					time=0;
					break;
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
