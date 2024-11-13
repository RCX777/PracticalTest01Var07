package ro.pub.cs.systems.eim.practicaltest01var07

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.text.isDigitsOnly
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PracticalTest01Var07MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_practical_test01_var07_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonSet = findViewById<Button>(R.id.set)
        // on press, execute secondaryActivity through an intent
        buttonSet.setOnClickListener {
            val value1 = findViewById<EditText>(R.id.textbox1).text.toString()
            val value2 = findViewById<EditText>(R.id.textbox2).text.toString()
            val value3 = findViewById<EditText>(R.id.textbox3).text.toString()
            val value4 = findViewById<EditText>(R.id.textbox4).text.toString()

            // if value1 or value2 or value3 or value3 are not numbers, return
            if (!value1.isDigitsOnly()
                || !value2.isDigitsOnly()
                || !value3.isDigitsOnly()
                || !value4.isDigitsOnly()) {
                return@setOnClickListener
            }

            val intent = Intent(this, PracticalTest01Var07SecondaryActivity::class.java)
            intent.putExtra("value1", value1)
            intent.putExtra("value2", value2)
            intent.putExtra("value3", value3)
            intent.putExtra("value4", value4)
            startActivityForResult(intent, 1)
        }
    }
}