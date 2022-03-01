package com.wholesway.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass((Post.class));

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("UHIinQziZUBU9gQRKJqSYcrGoVvH2dHYH90gi3s9")
                .clientKey("uOXzniNWtU543l0bg7xkGz42Wv4pmOhQzhzlscSZ")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
