package petproject.io.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Exercicio02 extends AppCompatActivity {

    EditText caixa01;
    EditText caixa02;
    EditText caixa03;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio02);

        caixa01 = findViewById(R.id.caixa01);
        caixa02 = findViewById(R.id.caixa02);
        caixa03 = findViewById(R.id.resultado);
        btn = findViewById(R.id.somar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Integer numero1 = Integer.parseInt(caixa01.getText().toString());
                final Integer numero2 = Integer.parseInt(caixa02.getText().toString());
                final Integer resultado = numero1 + numero2;
                caixa03.setText(resultado.toString());
            }
        });
    }
}
