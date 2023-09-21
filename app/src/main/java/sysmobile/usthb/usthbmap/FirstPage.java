package sysmobile.usthb.usthbmap;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class FirstPage extends AppCompatActivity {
    androidx.gridlayout.widget.GridLayout gridLayoutrid ;
    CardView gridQR ;
    CardView gridlocalisation ;
    CardView grisRessource ;
    CardView gridEDT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        gridLayoutrid = (androidx.gridlayout.widget.GridLayout)findViewById(R.id.month_grid);
        setSingleEvent(gridLayoutrid);
        gridQR = (CardView) findViewById(R.id.gridQR);
        gridlocalisation = (CardView) findViewById(R.id.gridLocalisation);
        grisRessource = (CardView) findViewById(R.id.gridressource);
        gridEDT = (CardView) findViewById(R.id.gridEDT);



    }

    @Override
    protected void onResume() {
        super.onResume();
        gridQR.setCardBackgroundColor(Color.WHITE);
        gridlocalisation.setCardBackgroundColor(Color.WHITE);
        grisRessource.setCardBackgroundColor(Color.WHITE);
        gridEDT.setCardBackgroundColor(Color.WHITE);
    }

    private void setSingleEvent(androidx.gridlayout.widget.GridLayout grid) {
        for(int i = 0 ;i<grid.getChildCount();i++){
            CardView card = (CardView) grid.getChildAt(i);
            if (i==0){
                card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        gridQR.setCardBackgroundColor(Color.parseColor("#ff0fc2c0"));
                        Intent i = new Intent(FirstPage.this, Menu.class);
                        startActivity(i);

                    }
                });
            }
            if (i==1){
                card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //gridlocalisation.setCardBackgroundColor(Color.parseColor("#ff0fc2c0"));
                        Toast.makeText(FirstPage.this,"Activity will be load soon !",Toast.LENGTH_SHORT).show();

                    }
                });
            }
            if (i==2){
                card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        grisRessource.setCardBackgroundColor(Color.parseColor("#ff0fc2c0"));

                       // Toast.makeText(FirstPage.this,"Activity will be load soon !",Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(FirstPage.this, Ressources.class);
                        startActivity(i);
                    }
                });
            }
            if (i==3){
                card.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(FirstPage.this,"Activity will be load soon !",Toast.LENGTH_SHORT).show();
                    }
                });
            }

        }
    }
}