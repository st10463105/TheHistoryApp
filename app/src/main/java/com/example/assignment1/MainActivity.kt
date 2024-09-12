package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText: EditText = findViewById(R.id.editTextName)
        var generateButton: Button = findViewById(R.id.buttonGeneratehistory)
        var clearButton: Button = findViewById(R.id.buttonclear)
        var etextview: TextView = findViewById(R.id.textView)


// Set OnClickListener for Generate Button
// OnClick for Generate Button
        generateButton.setOnClickListener {
            val age = editText.text.toString().toIntOrNull()
            val result = if (age != null) {
                matchAgeToFamousPerson(age)
            } else {
                "Please enter a valid age."

            }
            etextview.text = result
        }


// OnClick for Clear Button
        clearButton.setOnClickListener {
            editText.text.clear()
            etextview.text = ""
        }
    }


// Function to match age to a famous person
private fun matchAgeToFamousPerson(age: Int): String {
    return when (age) {
        23 -> "Solomon Mahlangu, Anti-apartheid freedom fighter"
        31 -> "Steve Biko, He was apartheid activist and leader of the Black Consciousness Movement"
        43 -> "Victoria Mxenge, apartheid activist and lawyer, assassinated at age 43"
        51 -> "Chris Hani, He leader of the South African Communist Party"
        57 -> "Ruth First Anti-apartheid activist and scholar"
        69 -> "Joe Slovo, apartheid activist and leader of the South African Communist Party"
        76 -> "Oliver Tambo Anti-apartheid politician and a central figure in the African ANC"
        82 -> "Winnie Madikizela, Anti-apartheid activist and politician"
        90 -> "Desmond Tutu, Archbishop and social rights activist"
        95 -> "Nelson Mandela, Anti-apartheid revolutionary and former President of South Africa"
        else -> "The age is an invalid format."
    }
}
}