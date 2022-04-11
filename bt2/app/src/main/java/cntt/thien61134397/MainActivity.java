package cntt.thien61134397;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioButton rd13=(RadioButton) findViewById(R.id.radio1);
    RadioButton rd15=(RadioButton) findViewById(R.id.radio2);
    RadioButton rd18=(RadioButton) findViewById(R.id.radio3);
    Button btn =(Button) findViewById(R.id.btn);
    TextView ketqua=(TextView) findViewById(R.id.ketqua);
    EditText edit =(EditText) findViewById(R.id.edit);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float sotien=Float.parseFloat(edit.getText().toString());
                if(rd13.isChecked())
                {
                    float tip=(float) (sotien*0.13);
                    ketqua.setText("Your tip will be $"+tip);
                    Toast.makeText(MainActivity.this, "Your tip will be $"+tip, Toast.LENGTH_SHORT).show();
                }
                if(rd15.isChecked())
                {
                    float tip=(float) (sotien*0.15);
                    ketqua.setText("Your tip will be $"+tip);
                    Toast.makeText(MainActivity.this, "Your tip will be $"+tip, Toast.LENGTH_SHORT).show();
                }
                if(rd18.isChecked())
                {
                    float tip=(float) (sotien*0.18);
                    ketqua.setText("Your tip will be $"+tip);
                    Toast.makeText(MainActivity.this, "Your tip will be $"+tip, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}