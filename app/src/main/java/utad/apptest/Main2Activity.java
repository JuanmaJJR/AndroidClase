package utad.apptest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private Main2ActivityListener listen;
    Button btnPerfil;
    Button btnAnterior;
    Button btnSiguiente;
    EditText titulos;
    EditText texto;

    public String[] titulosar;
    public String[] cuerposar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listen = new Main2ActivityListener(this);
        btnPerfil = (Button) this.findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(listen);


        btnAnterior = (Button) this.findViewById(R.id.btnAnterior);
        btnAnterior.setOnClickListener(listen);
        btnSiguiente = (Button) this.findViewById(R.id.btnSiguiente);
        btnSiguiente.setOnClickListener(listen);

        titulos = (EditText) this.findViewById(R.id.tituloTxt);
        titulosar = this.getResources().getStringArray(R.array.titulos);
        cuerposar = this.getResources().getStringArray(R.array.textos);

        titulos.setText(titulosar[0]);


        texto = (EditText) this.findViewById(R.id.textoTxt);
        texto.setText((cuerposar[0]));


    }

}
