package it.claudiodemarzo.Objects;

import org.json.JSONObject;

public class Score {
    private final int difficulty;
    private final String difficultyRaw;
    private final int leaderboardId;
    private final String levelAuthorName;
    private final int maxScore;
    private final String mods; //???? IS IT A STRING?
    private final float pp;
    private final int rank;
    private final int score;
    private final int scoreId;
    private final String songAuthorName;
    private final String songHash;
    private final String songName;
    private final String songSubName;
    private final String timeSet;
    private final int unmodifiedScore;
    private final int weight;

    private Score(int difficulty, String difficultyRaw, int leaderboardId, String levelAuthorName, int maxScore, String mods, float pp, int rank, int score, int scoreId, String songAuthorName, String songHash, String songName, String songSubName, String timeSet, int unmodifiedScore, int weight) {
        this.difficulty = difficulty;
        this.difficultyRaw = difficultyRaw;
        this.leaderboardId = leaderboardId;
        this.levelAuthorName = levelAuthorName;
        this.maxScore = maxScore;
        this.mods = mods;
        this.pp = pp;
        this.rank = rank;
        this.score = score;
        this.scoreId = scoreId;
        this.songAuthorName = songAuthorName;
        this.songHash = songHash;
        this.songName = songName;
        this.songSubName = songSubName;
        this.timeSet = timeSet;
        this.unmodifiedScore = unmodifiedScore;
        this.weight = weight;
    }

    public static Score fromString(String data){
        return fromJSONObject(new JSONObject(data));
    }

    public static Score fromJSONObject(JSONObject data){
        int difficulty = data.getInt("difficulty");
        String difficultyRaw = data.getString("difficultyRaw");
        int leaderboardId = data.getInt("leaderboardId");
        String levelAuthorName = data.getString("levelAuthorName");
        int maxScore = data.getInt("maxScore");
        String mods = data.getString("mods");
        float pp = data.getFloat("pp");
        int rank = data.getInt("rank");
        int score = data.getInt("score");
        int scoreId = data.getInt("scoreId");
        String songAuthorName = data.getString("songAuthorName");
        String songHash = data.getString("songHash");
        String songName = data.getString("songName");
        String songSubName = data.getString("songSubName");
        String timeSet = data.getString("time");
        int unmodifiedScore = data.getInt("unmodifiedScore");
        int weight = data.getInt("weight");
        return new Score(difficulty,difficultyRaw,leaderboardId,levelAuthorName,maxScore,mods,pp,rank,score,scoreId,songAuthorName,songHash,songName,songSubName,timeSet,unmodifiedScore,weight);
    }

    public int getDifficulty() {
        return difficulty;
    }

    public String getDifficultyRaw() {
        return difficultyRaw;
    }

    public int getLeaderboardId() {
        return leaderboardId;
    }

    public String getLevelAuthorName() {
        return levelAuthorName;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public String getMods() {
        return mods;
    }

    public float getPp() {
        return pp;
    }

    public int getRank() {
        return rank;
    }

    public int getScore() {
        return score;
    }

    public int getScoreId() {
        return scoreId;
    }

    public String getSongAuthorName() {
        return songAuthorName;
    }

    public String getSongHash() {
        return songHash;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongSubName() {
        return songSubName;
    }

    public String getTimeSet() {
        return timeSet;
    }

    public int getUnmodifiedScore() {
        return unmodifiedScore;
    }

    public int getWeight() {
        return weight;
    }
}
