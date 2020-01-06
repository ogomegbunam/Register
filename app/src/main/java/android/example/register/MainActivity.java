package android.example.register;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterBtnClick (View view){
        EditText firstName = findViewById(R.id.editTextFirstName);
        EditText lastName  = findViewById(R.id.editTextLastName);
        EditText email = findViewById(R.id.editTextEmail);

        TextView txtViewFirstName = findViewById(R.id.textViewFirstName);
        TextView txtViewLastName  = findViewById(R.id.textViewLastName);
        TextView txtViewEmail = findViewById(R.id.textViewEmail);

        txtViewFirstName.setText("First Name:"+firstName.getText().toString());
        txtViewLastName.setText("Last Name:"+lastName.getText().toString());
        txtViewEmail.setText("Email:"+email.getText().toString());

    }
}
