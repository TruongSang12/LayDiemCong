package truongxuansang.baikt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView atm;
        EditText user, pass;
        Button btn;

        atm = (TextView) findViewById(R.id.atm);
        user = (EditText) findViewById (R.id.edtUserName);
        pass = (EditText) findViewById(R.id.edtPass);
        btn = (Button) findViewById(R.id.btnOK);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userN = user.getText().toString().trim();
                String passW = pass.getText().toString().trim();

                if (userN == "sang" && passW == "123")
                    Toast.makeText(MainActivity.this,"User and Password is correct",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(MainActivity.this,"User and Password is wrong",Toast.LENGTH_LONG).show();
            }
        });


    }
}