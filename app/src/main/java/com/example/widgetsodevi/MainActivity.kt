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
        var counter = 0

        tasarim.button0.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler else 0
            islemler += if (islemler.isNotEmpty() && islemler.last() != '+' && islemler != "0") "0" else ""
            tasarim.textView.text = if (islemler == "") "0" else islemler
        }

        tasarim.button1.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 1 else 1
            islemler += 1
            tasarim.textView.text = islemler
        }

        tasarim.button2.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 2 else 2
            islemler += 2
            tasarim.textView.text = islemler
        }

        tasarim.button3.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 3 else 3
            islemler += 3
            tasarim.textView.text = islemler
        }

        tasarim.button4.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 4 else 4
            islemler += 4
            tasarim.textView.text = islemler
        }

        tasarim.button5.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 5 else 5
            islemler += 5
            tasarim.textView.text = islemler
        }

        tasarim.button6.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 6 else 6
            islemler += 6
            tasarim.textView.text = islemler
        }

        tasarim.button7.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 7 else 7
            islemler += 7
            tasarim.textView.text = islemler
        }

        tasarim.button8.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 8 else 8
            islemler += 8
            tasarim.textView.text = islemler
        }

        tasarim.button9.setOnClickListener {
            toplama += if (islemler == sonuc.toString()) islemler + 9 else 9
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

            if (toplama == islemler)
                sonuc = 0
            sonuc += if (toplama.isNotEmpty()) toplama.toInt() else 0
            toplama = ""
            islemler += if (islemler.isNotEmpty() && islemler != "0" && islemler.last() != '+') "+" else ""
            tasarim.textView.text = islemler.ifEmpty { "0" }
            counter++
        }

        tasarim.buttonEsit.setOnClickListener {
            sonuc += if (toplama.isNotEmpty() && counter > 0) toplama.toInt() else 0
            islemler = ""
            toplama = ""
            tasarim.textView.text = sonuc.toString()
            islemler += sonuc.toString()
            counter = 0
        }

    }
}