package sysmobile.usthb.usthbmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class DataRessource extends AppCompatActivity {
    ArrayList<String> list = new ArrayList<String>();
    CardView drive ;
    CardView ytb ;
    CardView facebook ;
    CardView others ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_ressource);
        MyData myData = new MyData(DataRessource.this);
        // getIntent() is a method from the started activity
        Intent myIntent = getIntent(); // gets the previously created intent
        String name = myIntent.getStringExtra("Name"); // will return "FirstKeyValue"
        list = myData.data(name);


        drive = (CardView)findViewById(R.id.DriveView);
        drive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

              if (list.get(0).equals(""))  Toast.makeText(DataRessource.this, "link will be add soon", Toast.LENGTH_SHORT).show();
                 else{ Uri uri = Uri.parse(list.get(0)); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);}
            }
        });
        ytb = (CardView)findViewById(R.id.ytbView);
        ytb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (list.get(1).equals(""))  Toast.makeText(DataRessource.this, "link will be add soon", Toast.LENGTH_SHORT).show();
                else{ Uri uri = Uri.parse(list.get(1)); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);}
            }
        });
        facebook = (CardView)findViewById(R.id.FacebookView);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (list.get(2).equals(""))  Toast.makeText(DataRessource.this, "link will be add soon", Toast.LENGTH_SHORT).show();
                else{ Uri uri = Uri.parse(list.get(2)); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);}
            }
        });
        others = (CardView)findViewById(R.id.AuthersView);
        others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (list.get(3).equals(""))  Toast.makeText(DataRessource.this, "link will be add soon", Toast.LENGTH_SHORT).show();
                else{ Uri uri = Uri.parse(list.get(3)); // missing 'http://' will cause crashed
                    Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent);}
            }
        });


    }
    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }
}