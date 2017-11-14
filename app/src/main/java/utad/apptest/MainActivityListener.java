package utad.apptest;

import android.view.View;

/**
 * Created by juan.jusue on 13/11/2017.
 */

public class MainActivityListener implements View.OnClickListener {
            MainActivity mainActivity;
    Dataholder dataholder;
    MainActivityListener(MainActivity mainactivity){
        this.mainActivity = mainactivity;
    }
    public void onClick(View v) {
        if(v.getId()==R.id.btnEditar){
           // this.mainActivity.btnEditar.setText("Guardar");
            this.mainActivity.nameTxt.setEnabled(true);
            this.mainActivity.tlfnTxt.setEnabled(true);
            this.mainActivity.mailTxt.setEnabled(true);
            this.mainActivity.direccionTxt.setEnabled(true);
            this.mainActivity.btnGuardar.setEnabled(true);
            this.mainActivity.btnEditar.setEnabled(false);
            this.mainActivity.btnEditar.setVisibility(View.INVISIBLE);
            this.mainActivity.btnGuardar.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.btnGuardar){
            dataholder.setName(this.mainActivity.nameTxt.getText().toString());
            dataholder.setDireccion(this.mainActivity.nameTxt.getText().toString());
            dataholder.setMail(this.mainActivity.nameTxt.getText().toString());
            dataholder.setTelefono(this.mainActivity.nameTxt.getText().toString());

        }
    }

    public void setDataholder(Dataholder dataholder) {
        this.dataholder = dataholder;
    }
}
