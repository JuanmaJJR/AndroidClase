package utad.apptest;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import static android.R.attr.tag;

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
            dataholder.instance.telefono = this.mainActivity.tlfnTxt.getText().toString();
            dataholder.instance.name= this.mainActivity.nameTxt.getText().toString();
            dataholder.instance.direccion=this.mainActivity.direccionTxt.getText().toString();
            dataholder.instance.mail=this.mainActivity.mailTxt.getText().toString();
            mainActivity.nameTxt.setEnabled(false);
            mainActivity.tlfnTxt.setEnabled(false);
            mainActivity.mailTxt.setEnabled(false);
            mainActivity.direccionTxt.setEnabled(false);
            }
        else if(v.getId()==R.id.btnVolver){
            Log.v("sdfsdf","dsfsdf");
            Intent intent = new Intent(mainActivity,Main2Activity.class);
            mainActivity.startActivity(intent);
            mainActivity.finish();
        }
    }

    public void setDataholder(Dataholder dataholder) {
        this.dataholder = dataholder;
    }
}
