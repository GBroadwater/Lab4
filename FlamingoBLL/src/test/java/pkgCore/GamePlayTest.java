package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgEnum.eGameType;

public class GamePlayTest {
	Table t = new Table();
	GamePlay gamePlay;
	Player P1 = new Player("Geoffrey", 15);
	Player P2 = new Player("David", 23);
	Player P3 = new Player("Julia", 31);

	@Test
	public void test1() {
		t.AddPlayerToTable(P1);
		t.AddPlayerToTable(P2);		
		t.AddPlayerToTable(P3);
		gamePlay = new GamePlayBlackJack(eGameType.BLACKJACK);
		
		gamePlay.AddPlayersToGame(t.getPlayersInTable());
		assertEquals(P3.getPlayerID(), gamePlay.GetPlayerInGame(P3).getPlayerID());
		
	}
	@Test(expected = NullPointerException.class)
	public void test2() {
		t.AddPlayerToTable(P1);
		t.AddPlayerToTable(P2);		
		t.AddPlayerToTable(P3);
		gamePlay = new GamePlayBlackJack(eGameType.BLACKJACK);
		gamePlay.AddPlayersToGame(t.getPlayersInTable());
		
		gamePlay.RemovePlayerFromGame(P3);
		gamePlay.GetPlayerInGame(P3).getPlayerID();
		
	}

}
