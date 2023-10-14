package com.example.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bmi.ui.theme.BmiTheme

class MainActivity : ComponentActivity() {
    lateinit var edTB : EditText
    lateinit var btnHitung : Button
    lateinit var tvHasil : TextView
    lateinit var rdgr : RadioGroup
    lateinit var rdbL : RadioButton
    lateinit var rdbP : RadioButton
    lateinit var selectedRadio : RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bmilayout)

        edTB = findViewById(R.id.edTinggiBadan)
        btnHitung = findViewById(R.id.btnHitung)
        tvHasil = findViewById(R.id.tvHasil)
        rdgr = findViewById(R.id.rdgroup)
        rdbL = findViewById(R.id.laki)
        rdbP = findViewById(R.id.perempuan)

        btnHitung.setOnClickListener {
            val selected: Int = rdgr.checkedRadioButtonId
            if (selected != -1) {
                selectedRadio = findViewById(selected)

                val jk: String = selectedRadio.text.toString()

                if (jk == "laki"){
                    var hasil = (edTB.text.toString().toInt() -100)- ((edTB.text.toString().toInt()-100)*0.1)
                    tvHasil.text = hasil.toString()
                }else{
                    var hasil = (edTB.text.toString().toInt() -100)- ((edTB.text.toString().toInt()-100)*0.15)
                    tvHasil.text = hasil.toString()
                }
            }
        }
    }
}
