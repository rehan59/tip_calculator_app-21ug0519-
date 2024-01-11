package com.example.tipcalculator


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipcalculator.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        binding.calculateButton.setOnClickListener {calculateTip()}
    }


    private fun calculateTip() {
        val cost = binding.costOfService.text.toString().toDouble()
        val tipPercentage = when (binding.tipOptions.checkedRadioButtonId) {
            R.id.button1 -> 0.1
            R.id.button2 -> 0.07
            else -> 0.05
        }
        var tip = cost * tipPercentage
        val roundUp = binding.roundTip.isChecked
        if (roundUp) {
            tip = kotlin.math.ceil(tip)
            }
            binding.tipResult.text = tip.toString()

        }
    }















        