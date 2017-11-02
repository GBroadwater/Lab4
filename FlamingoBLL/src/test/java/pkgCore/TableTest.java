package pkgCore;

import static org.junit.Assert.*;

import org.junit.Test;

public class TableTest {
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
		
		assertEquals(P1.getPlayerID(), (t.GetPlayerFromTable(P1).getPlayerID()));
		
	}
	@Test
	public void test2() {
		t.AddPlayerToTable(P2);
		t.AddPlayerToTable(P3);
		
		t.RemovePlayerFromTable(P2);
		assertEquals(null,t.GetPlayerFromTable(P2));
	}
	

}
