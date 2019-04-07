package com.example.health;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

public class plot extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot);
        ImageView aplot = (ImageView) findViewById(R.id.aplot);
        Intent intent = getIntent();
        String year=intent.getStringExtra("Year");
        String disease=intent.getStringExtra("Disease");
        String plot=intent.getStringExtra("Plot");
        Toast.makeText(getApplicationContext(), year+disease+plot, Toast.LENGTH_SHORT).show();
        Resources resources = getResources();
        if(year.equals("2008")){
            if(disease.equals("No of beds in state")){
                if(plot.equals("Graph")){
                    aplot.setImageDrawable(resources.getDrawable(R.drawable.a));
                    Log.i("Im", "1");
                }
            }
        }
        else if(year.equals("2009")){
            if(disease.equals("No of beds in state")){
                if(plot.equals("Graph")){
                    aplot.setImageDrawable(resources.getDrawable(R.drawable.b));
                    Log.i("Im", "2");
                }
            }
        }
        else if(year.equals("2010")){
            if(disease.equals("No of beds in state")){
                if(plot.equals("Graph")){
                    aplot.setImageDrawable(resources.getDrawable(R.drawable.c));
                    Log.i("Im", "3");
                }
            }
        }
    }
}
