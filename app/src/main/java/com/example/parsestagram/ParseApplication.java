package com.example.parsestagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2IpnWZXcWKeBVxIBdgGW8foVkW6QNXHugF4ZbKJ4")
                .clientKey("abhZq45e32XJatQnXj3MZzrGQO9UJhG9VrUQGRMa")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
