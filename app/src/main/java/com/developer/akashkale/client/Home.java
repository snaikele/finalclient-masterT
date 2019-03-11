package com.developer.akashkale.client;

import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.transition.Transition;
import android.support.transition.TransitionInflater;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Home extends AppCompatActivity implements View.OnClickListener {
    boolean doubleBackToExitPressedOnce = false;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;
    CardView cdV,cdV2,cdV3;
    Button Btn;
    Transition transition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setUpToolBar();
        cdV = findViewById(R.id.cardView1);
        cdV2 = findViewById(R.id.cardView2);
        cdV3 =findViewById(R.id.cardView3);
        cdV.setOnClickListener(this);
        cdV2.setOnClickListener(this);
        cdV3.setOnClickListener(this);

        navigationView =(NavigationView) findViewById(R.id.nevigation);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.item1:
                        Intent i = new Intent(Home.this,Home.class);
                        startActivity(i);

                        break;
                    case R.id.item2:
                        Intent i2 = new Intent(Home.this,CGPA_Activity.class);
                        startActivity(i2);

                        break;
                    case R.id.item5:

                        Toast.makeText(Home.this, "Feature Unaviable..", Toast.LENGTH_SHORT).show();
                        break;

                    case R.id.item6:
                        Toast.makeText(Home.this, "Feature Unaviable..", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item8:
                        Intent i4 =new Intent(Home.this,splash.class);
                        startActivity(i4);
                        break;
                }

                return false;
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cardView1:
                Intent intent3 = new Intent(this, IT.class);
                startActivity(intent3);
                overridePendingTransition(R.anim.animation,R.anim.animation);
                break;
            case R.id.cardView2:
                Intent intent = new Intent(this, CS.class);
                startActivity(intent);
                Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
                break;
            case R.id.cardView3:
                Intent intent2 = new Intent(this, Mech.class);
                startActivity(intent2);
                Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                break;

        }
    }

    private void overridePendingTransition(int fade_out) {
    }

    private void setUpToolBar()
    {
        drawerLayout=(DrawerLayout) findViewById(R.id.drawerLayout);
        toolbar =(Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();


    }
    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                finishAffinity();
            }
            System.exit(0);
            return;
        }


        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }
}
