package tradersdiary.lukapplication.tradersdiary;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class Login extends AppCompatActivity {

    EditText usernameEditText;
    EditText passwordEditText;
    Button loginButton;
    Button createAccountButton;

    //Firebase authentication field

    FirebaseAuth firebaseAuth;
    FirebaseAuth.AuthStateListener authStateListener;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = (EditText) findViewById(R.id.loginEditText);
        passwordEditText = (EditText) findViewById(R.id.passwordEditText);
        loginButton = (Button) findViewById(R.id.loginButton);
        createAccountButton = (Button) findViewById(R.id.createAccountButton);


        //Assign instance

        firebaseAuth = FirebaseAuth.getInstance();

        authStateListener = new FirebaseAuth.AuthStateListener() {

            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {


                FirebaseUser user = firebaseAuth.getCurrentUser();

                if (user != null) {

                } else {

                    startActivity(new Intent(Login.this, MainActivity.class));

                }

            }
        };


        //on click Listener

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String usernameString, passwordString;

                usernameString = usernameEditText.getText().toString().trim();
                passwordString = passwordEditText.getText().toString().trim();

                if(TextUtils.isEmpty(usernameString) && TextUtils.isEmpty(passwordString)){

                    firebaseAuth.createUserWithEmailAndPassword(usernameString, passwordString).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {


                            if (task.isSuccessful()){

                                Toast.makeText(Login.this, "User Account Created", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(Login.this, MainActivity.class));

                            }else{



                            }

                        }
                    });

                }


            }
        });

        //Move to Login

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

        @Override
        protected void onStart() {
            super.onStart();

        firebaseAuth.addAuthStateListener(authStateListener);

        }

        @Override
        protected void onStop() {
            super.onStop();

            firebaseAuth.removeAuthStateListener(authStateListener);

        }













        ImageView resultImage = (ImageView) findViewById(R.id.wallstreet);
        Bitmap resultBmp = BlurBitmap.blur(this, BitmapFactory.decodeResource(getResources(), R.drawable.wallstreet));
        resultImage.setImageBitmap(resultBmp);


    }
}
