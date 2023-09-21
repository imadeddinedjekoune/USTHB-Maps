package sysmobile.usthb.usthbmap;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyData extends SQLiteOpenHelper {
    private Context context ;
    public static final String DATA_NAME = "DATA.db" ;
    public static final int  DATA_VERSION = 1 ;
    public static final String Table_NAME = "User";
    public  static final String COLUMN_MAT = "Matricule";
    public  static final String COLUMN_Email ="Email";
    public  static final String COLUMN_FullName ="FullName";
    public  static final String COLUMN_Password ="Password";
    public MyData(@Nullable Context context) {
        super(context,DATA_NAME ,null,DATA_VERSION);
        this.context = context ;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = " CREATE TABLE "+ Table_NAME +" ( "+COLUMN_MAT+" TEXT PRIMARY KEY, "
                +COLUMN_FullName +" TEXT, "+
                COLUMN_Email +" TEXT, "+
                COLUMN_Password+" TEXT);";
        db.execSQL(query);

        String query2 = " CREATE TABLE Links (Name TEXT PRIMARY KEY, link TEXT);";
        db.execSQL(query2);

        String query3 = " CREATE TABLE BlocC_D (Salle TEXT );";
        db.execSQL(query3);

        String query4 = " CREATE TABLE BlocC_TP (Salle TEXT );";
        db.execSQL(query4);

        String query5 = " CREATE TABLE  BlocR_E (Salle TEXT );";
        db.execSQL(query5);

        String query6 = " CREATE TABLE  BlocA_TP (Salle TEXT );";
        db.execSQL(query6);
        //ressouces
        String query7 = " CREATE TABLE  ressource (name TEXT , drive TEXT,ytb TEXT,facebook TEXT ,others TEXT );";
        db.execSQL(query7);

    }
     void insertDataRessource(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name","MI");
        cv.put("drive","https://drive.google.com/drive/folders/1rePkFljglXNKdabFTUp2w2w8Kk4nLnzY?fbclid=IwAR3_RXI9qtIzj7BV4pASIBb-3s3sUGwjkopgAJhNZKiM6niRqK0PCeuoJDQ");
        cv.put("ytb","https://www.youtube.com/channel/UCz3QtFjZZqvnAtpotFJbyUA");
        cv.put("facebook","https://web.facebook.com/groups/118233088880564/");
        cv.put("others","https://www.youtube.com/channel/UCVQORei1wqg8B-m382uxsfg/videos");
        db.insert("ressource" , null,cv);
        cv.put("name","ACAD");
        cv.put("drive","https://drive.google.com/drive/u/0/folders/1BB_VgroZ5FuF_zVw6tnXVc43NKv-LxXd");
        cv.put("ytb","https://www.youtube.com/channel/UCmt7wn0bMhvm-b-rmKVXYJw/videos?app=desktop");
        cv.put("facebook","https://web.facebook.com/groups/2969300286414950");
        cv.put("others","https://www.youtube.com/channel/UC0jmBpmm4n5yU2cImlCCpCw");
        db.insert("ressource" , null,cv);
        cv.put("name","ISIL");
        cv.put("drive","https://drive.google.com/drive/folders/1iO7VDljXrT_1Vsm0bI6dgs20Q7dizB1y?fbclid=IwAR31adwTpWNaD-F7cBs-ZKbGG9a_XZAa0XKoaNLMl5CuAwhUCuXq_7wL1Uk");
        cv.put("ytb","https://drive.google.com/drive/folders/1vXmcjDA_dNeeURCkj1poCxDsrHIhR8Uk");
        cv.put("facebook","https://web.facebook.com/groups/410799606252584");
        cv.put("others","");
        db.insert("ressource" , null,cv);
        cv.put("name","GTR");
        cv.put("drive","https://drive.google.com/drive/folders/1bzrLEHto06jMLWo7IHtZgrXhhgG1hsm7?fbclid=IwAR0RJ8wb7uZ_HWf-mIKjObKf9Gj6nJvaAqlLB5tpKvFDWJPFkHyOcJRDiq4");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","https://drive.google.com/drive/folders/16yZlnIu4PNBFBwDbFb4Xo7iZ7q_aQRWB?fbclid=IwAR2BozFoNiF_kvoNhyrYvdL-HYGdDMUDyyFwBLLY2zxYrW8-Q5bzZI98l6k");
        db.insert("ressource" , null,cv);
        cv.put("name","Math RO");
        cv.put("drive","https://drive.google.com/drive/folders/1_8i-kx7cAIFl8iE1DP6Y7y-0ec3M5GIX?fbclid=IwAR0i74uhalJPwL9_h9HQkm2LZgGvXwkB458ULOlTyfYx6c95wV1Qjj1TUYM");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","https://drive.google.com/drive/folders/1npZOmga2FYll6giehiOyfxZR59ErYY92?fbclid=IwAR0RyJ8FOJB2o3lAKXWAMHMN08jV3s04S7PQQR0brv-LtRSg6EcnlCgE1q8");
        db.insert("ressource" , null,cv);
        cv.put("name","MIV");
        cv.put("drive","https://drive.google.com/drive/folders/12kuvfMK2V3xNjGOgO0hrExfbTPJN1KB6?fbclid=IwAR1tKzM7qLG3WMwD-1f07efDBZc6pfbJ2OjciqFk_amkWAgTzHGoB7q5OKA");
        cv.put("ytb","https://www.youtube.com/@ivinformatiquem1586");
        cv.put("facebook","https://web.facebook.com/groups/169526235334562");
        cv.put("others","https://drive.google.com/drive/u/0/folders/1Z-P_0MWQkj2Hh9ApCFSzXMAnlqbQ7GJL?fbclid=IwAR2--qvx318BH6hNiuk_7BUQ-AwTN8iYeejfY6bJue16iDWd1ilDaE1tDlY");
        db.insert("ressource" , null,cv);
        cv.put("name","SII");
        cv.put("drive","https://drive.google.com/drive/folders/1a9PIUQEGJ7x5nihEwdSrWSi9j0eWud3V?fbclid=IwAR26aSJfbN7tx0G71QCxYJiHM9eu23u02yCZMgZVw9dhtrWLMgLHnUJL1iA");
        cv.put("ytb","https://www.youtube.com/@master01siiusthb61");
        cv.put("facebook","https://web.facebook.com/groups/473156674162190");
        cv.put("others","https://drive.google.com/drive/folders/1ujP8xBxeBgnJ-t-_1xxgcApx6WBxF1k0?fbclid=IwAR0Vrv-L58JkFFfjE4Ut2E0G0CAr-vdiX_165cxNNoZEIT-bghfAtxKsN0A");
        db.insert("ressource" , null,cv);
        cv.put("name","BIOINFO");
        cv.put("drive","https://drive.google.com/drive/folders/1nADQh2gkW6qhmtjLdOvK8PeLmOcpABTH?fbclid=IwAR2YmwsT4tSBoNIHXWf8sJK2HnfdO6Cr0Zu0cHLjKR81_8zzj3z5IyICFr8");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","");
        db.insert("ressource" , null,cv);
        cv.put("name","IL");
        cv.put("drive","https://drive.google.com/drive/folders/1UHHxIAahyjUof_iFJsFfBuR7TWPgH0WD?fbclid=IwAR3i42xPFEIYr7otsr3n_3Djq7XZeGg-CdefkHBkFWD-vkxJpCYOUdtemz0");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","");
        db.insert("ressource" , null,cv);
        cv.put("name","RSD");
        cv.put("drive","");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","");
        db.insert("ressource" , null,cv);
        cv.put("name","SSI");
        cv.put("drive","https://drive.google.com/drive/folders/1S6BTMmz-cWiWVPY9vmxQfExmEbnXzvH7?fbclid=IwAR2uBVFGSa2VvHHgQ1wUDY3lplvEkJMpGVO-t3qvQVmdt6XCO7vm_UGnPGk");
        cv.put("ytb","");
        cv.put("facebook","");
        cv.put("others","");
        db.insert("ressource" , null,cv);

    }
    private void loadSalleName() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Salle","TP C1"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C2"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C3"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C3A"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C3B"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C4"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C5"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C6"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C7"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C8"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C9"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo GC"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 1"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 2"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 3"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 4"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 5"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 6"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo 7"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","Labo Phy"); db.insert("BlocC_TP" , null,cv);
        //BlocR_E
        cv.put("Salle","E1"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E2"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E3"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E4"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E5"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E6"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E7"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","E8"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","EB4");db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R1"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R2"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R3"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R4"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R5"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R6"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R7"); db.insert("BlocR_E" , null,cv);
        cv.put("Salle","R8"); db.insert("BlocR_E" , null,cv);
        // BlocC_D
        cv.put("Salle","C1"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C2"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C3"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C4"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C5"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C6"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C7"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C7I"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C8I");db.insert("BlocC_D" , null,cv);
        cv.put("Salle","C9");db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D1"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D2"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D3"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D4"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D5"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D6"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D7"); db.insert("BlocC_D" , null,cv);
        cv.put("Salle","D8"); db.insert("BlocC_D" , null,cv);
        //BlocA_TP
        cv.put("Salle","A1.01"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.02"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.03"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.04"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.05"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.06"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.07"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.08"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.09"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A1.10"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.01"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.02"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.03"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.04"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.05"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.06"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.07"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.08"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.09"); db.insert("BlocA_TP" , null,cv);
        cv.put("Salle","A2.10"); db.insert("BlocA_TP" , null,cv);
        /*cv.put("Salle","TP C1"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C1"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C1"); db.insert("BlocC_TP" , null,cv);
        cv.put("Salle","TP C1"); db.insert("BlocC_TP" , null,cv);*/
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS "+ Table_NAME);
        onCreate(db);

    }
    Boolean addUser(String mat , String name , String email ,String password){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_MAT,mat);
        cv.put(COLUMN_FullName , name);
        cv.put(COLUMN_Email,email);
        cv.put(COLUMN_Password,password);
        long result = db.insert(Table_NAME , null,cv);
        if(result == -1){

            Toast.makeText(context,"Faild to add User",Toast.LENGTH_SHORT).show();
            return false ;
        }else{
            Toast.makeText(context,"User add Successfully!",Toast.LENGTH_SHORT).show();
            return true ;

        }
    }
    Boolean login (String email ,String password){
        loadLinks();
        loadSalleName();
        SQLiteDatabase db = this.getWritableDatabase();
        String query = "SELECT * FROM User where Email = "+email+ " and Password = "+password+";" ;
        Cursor cursor = db.rawQuery("SELECT * FROM User where Email = ? and Password = ? ",new String[]{email,password});
        if(cursor.getCount()>0){
            return true ;

        }
        return false ;
    }
    ArrayList<String> data(String Nom){
        ArrayList<String> list = new ArrayList<String>() ;
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT * FROM ressource where name = ?  ",new String[]{Nom});
        if(cursor.getCount()==0)return list;
        else{
            //Toast.makeText(context, "done data", Toast.LENGTH_SHORT).show();
            while (cursor.moveToNext()){
                list.add(cursor.getString(1));
                list.add(cursor.getString(2));
                list.add(cursor.getString(3));
                list.add(cursor.getString(4));

                return list ;
            }
        }

        return list ;

    }
    private void loadLinks() {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Name","TP C1");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC1_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C2");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC2_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C3");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC3A_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C3A");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC3B_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C3B");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC3_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC4_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C5");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC5_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C6");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC6_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C7");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC7_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C8");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC8_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","TP C9");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocC9_TP.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","Labo GC");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20C%20TP/BlocLaboGC.gltf");
        db.insert("Links" , null,cv);
       // C  D
        cv.put("Name","C1");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC1.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C2");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC2.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C3");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC3.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC4.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C5");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC5.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C6");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC6.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C7");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC7.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C7I");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC7I.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C8I");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC8I.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","C9");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocC9.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D1");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD1.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D2");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD2.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D3");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD3.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD4.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D5");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD5.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D6");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD6.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D7");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD7.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","D8");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF%20CD/BlocD8.gltf");
        db.insert("Links" , null,cv);
        //

        cv.put("Name","E1");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E1.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E2");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E2.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E3");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E3.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E4.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E5");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E5.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E6");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E6.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E7");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E7.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","E8");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_E8.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","EB4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_EB4.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R1");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R1.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R2");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R2.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R3");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R3.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R4");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R4.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R5");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R5.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R6");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R6.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R7");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R7.gltf");
        db.insert("Links" , null,cv);
        cv.put("Name","R8");cv.put("link","https://raw.githubusercontent.com/SouidiAmine/3DModels/main/ModesSalle/GLTF_ER/Salle_R8.gltf");
        db.insert("Links" , null,cv);

        //


    }
    boolean InBloc(String Bloc , String salle){
        Cursor cursor = null ;
        SQLiteDatabase db = this.getWritableDatabase();
        if(Bloc.equals("BlocC_TP"))
             cursor = db.rawQuery("SELECT * FROM BlocC_TP where Salle = ? ",new String[]{salle});
        if(Bloc.equals("BlocR_E"))
             cursor = db.rawQuery("SELECT * FROM BlocR_E where Salle = ? ",new String[]{salle});
        if(Bloc.equals("BlocC_D"))
            cursor = db.rawQuery("SELECT * FROM BlocC_D where Salle = ? ",new String[]{salle});
        if(Bloc.equals("BlocA_TP"))
            cursor = db.rawQuery("SELECT * FROM BlocA_TP where Salle = ? ",new String[]{salle});

        if(cursor.getCount()>0){
            return true ;
        }
        return false ;

    }
    String getLinks(String Name)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        Cursor cursor = db.rawQuery("SELECT link FROM Links where Name = ? ",new String[]{Name});
        if(cursor.getCount()==0)Toast.makeText(context, "Null", Toast.LENGTH_SHORT).show();
        else{
            while (cursor.moveToNext()){

                return cursor.getString(0) ;
            }
        }

        return "" ;

    }

    String serchInOther(String salle){
       if( InBloc( "BlocC_TP", salle))return "BlocC_TP" ;
       if( InBloc( "BlocR_E", salle))return "BlocR_E" ;
       if( InBloc( "BlocC_D", salle))return "BlocC_D" ;
       if( InBloc( "BlocA_TP", salle))return "BlocA_TP" ;
       return "";

    }
}
