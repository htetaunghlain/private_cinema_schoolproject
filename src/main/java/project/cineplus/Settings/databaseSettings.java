package project.cineplus.Settings;

/*
* @author Htet Aung Hlaing
* */

import java.util.prefs.Preferences;

public class databaseSettings {
    public static databaseSettings instance;

    private static final String PREFERENCE_NODE_NAME = "project.system.database";
    private static final String LOCAL_URL_KEY = "url_local";
    private static final String LOCAL_USER_KEY = "user_local";
    private static final String LOCAL_PASSWORD_KEY="password_local";

    private String local_url  = "jdbc:mysql://localhost:3306/";
    private String local_user = "root";
    private String local_password ;


    public static databaseSettings getInstance() {
        if(instance == null){
            instance = new databaseSettings();
        }
        return instance;
    }



    public String getLocal_url() {
        return local_url;
    }

    public void setLocal_url(String local_url) {
        Preferences preferences = Preferences.userRoot().node(PREFERENCE_NODE_NAME);
        this.local_url = local_url;
        preferences.put(LOCAL_URL_KEY , local_url);
    }

    public String getLocal_user() {
        Preferences preferences = Preferences.userRoot().node(PREFERENCE_NODE_NAME);
        return local_user;
    }

    public void setLocal_user(String local_user) {
        Preferences preferences = Preferences.userRoot().node(PREFERENCE_NODE_NAME);
        this.local_user = local_user;
        preferences.put(LOCAL_USER_KEY , local_user);

    }

    public String getLocal_password() {
        return local_password;
    }

    public void setLocal_password(String local_password) {
        Preferences preferences = Preferences.userRoot().node(PREFERENCE_NODE_NAME);
        this.local_password = local_password;
        preferences.put(LOCAL_PASSWORD_KEY,local_password);
    }
}
