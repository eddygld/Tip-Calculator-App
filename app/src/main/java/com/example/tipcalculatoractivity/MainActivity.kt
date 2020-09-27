package com.example.tipcalculatoractivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calcButton.setOnClickListener { handleOnClick() }
    }

    private fun handleOnClick() {
        try {
            val enteredText = answerText.editableText.toString()

            val tipType = when(tipGroup.checkedRadioButtonId) {
                R.id.tenButton -> TipType.TENPERCENT
                R.id.twentyButton -> TipType.TWENTYPERCENT
                R.id.thirtyButton -> TipType.THIRTYPERCENT
                else -> throw Exception()
            }

            val enteredValue = enteredText.toFloat()

            val result = calculateTip(enteredValue, tipType)

            val total = result + enteredValue

            val resultText = "Your calculated tip is ${result.toString()} and your total is ${total.toString()}"

            result_tv.text = resultText


        } catch (e:Exception) {
            result_tv.text = resources.getString(R.string.error_string)

        }




    }
}