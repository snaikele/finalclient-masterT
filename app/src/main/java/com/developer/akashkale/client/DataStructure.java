package com.developer.akashkale.client;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Vector;


public class DataStructure extends AppCompatActivity  {

    RecyclerView recyclerView;
    Vector<YouTubeVideos>youTubeVideos=new Vector<>();

    public Button btnStart;
    Button Btn,PlayBtn;
    ImageButton bkBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datastructure);
        recyclerView=(RecyclerView) findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, true));

        youTubeVideos.add(new YouTubeVideos("<iframe width=\"75%\" height=\"75%\" src=\"https://www.youtube.com/embed/Db9ZYbJONHc\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"75%\" height=\"75%\" src=\"https://www.youtube.com/embed/BrVZZZkkGGI\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"75%\" height=\"75%\" src=\"https://www.youtube.com/embed/Y1vSGA0jm5E\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"75%\" height=\"75%\" src=\"https://www.youtube.com/embed/gnYM_G1ILm0\" frameborder=\"0\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideos("<iframe width=\"75%\" height=\"75%\" src=\"https://www.youtube.com/embed/EXsR7HXlGLw\" frameborder=\"0\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter =new VideoAdapter(youTubeVideos);
        recyclerView.setAdapter(videoAdapter);

        //WebView myWebView = (WebView) findViewById(R.id.DSWebView);
        //myWebView.loadUrl("https://www.careerride.com/Data-structure-defined.aspx");
        bkBtn = (ImageButton) findViewById(R.id.backbtn);
        bkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(DataStructure.this, IT.class);
                startActivity(i);
                finish();
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.AppTitleimage1);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://onlinecourses.nptel.ac.in/noc19_cs08/preview");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageView imageView1 = (ImageView) findViewById(R.id.AppTitleimage2);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.udemy.com/courses/search/?q=data%20structures&src=sac&kw=data%20str&p=1&price=price-free");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        ImageView imageView2 = (ImageView) findViewById(R.id.AppTitleimage3);
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Uri uri = Uri.parse("https://www.eduonix.com/search?proname=data%20Structure");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }

}

