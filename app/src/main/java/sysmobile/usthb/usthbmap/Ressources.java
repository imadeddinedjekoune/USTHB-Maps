package sysmobile.usthb.usthbmap;

import static sysmobile.usthb.usthbmap.R.id.toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Ressources extends AppCompatActivity {
    Button btnMi;
    Button btnAcad;
    Button btnIsil;
    Button btnGtr;
    Button btnMathRo;
    Button btnMiv;
    Button btnSii;Button btnBio;Button btnIL;Button btnRsd;Button btnSSI;

    Toolbar tolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_ressources);
        MyData myData = new MyData(Ressources.this);

        //myData.insertDataRessource();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ressources);
        tolbar = (Toolbar) findViewById(toolbar) ;
        setSupportActionBar(tolbar);
        btnMi = (Button)findViewById(R.id.mi);
        btnAcad = (Button)findViewById(R.id.ACAD);
        btnIsil = (Button)findViewById(R.id.ISIL);
        btnGtr = (Button)findViewById(R.id.GTR);
        btnMathRo = (Button)findViewById(R.id.MathRO);
        btnMiv = (Button)findViewById(R.id.MIV);
        btnSii = (Button)findViewById(R.id.sii);
        btnBio = (Button)findViewById(R.id.BIOINFO);
        btnIL = (Button)findViewById(R.id.IL);
        btnRsd = (Button)findViewById(R.id.RSD);
        btnSSI = (Button)findViewById(R.id.SSI);

        onclick();




    }

    private void onclick() {
        btnMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //myData.insertDataRessource();
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnMi.getText().toString());
                startActivity(myIntent);

            }
        });

        btnAcad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnAcad.getText().toString());
                startActivity(myIntent);

            }
        });
        btnIsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnIsil.getText().toString());
                startActivity(myIntent);
            }
        });
        btnGtr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnGtr.getText().toString());
                startActivity(myIntent);

            }
        });
        btnMathRo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnMathRo.getText().toString());
                startActivity(myIntent);

            }
        });
        btnMiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnMiv.getText().toString());
                startActivity(myIntent);

            }
        });
        btnSii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnSii.getText().toString());
                startActivity(myIntent);

            }
        });
        btnBio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnBio.getText().toString());
                startActivity(myIntent);

            }
        });
        btnIL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnIL.getText().toString());
                startActivity(myIntent);

            }
        });
        btnRsd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnRsd.getText().toString());
                startActivity(myIntent);

            }
        });
        btnSSI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Ressources.this, DataRessource.class);
                myIntent.putExtra("Name", btnSSI.getText().toString());
                startActivity(myIntent);

            }
        });
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}
