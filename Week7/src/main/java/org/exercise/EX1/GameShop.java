package org.exercise.EX1;

import java.util.ArrayList;
import java.util.List;

public class GameShop {
    private String name;
    private List<VideoGame> videoGamesDataBase = new ArrayList<>();

    public GameShop(String name) {
        this.name = name;
    }

    public void addVideoGame(VideoGame videoGame){
        videoGamesDataBase.add(videoGame);
    }

    public String getName() {
        return name;
    }

    public List<VideoGame> getVideoGamesDataBase() {
        return videoGamesDataBase;
    }
}
