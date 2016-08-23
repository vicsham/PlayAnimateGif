package com.example.vic.playanimategif;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    TextView textViewInfo;
    GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gifView = (GifView) findViewById(R.id.gif_view);
        textViewInfo = (TextView) findViewById(R.id.textinfo);

        String stringInfo = "";
        stringInfo += "Duration: " + gifView.getMovieDuration() + "\n";
        stringInfo += "W x H: " + gifView.getMovieWidth() + " x " + gifView.getMovieHeight() + "\n";

        textViewInfo.setText(stringInfo);
    }
}
