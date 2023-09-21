package sysmobile.usthb.usthbmap;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Register extends AppCompatActivity  {
    private TextView signin ;
    private EditText Email ;
    private EditText FullName ;
    private EditText Matricule ;
    private EditText Password ;
    private EditText ConPassword ;
    private Button registerBtn ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        signin      = findViewById(R.id.LoginTxt);
        Email       = findViewById(R.id.email);
        FullName    = findViewById(R.id.Fullname);
        Matricule   = findViewById(R.id.Matricule);
        Password    = findViewById(R.id.Password);
        ConPassword = findViewById(R.id.ConPassword);
        registerBtn = findViewById(R.id.RegisterBtn);

        signin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent i = new Intent(Register.this,SigIn.class);
                startActivity(i);

            }
        });
        registerBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (verifierInput()) {
                    try (MyData myData = new MyData(Register.this)) {
                        if ( myData.addUser(Matricule.getText().toString().trim(), FullName.getText().toString().trim(), Email.getText().toString().trim(), Password.getText().toString().trim()) )freeTexts();
                    }
               /* Intent i = new Intent(Register.this,SigIn.class);
                startActivity(i);*/

                }
            }
        });


    }

    private void freeTexts() {
        FullName.setText("");
        Password.setText("");
        Email.setText("");
        Matricule.setText("");
        ConPassword.setText("");
    }

    boolean verifierInput(){
        String name = FullName.getText().toString();
        String password = Password.getText().toString();
        String email = Email.getText().toString();
        String matricule = Matricule.getText().toString();
        String conPassword = ConPassword.getText().toString();

        if (email.matches("")) {
            Email.setError("You did not enter a email");

            return false;
        }
        if (name.matches("")) {
            FullName.setError("You did not enter a Name");
            return false;
        }
        if (matricule.matches("")) {
            Matricule.setError("You did not enter your Matricule");
            return false;
        }
        if (password.matches("")) {
            Password.setError("You did not enter a Password");
            return false;
        }
        if (conPassword.matches("")) {
            ConPassword.setError("You did not enter a second Password");
            return false;
        }
        if (!password.equals(conPassword)){
            //Toast.makeText(Register.this,"Please entre tha same password!",Toast.LENGTH_SHORT).show();
            ConPassword.setError("Please entre tha same password!");
            return false;
        }
        if(!patternMatches(email)){
            Email.setError("Enter a valid email");
            return false;
        }
        return true ;
    }
    public static boolean patternMatches(String emailAddress) {
        String  regexPattern = "^(.+)@(\\S+)$" ;
        return Pattern.compile(regexPattern)
                .matcher(emailAddress)
                .matches();
    }

}