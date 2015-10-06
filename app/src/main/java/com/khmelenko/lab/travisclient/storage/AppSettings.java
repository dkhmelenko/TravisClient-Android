package com.khmelenko.lab.travisclient.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.khmelenko.lab.travisclient.TravisApp;

/**
 * Application settings
 *
 * @author Dmytro Khmelenko
 */
public final class AppSettings {

    private static final String ACCESS_TOKEN_KEY = "TravisAccessToken";
    private static final String SERVER_TYPE_KEY = "ServerTypeKey";

    // denied constructor
    private AppSettings() {

    }

    /**
     * Gets shared preferences
     *
     * @return Shared preferences
     */
    private static SharedPreferences getPreferences() {
        Context context = TravisApp.getAppContext();
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        return defaultSharedPreferences;
    }

    /**
     * Gets access token
     *
     * @return Access token
     */
    public static String getAccessToken() {
        SharedPreferences pref = getPreferences();
        return pref.getString(ACCESS_TOKEN_KEY, "");
    }

    /**
     * Puts access token to settings
     *
     * @param accessToken Access token
     */
    public static void putAccessToken(String accessToken) {
        SharedPreferences pref = getPreferences();
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(ACCESS_TOKEN_KEY, accessToken);
        editor.commit();
    }

    /**
     * Gets server type from Settings
     *
     * @return Server type
     */
    public static String getServerType() {
        SharedPreferences pref = getPreferences();
        return pref.getString(SERVER_TYPE_KEY, "");
    }

    /**
     * Puts server type to the settings
     *
     * @param serverType Server type
     */
    public static void putServerType(String serverType) {
        SharedPreferences pref = getPreferences();
        SharedPreferences.Editor editor = pref.edit();
        editor.putString(SERVER_TYPE_KEY, serverType);
        editor.commit();
    }

}
