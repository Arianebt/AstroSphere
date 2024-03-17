package com.zodiac.astrosphere;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.ScrollingMovementMethod;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Objects;

public class ThirdActivity extends AppCompatActivity {
    classSign objsign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView xOutput = findViewById(R.id.sign);
        ImageView ib = (ImageView) findViewById(R.id.imageView2);
        TextView yOutput = findViewById(R.id.period);
        TextView zOutput = findViewById(R.id.sign_description);


        Bundle extras = getIntent().getExtras();
        if(extras !=null){
            objsign = (classSign) extras.getSerializable("sign");

            xOutput.setText(objsign.getName());
            yOutput.setText(objsign.getPeriod());
            zOutput.setText(Html.fromHtml(objsign.getDescription()));
            zOutput.setMovementMethod(new ScrollingMovementMethod());
            ib.setImageDrawable(getResources().getDrawable(objsign.getImg()));
        }

        Button BackButton = (Button) findViewById(R.id.BackButton);
        BackButton.setOnClickListener(v -> toMenu());
    }

    public void toMenu() {

        Intent link = new Intent(this, SecondActivity.class );
        startActivity(link);
    }
}