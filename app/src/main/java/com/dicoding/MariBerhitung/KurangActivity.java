package com.dicoding.MariBerhitung;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

public class KurangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurang);

        VideoView videoView = findViewById(R.id.kurangvid);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pengurangan));
        videoView.start();
    }
}
