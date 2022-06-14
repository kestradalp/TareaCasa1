package com.example.deber1

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun enviarDatos(view: View){
        val txtNombre = findViewById<EditText>(R.id.txtNombre).text.toString()
        val txdFecNac = findViewById<EditText>(R.id.txdFecNac).text.toString()
        val txpTelefono = findViewById<EditText>(R.id.txpTelefono).text.toString()
        val rdnGenero = if (findViewById<RadioButton>(R.id.rdbFemenino).isChecked ){
            findViewById<RadioButton>(R.id.rdbFemenino).text.toString()
        } else if(findViewById<RadioButton>(R.id.rdbMasculino).isChecked) {
            findViewById<RadioButton>(R.id.rdbMasculino).text.toString()
        } else {
            ""
        }

        if(!(txtNombre.isEmpty() || txdFecNac.isEmpty() || rdnGenero.isEmpty() || txpTelefono.isEmpty())){
            val bundle = Bundle()
            bundle.putString("txtNombre", txtNombre)
            bundle.putString("txdFecNac", txdFecNac)
            bundle.putString("rdbFemenino", rdnGenero)
            bundle.putString("txpTelefono", txpTelefono)

            startActivity(Intent(this, MainActivity2::class.java).putExtras(bundle))
        } else {
            showDialogAlertSimple()
        }
    }

    fun showDialogAlertSimple() {
        AlertDialog.Builder(this)
            .setTitle("Error")
            .setMessage("Verifique los datos ingresados")
            .setPositiveButton("OK",
                DialogInterface.OnClickListener { dialog, which -> dialog.dismiss()})
            .show()
    }

}