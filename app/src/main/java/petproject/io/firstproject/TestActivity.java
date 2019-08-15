package petproject.io.firstproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {

    EditText nome;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        nome = (EditText) findViewById(R.id.etNome);
        btn = (Button) findViewById(R.id.btnSaldar);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Salute("Olá " + nome.getText(), "Bem Vindo!");
            }
        });
    }

    private void Salute(String message, String title){
        AlertDialog dialog = new AlertDialog.Builder(TestActivity.this)
                .setMessage(message)
                .setTitle(title)
                .setCancelable(false)
                .setPositiveButton("OK", null)
                .create();
        dialog.show();
    }


}
