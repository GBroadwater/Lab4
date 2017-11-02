package pkgCore;

import java.util.HashMap;
import java.util.UUID;

public class Table{

	public UUID getTableID() {
		return TableID;
	}

	public HashMap<UUID, Player> getPlayersInTable() {
		return PlayersInTable;
	}

	private UUID TableID;
	private HashMap<UUID, Player> PlayersInTable = new HashMap<UUID, Player>();
	
	public Table() {
		super();
		this.TableID = UUID.randomUUID();
	}
	
	public void AddPlayerToTable(Player p)
	{
		this.PlayersInTable.put(p.getPlayerID(),p);
	}
	public void RemovePlayerFromTable(Player p)
	{
		this.PlayersInTable.remove(p.getPlayerID());		
	}
	
	public Player GetPlayerFromTable(Player p)
	{
		return this.PlayersInTable.get(p.getPlayerID());
		
	}
	
}
