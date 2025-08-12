package org.gwy.golight

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignalActivity : AppCompatActivity() {
    private lateinit var symbolView: TextView
    private var toggleSymbol = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signal)

        symbolView = findViewById(R.id.symbolView)
        symbolView.setOnClickListener {
            toggleSymbol = !toggleSymbol
            symbolView.text = if (toggleSymbol) "?" else "!"
        }
    }
}
