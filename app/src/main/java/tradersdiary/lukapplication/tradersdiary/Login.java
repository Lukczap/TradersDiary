package tradersdiary.lukapplication.tradersdiary;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends AppCompatActivity {

    EditText loginEditText;
    EditText passwordEditText;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginEditText = (EditText)findViewById(R.id.loginEditText);
        passwordEditText = (EditText)findViewById(R.id.passwordEditText);
        loginButton = (Button)findViewById(R.id.loginButton);

        ImageView resultImage = (ImageView) findViewById(R.id.wallstreet);
        Bitmap resultBmp = BlurBitmap.blur(this, BitmapFactory.decodeResource(getResources(), R.drawable.wallstreet));
        resultImage.setImageBitmap(resultBmp);


    }
}
