package tradersdiary.lukapplication.tradersdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PositionSize extends AppCompatActivity {

    EditText accountSizeEditText;
    EditText riskEditText;
    EditText atrEditText;
    EditText valueOfTickEditText;
    Button  calculatingButton;


    private void calculating(View view){

 accountSizeEditText.getText();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position_size);

        accountSizeEditText = (EditText)findViewById(R.id.accountSizeEditText);
        riskEditText = (EditText) findViewById(R.id.riskEditText);
        atrEditText = (EditText)findViewById(R.id.atrEditText);
        valueOfTickEditText = (EditText)findViewById(R.id.valueOfTickEditText);
        calculatingButton = (Button)findViewById(R.id.calculatingButton);





    }
}
