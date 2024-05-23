package com.example.variaveis;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void verint(View view){

        EditText txtInt = findViewById(R.id.editTextInt);

        int numero_int = 0;

        numero_int = Integer.parseInt(txtInt.getText().toString());

        Toast.makeText(this, "Seu Número Inteiro é: "+ numero_int, Toast.LENGTH_LONG).show();
    }

    public void verdouble(View view){

        EditText txtDouble = findViewById(R.id.editTextDouble);

        double numero_double = 0;

        numero_double = Double.parseDouble(txtDouble.getText().toString());

        Toast.makeText(this, "Seu Número Double é: "+ numero_double, Toast.LENGTH_LONG).show();
    }

    public void verstring(View view){

        EditText txtString = findViewById(R.id.editTextString);

        String texto_string;

        texto_string = String.valueOf(txtString.getText());

        Toast.makeText(this, "Seu texto String é: "+ texto_string, Toast.LENGTH_LONG).show();
    }

}