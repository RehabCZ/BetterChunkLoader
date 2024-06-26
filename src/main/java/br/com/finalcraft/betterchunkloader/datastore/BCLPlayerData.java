package br.com.finalcraft.betterchunkloader.datastore;

import br.com.finalcraft.betterchunkloader.config.data.BCLSettings;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

@XmlRootElement
public class BCLPlayerData {
	private UUID playerId;
	private int alwaysOnChunksAmount, onlineOnlyChunksAmount;
	
	BCLPlayerData(){}
	
	public BCLPlayerData(UUID playerId) {
		this.playerId = playerId;
		this.alwaysOnChunksAmount= BCLSettings.defaultChunksAmountAlwaysOn;
		this.onlineOnlyChunksAmount=BCLSettings.defaultChunksAmountOnlineOnly;
	}

	public BCLPlayerData(UUID playerId, int alwaysOnChunksAmount, int onlineOnlyChunksAmount) {
		this.playerId = playerId;
		this.alwaysOnChunksAmount = alwaysOnChunksAmount;
		this.onlineOnlyChunksAmount = onlineOnlyChunksAmount;
	}

	public UUID getPlayerId() {
		return playerId;
	}
	
	@XmlAttribute(name="id")
	public void setPlayerId(UUID playerId) {
		this.playerId = playerId;
	}
	
	/** Total amount of always on chunks that this player can load */
	public int getAlwaysOnChunksAmount() {
		return alwaysOnChunksAmount;
	}
	
	@XmlAttribute(name="aon")
	public void setAlwaysOnChunksAmount(int alwaysOnChunksAmount) {
		this.alwaysOnChunksAmount = alwaysOnChunksAmount;
	}
	
	/** Total amount of online only chunks that this player can load */
	public int getOnlineOnlyChunksAmount() {
		return onlineOnlyChunksAmount;
	}
	
	@XmlAttribute(name="oon")
	public void setOnlineOnlyChunksAmount(int onlineOnlyChunksAmount) {
		this.onlineOnlyChunksAmount = onlineOnlyChunksAmount;
	}
}
