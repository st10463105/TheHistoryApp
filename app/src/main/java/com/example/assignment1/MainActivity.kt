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
        23 -> "Solomon Mahlangu"
        31 -> "Steve Biko"
        43 -> "Victoria Mxenge"
        51 -> "Chris Hani"
        57 -> "Ruth First"
        69 -> "Joe Slovo"
        76 -> "Oliver Tambo"
        82 -> "Winnie Madikizela"
        90 -> "Desmond Tutu"
        95 -> "Nelson Mandela"
        else -> "The age is an invalid format."
    }
}
}