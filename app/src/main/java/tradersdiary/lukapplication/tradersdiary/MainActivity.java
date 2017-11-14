package tradersdiary.lukapplication.tradersdiary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button observationButton;
    Button positionSizeButton;
    Button positionNoteButton;
    Button logoutButton;

    public void positionSize(View view){

        Intent intent = new Intent(MainActivity.this, PositionSize.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observationButton = (Button)findViewById(R.id.observationButton);
        positionSizeButton = (Button)findViewById(R.id.positionSizeButton);
        positionNoteButton = (Button)findViewById(R.id.positionNoteButton);
        logoutButton = (Button)findViewById(R.id.logoutButton);


    }
}
