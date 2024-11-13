package ro.pub.cs.systems.eim.practicaltest01var07

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PracticalTest01Var07SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practical_test01_var07_secondary)

        val value1 = intent.getStringExtra("value1");
        val value2 = intent.getStringExtra("value2");
        val value3 = intent.getStringExtra("value3");
        val value4 = intent.getStringExtra("value4");

        val value1TextView = findViewById<TextView>(R.id.value1)
        value1TextView.text = value1
        val value2TextView = findViewById<TextView>(R.id.value2)
        value2TextView.text = value2
        val value3TextView = findViewById<TextView>(R.id.value3)
        value3TextView.text = value3
        val value4TextView = findViewById<TextView>(R.id.value4)
        value4TextView.text = value4

        val buttonSum = findViewById<Button>(R.id.buttonSum)
        buttonSum.setOnClickListener {
            val sum = (value1?.toInt() ?: 0) + (value2?.toInt() ?:0) + (value3?.toInt() ?:0) + (value4?.toInt()
                ?:0)
            Toast.makeText(this, "Sum: $sum", Toast.LENGTH_LONG).show()
        }

        val buttonProduct = findViewById<Button>(R.id.buttonProduct)
        buttonProduct.setOnClickListener {
            val product = (value1?.toInt() ?: 0) * (value2?.toInt() ?:0) * (value3?.toInt() ?:0) * (value4?.toInt()
                ?:0)
            Toast.makeText(this, "Product: $product", Toast.LENGTH_LONG).show()
        }
    }
}