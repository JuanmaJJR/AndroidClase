package utad.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnEditar;
    Button btnVolver;
    Button btnGuardar;
    EditText mailTxt;
    EditText tlfnTxt;
    EditText nameTxt;
    EditText direccionTxt;

    private MainActivityListener listen;
    Dataholder dataholder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listen=new MainActivityListener(this);
        dataholder = new Dataholder();
        listen.setDataholder(dataholder);

        btnEditar = (Button) this.findViewById(R.id.btnEditar);
        btnEditar.setOnClickListener(listen);
        btnVolver = (Button) this.findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(listen);
        btnGuardar = (Button) this.findViewById(R.id.btnGuardar);
        btnGuardar.setOnClickListener(listen);
        btnGuardar.setEnabled(false);
        btnGuardar.setVisibility(View.INVISIBLE);

        nameTxt = (EditText) this.findViewById(R.id.nameTxt);
        mailTxt = (EditText) this.findViewById(R.id.mailTxt);
        tlfnTxt = (EditText) this.findViewById(R.id.tlfnTxt);
        direccionTxt = (EditText) this.findViewById(R.id.direccionTxt);

        nameTxt.setEnabled(false);
        tlfnTxt.setEnabled(false);
        mailTxt.setEnabled(false);
        direccionTxt.setEnabled(false);
    }


}
