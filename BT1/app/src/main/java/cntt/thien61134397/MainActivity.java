package cntt.thien61134397;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username =(TextView) findViewById(R.id.username);
    TextView password =(TextView) findViewById(R.id.password);
    Button btn =(Button) findViewById(R.id.btn);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("maicuongtho") && password.getText().toString().equals("Cntt60!"))
                {
                    Toast.makeText(MainActivity.this, "Username and password is correct", Toast.LENGTH_SHORT).show();
                } else
                    Toast.makeText(MainActivity.this, "Username and password is wrong", Toast.LENGTH_SHORT).show();

            }
        }
    }
}