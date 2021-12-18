package android.example.tipcalculator

import android.example.tipcalculator.databinding.ActivityMainBinding
import android.example.tipcalculator.databinding.ActivityResultBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*
import java.text.NumberFormat

class ResultActivity : AppCompatActivity() {
    lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tip= intent.getStringExtra("tip")?.toDoubleOrNull()
        binding=ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val formatedTip= NumberFormat.getCurrencyInstance().format(tip)
        binding.tipResult.text=getString(R.string.tip_amount,formatedTip)

    }
}