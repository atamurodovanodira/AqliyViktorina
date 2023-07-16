package nodira.atamurodova.aqliyviktorina;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    EditText username;
    EditText password;
    Button loginButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                    {
                        Toast.makeText(LoginScreen.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(LoginScreen.this, HomeActivity.class);
                        startActivity(intent);
                    }

                } else {
                    Toast.makeText(LoginScreen.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}