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
        this.rankingPlayCount = rankingPlayCount;
        this.totalPlayCount = totalPlayCount;
        this.totalRankedScore = totalRankedScore;
        int totalScore = totalScore;
    }
}
