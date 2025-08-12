import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.gwy.golight.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello Gerald!"
    }
}

