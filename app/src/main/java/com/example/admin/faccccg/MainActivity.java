package com.example.admin.faccccg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.flurry.android.FlurryAgent;
import com.flurry.android.FlurryAgentListener;

import static android.util.Log.VERBOSE;

public class MainActivity extends AppCompatActivity {

    private static final String FLURRY_API_KEY = "HT2S4FD998FS7CWB542S";
    FlurryAgentListener flurryAgentListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Flurry activation code
        flurryAgentListener.onSessionStarted();

        new FlurryAgent.Builder()
                .withLogEnabled(true)
                .withCaptureUncaughtExceptions(true)
                .withContinueSessionMillis(10)
                .withLogEnabled(true)
                .withLogLevel(VERBOSE)
                .withListener(flurryAgentListener)
                .build(this, FLURRY_API_KEY);

    }
}
