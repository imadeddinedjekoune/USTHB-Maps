package sysmobile.usthb.usthbmap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.budiyev.android.codescanner.CodeScanner;
import com.budiyev.android.codescanner.CodeScannerView;
import com.budiyev.android.codescanner.DecodeCallback;
import com.google.ar.core.ArCoreApk;
import com.google.zxing.Result;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    private CodeScanner mCodeScanner;
    MyData myData ;
    String[] permissions = {
            Manifest.permission.CAMERA
    };
    int PERM_CODE =11 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myData = new MyData(Menu.this);
        setContentView(R.layout.activity_menu);
        CodeScannerView scannerView = findViewById(R.id.scanner_view);


        mCodeScanner = new CodeScanner(this, scannerView);
        mCodeScanner.setDecodeCallback(new DecodeCallback() {
            @Override
            public void onDecoded(@NonNull final Result result) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        //Toast.makeText(Menu.this, result.getText(), Toast.LENGTH_SHORT).show();
                        String url = result.getText();
                        //textView.setText("Result is :"+ URLUtil.isValidUrl(url));//result.getText()

                        if (URLUtil.isValidUrl(url))
                        {
                            arCode(url);
                        }
                        else{
                            Toast.makeText(Menu.this, "QR code invalid url", Toast.LENGTH_SHORT).show();
                        }



                    }
                });
            }
        });
        scannerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mCodeScanner.startPreview();
            }
        });
        /*btnAr.setOnClickListener(v->{
            ArCoreApk.Availability availability = ArCoreApk.getInstance().checkAvailability(this);
            if(availability.isSupported()){
                //arCode();
            }else
            {
                Toast.makeText(Menu.this, "No availability of AR ", Toast.LENGTH_SHORT).show();
            }

        });*/


    }
    private void arCode(String url) {

        final EditText txtinput  = new EditText(this);
        String[] str = url.split("/Blocs/");

        new AlertDialog.Builder(this)
                .setTitle("You are in "+str[1].split(".gltf")[0])
                .setCancelable(false).setView(txtinput)
                .setMessage("Please entre the room that you want to find")
                .setPositiveButton("Search", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //do what you want here


                        //Toast.makeText(Menu.this,myData.getLinks(txtinput.getText().toString()), Toast.LENGTH_SHORT).show();;
                        if(myData.InBloc(str[1].split(".gltf")[0],txtinput.getText().toString()))
                            {
                                String url2 = myData.getLinks(txtinput.getText().toString()) ;
                                if (url2.equals(""))url2 = url ;
                                loadsalle(url2);


                                }else{
                                        String re = myData.serchInOther(txtinput.getText().toString());
                                        if (re.equals("")) Toast.makeText(Menu.this,"Salle introvable In the new Blocs",Toast.LENGTH_SHORT).show();
                                        else{
                                            //Toast.makeText(Menu.this,"Your Class in other bloc : "+ re,Toast.LENGTH_SHORT).show();
                                            alert(re,url);
                                        }
                                    }

                                }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //do what you want here
                        finish();
                    }
                })
                .create()
                .show();


    }
    @Override
    protected void onResume() {
        super.onResume();
        requastCamera();

    }
    void alert(String block,String url){
        new AlertDialog.Builder(this)
                .setTitle("You are in the wrong place")
                .setCancelable(false)
                .setMessage("Your Class in : "+ block)
                .setPositiveButton("Continue with this bloc ", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //do what you want here

                        loadsalle(url);



                    }
                })
                .setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //do what you want here
                        finish();
                    }
                })
                .create()
                .show();
    }
    void loadsalle(String url){
        Intent sceneViewerIntent = new Intent(Intent.ACTION_VIEW);
        Uri intentUri =
                Uri.parse("https://arvr.google.com/scene-viewer/1.0").buildUpon()
                        //.appendQueryParameter("file", "https://raw.githubusercontent.com/KhronosGroup/glTF-Sample-Models/master/2.0/Duck/glTF/Duck.gltf")
                        .appendQueryParameter("file",url)
                        .appendQueryParameter("mode","ar_preferred")
                        .appendQueryParameter("title","Model3D")
                        .build();
        sceneViewerIntent.setData(intentUri);
        sceneViewerIntent.setPackage("com.google.ar.core");
        startActivity(sceneViewerIntent);
    }

    private void requastCamera() {
        if (checkPermissions()){
            mCodeScanner.startPreview();
        }
    }

    @Override
    protected void onPause() {
        mCodeScanner.releaseResources();
        super.onPause();
    }

    private boolean checkPermissions ()
    {
        List<String> listofpermission = new ArrayList<>();
        for(String perm : permissions)
        {

            if(ContextCompat.checkSelfPermission(getApplicationContext(),perm)!= PackageManager.PERMISSION_GRANTED)
            {
                listofpermission.add(perm);
            }
        }
        if (!listofpermission.isEmpty()){
            ActivityCompat.requestPermissions(this,listofpermission.toArray(new String[listofpermission.size()]),PERM_CODE);
            return false  ;
        }
        return true ;


    }
}