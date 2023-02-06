package com.example.meuprimeiroprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvResult = findViewById<TextView>(R.id.textview_result)
        val tvClassificacao = findViewById<TextView>(R.id.textview_classificacao)
        val tvnome = findViewById<TextView>(R.id.textview_nome)


        val result = intent.getFloatExtra("EXTRA_RESULT", 0.1f)
        val nome = intent.getStringExtra("EXTRA_NOME")

        tvResult.text = result.toString()
        tvnome.text = nome.toString()


        var classificacao = "Sua Classificação é "
        if (result < 18.5f) {
            classificacao += "ABAIXO DO PESO                " + "Procure um nutricionista!"
        } else if (result >= 18.5f && result < 25f) {
            classificacao += "NORMAL                               " + "Parabéns, siga assim!"
        } else if (result >= 25f && result < 30f) {
            classificacao += "ACIMA DO PESO                       " +
                    "Cuidado com sua saúde!"
        } else if (result >= 30f && result < 40) {
            classificacao += "OBESIDADE I                         " +
                    "Melhor conversar com um profissional de saúde!"
        } else {
            classificacao = "OBESIDADE GRAVE                                            " +
                    "Procure com urgência um médico!"
        }

        tvClassificacao.text = classificacao

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        finish()
        return super.onOptionsItemSelected(item)


    }

}