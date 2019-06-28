package ifrs.ibiruba.appteste3info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    CompoundButton checkBox;
    ToggleButton toggleButton;
    Switch switchButton;
    Spinner spinner;
    RadioGroup radioGroup;
    TextView txtValor;
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox = findViewById(R.id.cbHabilitar);
        toggleButton = findViewById(R.id.tbHabilitar);
        switchButton = findViewById(R.id.swHabilitar);
        spinner = findViewById(R.id.spNomes);
        radioGroup = findViewById(R.id.rgOpcoes);
        txtValor = findViewById(R.id.txtValor);
        seekBar = findViewById(R.id.sbValor);

        configuraSpinner();
        configuraSeekBar();
        configuraSwitch();

        checkBox.setChecked(true);
        seekBar.setProgress(20);
        radioGroup.check(R.id.rbOpcao2);

    }

    private void configuraSeekBar(){
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtValor.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    private void configuraSpinner(){
        String[] nomes = new String[]{"Messi", "Ronaldo", "Jael", "Dedé Balada"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nomes);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    private void configuraSwitch(){
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton b, boolean estado) {
                checkBox.setEnabled(b.isChecked());
                toggleButton.setEnabled(estado);
            }
        });
    }


    public void verValores(View v){
        String texto;

        texto = "Nome: " + spinner.getSelectedItem();

        int id = radioGroup.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);

        texto = texto + " \nOpção: " + rb.getText();

        Toast toast = Toast.makeText(this, texto, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
        toast.show();
    }


}