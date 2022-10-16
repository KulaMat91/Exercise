package org.exercise.EX2GameDatabase;

public interface GameDatabaseInterface {
    VideoGame[] readVideoGames(String filePath);
    void saveVideoGames(String filePath, VideoGame[] games);
}
