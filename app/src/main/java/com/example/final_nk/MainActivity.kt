package com.example.final_nk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.name)
        val surname = findViewById<EditText>(R.id.surname)
        val eMail = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val button = findViewById<Button>(R.id.button)


        button.setOnClickListener {
            if (name.text.length > 2
                && surname.text.length > 4
                && eMail.text.contains("@")
                && eMail.text.contains(".")
                && password.text.length > 7
                && checkBox.isChecked
            ) {
                Toast.makeText(
                    this,
                    "გილოცავთ, თქვენ წარმატებით დარეგისტრირდით!",
                    Toast.LENGTH_SHORT
                ).show()
            } else if (name.text.isEmpty()
                || surname.text.isEmpty()
                || eMail.text.isEmpty()
                || password.text.isEmpty()
            ) {

                Toast.makeText(
                    this,
                    "გთხოვთ ბოლომდე შეავსეთ ველები!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (name.text.length < 3) {

                Toast.makeText(
                    this,
                    "სახელის ველში უნდა შეიყვანოთ მინიმუმ 3 სიმბოლო!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (surname.text.length < 5) {

                Toast.makeText(
                    this,
                    "გვარის ველში უნდა შეიყვანოთ მინიმუმ 5 სიმბოლო!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (!eMail.text.contains("@") || !eMail.text.contains(".")) {

                Toast.makeText(
                    this,
                    "მეილის ველი უნდა შეიცავდეს '.'-ს და '@'-ს! ",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (password.text.length < 8) {

                Toast.makeText(
                    this,
                    "პაროლის ველში უნდა შეიყვანოთ მინიმუმ 8 სიმბოლო!",
                    Toast.LENGTH_SHORT
                ).show()

            } else if (!checkBox.isChecked) {

                Toast.makeText(
                    this,
                    "გთხოვთ დაეთანხმოთ წესებსა და პირობებს!",
                    Toast.LENGTH_SHORT
                )
                    .show()

            }
        }
    }
}