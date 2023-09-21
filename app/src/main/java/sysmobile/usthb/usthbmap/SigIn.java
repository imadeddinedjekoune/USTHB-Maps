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

public class SigIn extends AppCompatActivity {
    private TextView signup ;
    private Button btn ;
    private EditText mailText ;
    private EditText PasswordText ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sig_in);
        signup = findViewById(R.id.SignUpTxt);
        mailText= findViewById(R.id.mailText);
        PasswordText= findViewById(R.id.PasswordText);
        signup.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent(SigIn.this,Register.class);
                startActivity(i);

            }
        });
        btn = findViewById(R.id.LoginBtn);


        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(verifierInput()) {
                            try (MyData myData = new MyData(SigIn.this)) {
                                boolean res = myData.login(mailText.getText().toString().trim(), PasswordText.getText().toString().trim());
                                if (res) {
                                    Intent i = new Intent(SigIn.this, FirstPage.class);
                                    startActivity(i);
                                } else {
                                    Toast.makeText(SigIn.this, "Email or password is invalid !", Toast.LENGTH_SHORT).show();
                                }

                            }
                        }

                    }
                });


    }

    boolean verifierInput(){
       String sUsername = mailText.getText().toString();
        String sUsername2 = PasswordText.getText().toString();
        if (sUsername.matches("")) {
            mailText.setError("You did not enter a email");

            return false;
        }
        if (sUsername2.matches("")) {
            PasswordText.setError("You did not enter a Password");
            return false;
        }

        if(!patternMatches(sUsername)){
            mailText.setError("Enter a valid email");
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