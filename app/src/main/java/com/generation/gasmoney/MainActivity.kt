package com.generation.gasmoney

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.generation.gasmoney.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private var gasolina: Double = 0.0
    private var alcool: Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btCalcular()

    }

    private fun btCalcular() {
        binding.buttonCalcular.setOnClickListener {
            showResult()
        }
    }

    private fun showResult() {

        val alcool = binding.inputAlcool.text.toString().toDouble()
        val gasolina = binding.inputGasolina.text.toString().toDouble()

        val resultado: Double = alcool / gasolina


        if (resultado >= 0.7){
            binding.resultado.text = String.format("GASOLINA")
        }
        else{
            binding.resultado.text = String.format("ÁLCOOL")
            binding.bgResult.setBackgroundResource(R.drawable.background_gasolina)
        }

    }
}