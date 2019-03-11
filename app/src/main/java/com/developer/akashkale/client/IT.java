package com.developer.akashkale.client;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

public class IT extends AppCompatActivity {
    CardView Btn,Btn1,Btn2,Btn3,Btn4,Btn5,Btn6,Btn7,Btn8,Btn9,Btn10,Btn11,Btn12,Btn13,Btn14;
    ImageButton bkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);




        Btn=(CardView) findViewById(R.id.BtnSub1);
        Btn1=(CardView) findViewById(R.id.BtnSub2);
        Btn2=(CardView) findViewById(R.id.BtnSub3);
        Btn3=(CardView) findViewById(R.id.BtnSub4);
        Btn4=(CardView) findViewById(R.id.BtnSub5);
        Btn5=(CardView) findViewById(R.id.BtnSub6);
        Btn6=(CardView) findViewById(R.id.BtnSub7);
        Btn7=(CardView) findViewById(R.id.BtnSub8);
        Btn8=(CardView) findViewById(R.id.BtnSub9);
        Btn9=(CardView) findViewById(R.id.BtnSub10);
        Btn10=(CardView) findViewById(R.id.BtnSub11);
        Btn11=(CardView) findViewById(R.id.BtnSub12);
        Btn12=(CardView) findViewById(R.id.BtnSub13);
        Btn13=(CardView) findViewById(R.id.BtnSub14);
        Btn14=(CardView) findViewById(R.id.BtnSub15);


        bkBtn=(ImageButton)findViewById(R.id.backbtn);
        bkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(IT.this,Home.class);
                startActivity(i);
                overridePendingTransition(R.anim.outfromup,R.anim.outfromup);
                finish();
            }
        });
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent1= new Intent(IT.this, DataStructure.class);
            startActivity(intent1);
            finish();
            }
        });



    }
@Override
    public void onBackPressed(){
        super.onBackPressed();
        finish();
}

}
