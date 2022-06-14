package com.example.deber1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        findViewById<TextView>(R.id.lblNombre).setText(this.intent.extras?.getString("txtNombre"));
        findViewById<TextView>(R.id.lblGenero).setText(this.intent.extras?.getString("rdbFemenino"));
        findViewById<TextView>(R.id.lblFecNac).setText(this.intent.extras?.getString("txdFecNac"));
        findViewById<TextView>(R.id.lblTelefono).setText(this.intent.extras?.getString("txpTelefono"));

        findViewById<Button>(R.id.btnREGRESAR).setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }

    }


}