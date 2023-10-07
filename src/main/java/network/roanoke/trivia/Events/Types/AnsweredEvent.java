package network.roanoke.trivia.Events.Types;

import java.util.UUID;

public class AnsweredEvent {
	private UUID player;

	public AnsweredEvent(UUID player) {
		this.player = player;
	}

	public UUID getPlayer() {
		return player;
	}
}
