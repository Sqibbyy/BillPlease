import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {


    EditText etInput;
    EditText etInputs;
    ToggleButton tbtn;
    ToggleButton tgbtn;
    EditText etDiscount;
    RadioGroup rgPayment;
    Button btnSplit;
    Button btnReset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etInput = findViewById(R.id.editText1);
        etInputs = findViewById(R.id.editText2);
        tbtn = findViewById(R.id.toggleButtonSVS);
        tgbtn = findViewById(R.id.toggleButton5);
        etDiscount = findViewById(R.id.editText3);
        btnSplit = findViewById(R.id.button2);
        btnReset = findViewById(R.id.button3);


        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tbtn.isChecked() == true) {
                    etInput.getText().toString();
                    String stringResponse = etInput.getText().toString();
                    double svc = Double.parseDouble(stringResponse);
                    double amount = svc * 0.1;
                }
            }
        });

        tgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tgbtn.isChecked() == true) {
                    etInput.getText().toString();
                    String stringResponse = etInput.getText().toString();
                    double gst = Double.parseDouble(stringResponse);
                    double amount = gst * 0.07;
                }
            }
        });

        etDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double percentage = findViewById(R.id.textView5);
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                double discount = Double.parseDouble(stringResponse);
                double amount = discount * percentage;
            }
        });

        etInputs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double split = findViewById(R.id.editText2)
                etInput.getText().toString();
                String stringResponse = etInput.getText().toString();
                double gst = Double.parseDouble(stringResponse);
                double amount = gst * split;
            }
        });

    }
}
