package org.exercise.EX2GameDatabase;

public interface GameQueryInterface {
    String getCommand();
    String run(VideoGame[] games, Object parameter);
}
