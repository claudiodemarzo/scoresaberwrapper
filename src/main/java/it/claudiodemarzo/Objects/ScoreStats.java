import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

public class ScoreStats {
    private float averageRankedAccuracy;
    private int rankedPlayCount;
    private int totalPlayCount;
    private int totalRankedScore;
    private int totalScore;

    private ScoreStats(float averageRankedAccuracy, int rankedPlayCount, int totalPlayCount, int totalRankedScore, int totalScore){
        this.averageRankedAccuracy = averageRankedAccuracy;
        this.rankedgPlayCount = rankedPlayCount;
        this.totalPlayCount = totalPlayCount;
        this.totalRankedScore = totalRankedScore;
        int totalScore = totalScore;
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
