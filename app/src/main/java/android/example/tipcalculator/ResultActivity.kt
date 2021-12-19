package android.example.tipcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import java.text.NumberFormat

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tip=intent.getDoubleExtra("tip", 0.00)
        val formattedNumber=NumberFormat.getCurrencyInstance().format(tip)
        tipResult.text=getString(R.string.tip_amount,formattedNumber)
    }
}