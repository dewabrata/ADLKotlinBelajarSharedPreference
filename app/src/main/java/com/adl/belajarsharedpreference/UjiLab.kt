package com.adl.belajarsharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_uji_lab.*

class UjiLab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uji_lab)

        seekBar.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
            txtSlider.setText("Nilainya adalah : ${p1.toString()}")

            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })

        radioGroup.setOnCheckedChangeListener(object : RadioGroup.OnCheckedChangeListener{
            override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {

               val resultt =  when(p1){
                   R.id.radioButton -> "Option 1"
                   R.id.radioButton2 -> "Option 2"
                   R.id.radioButton3 -> "Option 3"
                   else -> "No Option"
                }
                Toast.makeText(this@UjiLab, "Pilihannya adalah ${resultt}",Toast.LENGTH_LONG).show()
            }

        })
    }
}