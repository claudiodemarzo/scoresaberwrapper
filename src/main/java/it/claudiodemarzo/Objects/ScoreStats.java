package it.claudiodemarzo.Objects;

import org.json.JSONObject;

public class ScoreStats {
    private final float averageRankedAccuracy;
    private final int rankedPlayCount;
    private final int totalPlayCount;
    private final int totalRankedScore;
    private final int totalScore;

    private ScoreStats(float averageRankedAccuracy, int rankedPlayCount, int totalPlayCount, int totalRankedScore, int totalScore){
        this.averageRankedAccuracy = averageRankedAccuracy;
        this.rankedPlayCount = rankedPlayCount;
        this.totalPlayCount = totalPlayCount;
        this.totalRankedScore = totalRankedScore;
        this.totalScore = totalScore;
    }

    public static ScoreStats fromJSONObject(JSONObject data) {
        float averageRankedAccuracy = data.getFloat("averageRankedAccuracy");
        int rankedPlayCount = data.getInt("rankedPlayCount");
        int totalPlayCount = data.getInt("totalPlayCount");
        int totalRankedScore = data.getInt("totalRankedScore");
        int totalScore = data.getInt("totalScore");
        return new ScoreStats(averageRankedAccuracy, rankedPlayCount, totalPlayCount, totalRankedScore, totalScore);
    }

    public static ScoreStats fromString(String data){
        return fromJSONObject(new JSONObject(data));
    }

    public float getAverageRankedAccuracy() {
        return averageRankedAccuracy;
    }

    public int getRankedPlayCount() {
        return rankedPlayCount;
    }

    public int getTotalPlayCount() {
        return totalPlayCount;
    }

    public int getTotalRankedScore() {
        return totalRankedScore;
    }

    public int getTotalScore() {
        return totalScore;
    }

}
