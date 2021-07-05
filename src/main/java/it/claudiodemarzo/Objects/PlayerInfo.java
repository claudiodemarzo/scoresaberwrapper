package it.claudiodemarzo.Objects;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;

public class PlayerInfo{
    private final String avatar;
    private final HashMap<String,String> badges;
    private final boolean banned;
    private final String country;
    private final int countryRank;
    private final int[] history;
    private final boolean inactive;
    private final int permissions;
    private final String playerId;
    private final String playerName;
    private final double pp;
    private final int rank;
    private final String role;

    private PlayerInfo(String avatar, HashMap<String,String> badges, boolean banned, String country, int countryRank, int[] history, boolean inactive, int permissions, String playerId, String playerName, double pp, int rank, String role){
        this.avatar = avatar;
        this.badges = badges;
        this.banned = banned;
        this.country = country;
        this.countryRank = countryRank;
        this.history = history;
        this.inactive = inactive;
        this.permissions = permissions;
        this.playerId = playerId;
        this.playerName = playerName;
        this.pp = pp;
        this.rank = rank;
        this.role = role;
    }

    public static PlayerInfo fromJSONObject(JSONObject data){
        String avatar = data.getString("avatar");
        HashMap<String,String> badges = new HashMap<String,String>();
        JSONArray badges_ = data.getJSONArray("badges");
        for(int i = 0; i < badges_.length(); i++){
            JSONObject badge = badges_.getJSONObject(i);
            badges.put(badge.getString("image"), badge.getString("description"));
        }
        boolean banned = data.getInt("banned") == 1;
        String country = data.getString("country");
        int countryRank = data.getInt("countryRank");
        String[] history_= data.getString("history").split(",");
        int[] history = new int[history_.length];
        for(int i = 0; i < history_.length; i++){
            history[i] = Integer.parseInt(history_[i]);
        }
        boolean inactive = data.getInt("inactive") == 1;
        int permissions = data.getInt("permissions");
        String playerId = data.getString("playerId");
        String playerName = data.getString("playerName");
        double pp = data.getDouble("pp");
        int rank = data.getInt("rank");
        String role = data.getString("role");
        return new PlayerInfo(avatar,badges,banned,country,countryRank,history,inactive,permissions,playerId,playerName,pp,rank,role);
    }

    public static PlayerInfo fromString(String data){
        return fromJSONObject(new JSONObject(data));
    }

    public String getAvatar() {
        return avatar;
    }

    public HashMap<String,String> getBadges() {
        return badges;
    }

    public boolean isBanned() {
        return banned;
    }

    public String getCountry() {
        return country;
    }

    public int getCountryRank() {
        return countryRank;
    }

    public int[] getHistory() {
        return history;
    }

    public boolean isInactive() {
        return inactive;
    }

    public int getPermissions() {
        return permissions;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public double getPp() {
        return pp;
    }

    public int getRank() {
        return rank;
    }

    public String getRole() {
        return role;
    }

}
