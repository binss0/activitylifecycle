package com.eventhandler.eve;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        EditText edtName = findViewById(R.id.edtName);
        TextView txtresult = findViewById(R.id.txtresult);
        Button btnHello = findViewById(R.id.btnHello);
        Button btnClear = findViewById(R.id.btnClear);

        btnHello.setOnClickListener(v -> {
            String name = edtName.getText().toString().trim();
            if (name.isEmpty()) {
                Toast.makeText(this, "Enter Your Name", Toast.LENGTH_SHORT).show();
            } else {
                txtresult.setText("Hello: " + name + "!");
            }
        });

        btnClear.setOnClickListener(v -> {
            txtresult.setText("");
            edtName.setText("");
        });
    }
}

