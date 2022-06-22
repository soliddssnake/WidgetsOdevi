package com.example.widgetsodevi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.widgetsodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        var toplama = ""
        var islemler = ""
        var sonuc = 0

        tasarim.button0.setOnClickListener {
            toplama += 0
            islemler += 0
            tasarim.textView.text = islemler
        }

        tasarim.button1.setOnClickListener {
            toplama += 1
            islemler += 1
            tasarim.textView.text = islemler
        }

        tasarim.button2.setOnClickListener {
            toplama += 2
            islemler += 2
            tasarim.textView.text = islemler
        }

        tasarim.button3.setOnClickListener {
            toplama += 3
            islemler += 3
            tasarim.textView.text = islemler
        }

        tasarim.button4.setOnClickListener {
            toplama += 4
            islemler += 4
            tasarim.textView.text = islemler
        }

        tasarim.button5.setOnClickListener {
            toplama += 5
            islemler += 5
            tasarim.textView.text = islemler
        }

        tasarim.button6.setOnClickListener {
            toplama += 6
            islemler += 6
            tasarim.textView.text = islemler
        }

        tasarim.button7.setOnClickListener {
            toplama += 7
            islemler += 7
            tasarim.textView.text = islemler
        }

        tasarim.button8.setOnClickListener {
            toplama += 8
            islemler += 8
            tasarim.textView.text = islemler
        }

        tasarim.button9.setOnClickListener {
            toplama += 9
            islemler += 9
            tasarim.textView.text = islemler
        }

        tasarim.buttonAC.setOnClickListener {
            toplama = ""
            islemler = ""
            sonuc = 0
            tasarim.textView.text = "0"
        }

        tasarim.buttonArti.setOnClickListener {
            sonuc += if (toplama.isNotEmpty()) toplama.toInt() else 0
            toplama = ""
            islemler += if (islemler.isNotEmpty() && !islemler.last().equals('+')) "+" else ""
            tasarim.textView.text = if (islemler.isEmpty()) "0" else islemler
        }

        tasarim.buttonEsit.setOnClickListener {
            sonuc += if (toplama.isNotEmpty()) toplama.toInt() else 0
            toplama = ""
            islemler = ""
            tasarim.textView.text = sonuc.toString()
            islemler = sonuc.toString()
        }

    }
}