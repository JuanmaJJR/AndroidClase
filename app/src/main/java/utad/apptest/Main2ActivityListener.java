package utad.apptest;

import android.content.Intent;
import android.view.View;

/**
 * Created by juan.jusue on 14/11/2017.
 */

public class Main2ActivityListener implements View.OnClickListener {
    Main2Activity main2Activity;
    int contador = 0;

    Main2ActivityListener(Main2Activity mainActivity){
        this.main2Activity = mainActivity;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPerfil){

            Intent intent = new Intent(main2Activity,MainActivity.class);
            main2Activity.startActivity(intent);
            main2Activity.finish();

        }
        if (v.getId() == R.id.btnSiguiente){
            contador++;
            main2Activity.titulos.setText(main2Activity.titulosar[contador]);
            main2Activity.texto.setText(main2Activity.cuerposar[contador]);
            if(contador == 3){
                contador = 0;
            }

        }
        if (v.getId() == R.id.btnAnterior){
            if(contador == 0){
                contador = 4;
            }
            contador--;
            main2Activity.titulos.setText(main2Activity.titulosar[contador]);
            main2Activity.texto.setText(main2Activity.cuerposar[contador]);

        }

    }
}
