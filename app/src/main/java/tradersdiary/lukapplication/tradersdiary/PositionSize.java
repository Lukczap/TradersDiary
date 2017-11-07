package tradersdiary.lukapplication.tradersdiary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PositionSize extends AppCompatActivity {

    EditText accountSizeEditText;
    EditText riskEditText;
    EditText atrEditText;
    EditText valueOfTickEditText;
    Button  calculatingButton;
    TextView textView8;
    TextView stopTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.position_size);

        accountSizeEditText = (EditText)findViewById(R.id.accountSizeEditText);
        riskEditText = (EditText) findViewById(R.id.riskEditText);
        atrEditText = (EditText)findViewById(R.id.atrEditText);
        valueOfTickEditText = (EditText)findViewById(R.id.valueOfTickEditText);
        calculatingButton = (Button)findViewById(R.id.calculatingButton);
        textView8 = (TextView)findViewById(R.id.textView8);
        stopTextView = (TextView)findViewById(R.id.stopTextView);

        calculatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    String account = accountSizeEditText.getText().toString();
                    String risk = riskEditText.getText().toString();
                    String atr = atrEditText.getText().toString();
                    String tickValue = valueOfTickEditText.getText().toString();


                    double tickResult = Double.parseDouble(atr) * 2;
                    double value = Double.parseDouble(tickValue);
                    double calculate = (Double.parseDouble(account) * (Double.parseDouble(risk) * 0.01))/((Double.parseDouble(atr)*2)*value);

                    textView8.setText(String.valueOf(Math.round(calculate)));
                    stopTextView.setText(String.valueOf(tickResult));


                } catch (Exception e){
                }

            }
        });







    }
}
