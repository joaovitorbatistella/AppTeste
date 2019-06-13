package ifrs.ibiruba.appteste3info;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtResposta;
    EditText nome;
    EditText sobrenome;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.txtNome);
        sobrenome = findViewById(R.id.txtSobrenome);
        txtResposta = findViewById(R.id.txtResposta);


    }

    public void mostrar(View view) {
        //txtResposta.setText( "Olá: " + nome.getText() + " " + sobrenome.getText());
        Toast.makeText(this, "Olá: " + nome.getText() + " " + sobrenome.getText(), Toast.LENGTH_LONG).show();
    }
}