package network.roanoke.trivia.Events;

import network.roanoke.trivia.Events.Types.AnsweredEvent;

/**
 * Class that stores all events to be registered to or triggered.
 */
public abstract class TriviaEvents {
	public static Event<AnsweredEvent> CORRECT_ANSWER = new Event<>();
}
