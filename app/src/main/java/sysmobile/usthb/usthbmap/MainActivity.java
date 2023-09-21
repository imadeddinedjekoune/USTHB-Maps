package sysmobile.usthb.usthbmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.ArCoreApk;

public class MainActivity extends AppCompatActivity {
    private Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        Intent i = new Intent(MainActivity.this,SigIn.class);
        startActivity(i);

       /* btn = findViewById(R.id.btn);


        btn.setOnClickListener(
            new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainActivity.this,Menu.class);
                    startActivity(i);
                }
            }


        );*/
    }
}