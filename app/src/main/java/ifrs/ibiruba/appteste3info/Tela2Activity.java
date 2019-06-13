package ifrs.ibiruba.appteste3info;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Tela2Activity extends AppCompatActivity {

    TextView nome;
    TextView email;
    TextView telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        nome = findViewById(R.id.txtNome2);
        email = findViewById(R.id.txtEmail2);
        telefone = findViewById(R.id.txtTelefone2);

        Intent it = getIntent();

        nome.setText(it.getStringExtra("nome"));
        email.setText(it.getStringExtra("email"));
        telefone.setText(it.getStringExtra("telefone"));

    }
}
