package com.zodiac.astrosphere;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    public ImageView ariesbtn,taurusbtn,geminibtn,cancerbtn,leobtn,virgobtn,librabtn,scorpiobtn,sagitariusbtn,capricornbtn,aquariusbtn,piscesbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ariesbtn = findViewById(R.id.ariesbtn);
        taurusbtn = findViewById(R.id.taurusbtn);
        geminibtn = findViewById(R.id.geminibtn);
        cancerbtn = findViewById(R.id.cancerbtn);
        leobtn = findViewById(R.id.leobtn);
        virgobtn = findViewById(R.id.virgobtn);
        librabtn = findViewById(R.id.librabtn);
        scorpiobtn = findViewById(R.id.scorpiobtn);
        sagitariusbtn = findViewById(R.id.sagitariusbtn);
        capricornbtn = findViewById(R.id.capricornbtn);
        aquariusbtn = findViewById(R.id.aquariusbtn);
        piscesbtn = findViewById(R.id.piscesbtn);



        ariesbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.aries_name),
                        getResources().getString(R.string.aries_description),
                        getResources().getString(R.string.aries_date_range),
                        R.drawable._01_aries)));

        taurusbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.taurus_name),
                        getResources().getString(R.string.taurus_description),
                        getResources().getString(R.string.taurus_date_range),
                        R.drawable._02_taurus)));

        geminibtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.gemini_name),
                        getResources().getString(R.string.gemini_description),
                        getResources().getString(R.string.gemini_date_range),
                        R.drawable._03_gemini)));

        cancerbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.cancer_name),
                        getResources().getString(R.string.cancer_description),
                        getResources().getString(R.string.cancer_date_range),
                        R.drawable._04_cancer)));

        leobtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.leo_name),
                        getResources().getString(R.string.leo_description),
                        getResources().getString(R.string.leo_date_range),
                        R.drawable._05_lion)));

        virgobtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.virgo_name),
                        getResources().getString(R.string.virgo_description),
                        getResources().getString(R.string.virgo_date_range),
                        R.drawable._06_virgo)));

        librabtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.libra_name),
                        getResources().getString(R.string.libra_description),
                        getResources().getString(R.string.libra_date_range),
                        R.drawable._07_libra)));

        scorpiobtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.scorpio_name),
                        getResources().getString(R.string.scorpio_description),
                        getResources().getString(R.string.scorpio_date_range),
                        R.drawable._08_scorpio)));

        sagitariusbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.sagittarius_name),
                        getResources().getString(R.string.sagittarius_description),
                        getResources().getString(R.string.sagittarius_date_range),
                        R.drawable._09_sagittarius)));

        capricornbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.capricorn_name),
                        getResources().getString(R.string.capricorn_description),
                        getResources().getString(R.string.capricorn_date_range),
                        R.drawable._10_capricorn)));

        aquariusbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.aquarius_name),
                        getResources().getString(R.string.aquarius_description),
                        getResources().getString(R.string.aquarius_date_range),
                        R.drawable._11_aquarius)));

        piscesbtn.setOnClickListener(v ->
                goTo(new classSign(getResources().getString(R.string.pisces_name),
                        getResources().getString(R.string.pisces_description),
                        getResources().getString(R.string.pisces_date_range),
                        R.drawable._12_pisces)));




    }

    public void goTo(classSign raashi) {
        Intent link = new Intent(this, ThirdActivity.class);
        Bundle b = new Bundle();
        b.putSerializable("sign",raashi);
        link.putExtras(b);
        startActivity(link);
    }

    public void oldgoTo(String raashi) {
        Intent link = new Intent(this, ThirdActivity.class);
        link.putExtra("key",raashi);
        startActivity(link);
    }

}
