package ifrs.ibiruba.appteste3info;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText email;
    EditText telefone;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.txtNome);
        email = findViewById(R.id.txtEmail);
        telefone = findViewById(R.id.txtTelefone);


    }

    public void mostrar(View view) {
        //txtResposta.setText( "Olá: " + nome.getText() + " " + sobrenome.getText());
        //Toast.makeText(this, "Olá: " + nome.getText() + " " + sobrenome.getText(), Toast.LENGTH_LONG).show();
        Intent it = new Intent( this, Tela2Activity.class );
        it.putExtra("nome", nome.getText());
        it.putExtra("email", email.getText());
        it.putExtra("telefone", telefone.getText());
        startActivity(it);
    }
}