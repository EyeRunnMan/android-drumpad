package com.example.drumpads;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.minecalculatoor.drumpad.R;



import static android.media.MediaPlayer.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    MediaPlayer m1,m2,m3,m4,m5,m6,m7,m8;
    int i;

    int[] magic={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};














    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE
                        // Set the content to appear under the system bars so that the
                        // content doesn't resize when the system bars hide and show.
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        // Hide the nav bar and status bar
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
   /* private void showSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
    }

*/























    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        m1= MediaPlayer.create( MainActivity.this,R.raw.one);
        m2= MediaPlayer.create( MainActivity.this,R.raw.two);
        m3= MediaPlayer.create( MainActivity.this,R.raw.three);
        m4= MediaPlayer.create( MainActivity.this,R.raw.four);
        m5= MediaPlayer.create( MainActivity.this,R.raw.fv);
        m6= MediaPlayer.create( MainActivity.this,R.raw.sixth);
        m7= MediaPlayer.create( MainActivity.this,R.raw.seventh);
        m8 = MediaPlayer.create( MainActivity.this,R.raw.eighth);


    }

    @Override
    public void onClick(View v) {
        
        //if (Math.random() * magic.length >= 8) {

                // int ran=(int)Math.round(Math.random()*magic.length);
                //findViewById(v.getId()).setBackgroundResource(magic[ran]);
          //  }else {
            //int ran=(int)Math.round(Math.random()*magic.length);
            //findViewById(v.getId()).setBackgroundResource(magic[ran]);
        int ran=(int)Math.round(Math.random()*magic.length);
        if(ran!=6){

            findViewById(v.getId()).setBackgroundResource(magic[ran]);
        }
            //else{System.out.close();}
            int ig = v.getId();
            switch (ig) {
                case R.id.one:
                    m1.start();
                    //  findViewById(v.getId()).setBackgroundColor(R.color.colorAccent);

                    break;
                case R.id.two:
                    m2.start();
                    break;
                case R.id.three:
                    m3.start();
                    break;
                case R.id.four:
                    m4.start();
                    break;
                case R.id.five:
                    m5.start();
                    break;
                case R.id.six:
                    m6.start();

                    break;
                case R.id.seven:
                    m7.start();
                    break;
                case R.id.eight:
                    m8.start();
                    break;
                default:
                    break;


            }

        }
    }
