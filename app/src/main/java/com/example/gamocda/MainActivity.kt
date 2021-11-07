package com.example.gamocda

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var name:EditText
    private lateinit var surname:EditText
    private lateinit var phone:EditText
    private lateinit var pIRADINOMERI:EditText
    private lateinit var checkbox1:CheckBox
    private lateinit var register:Button

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        name = findViewById(R.id.FirstName)
        surname = findViewById(R.id.SecondNamee)
        phone = findViewById(R.id.Phone)
        pIRADINOMERI = findViewById(R.id.Piradinomeri)
        checkbox1 = findViewById(R.id.checkBox)
        register = findViewById(R.id.RegistrationButton)


        register.setOnClickListener {

            val firstName = name.text.toString().trim()
            val lastname = surname.text.toString().trim()
            val pHone = phone.text.toString().trim()
            val piradiNomeri = pIRADINOMERI.text.toString().trim()
            val checkbox = checkbox1

            if (firstName.isEmpty()) {
                name.error = "შეიყვანეთ სახელი"
                return@setOnClickListener
            } else if (firstName.length <= 3) {
                name.error = "შეიყვანეთ მინიმუმ 3 სიმბოლო"
                return@setOnClickListener
            } else if (lastname.isEmpty()) {
                surname.error = "შეიყვანეთ გვარი"
                return@setOnClickListener
            } else if (lastname.length <= 5) {
                surname.error = "შეიყვანეთ მინიმუმ 5 სიმბოლო"
                return@setOnClickListener
            } else if (pHone.isEmpty()) {
                phone.error = "შეიყვანეთ ტელეფონის ნომერი"
                return@setOnClickListener
            } else if (pHone.isEmpty()) {
                phone.error = "შეამოწმეთ ტელეფონის ნომერი"
                return@setOnClickListener
            }else if (pHone.length <= 8) {
                phone.error = "ტელეფონის ნომერი უნდა შედგებოდეს 9 სიმბოლოსგან"
            }else if (pHone.startsWith("5") ) {
                phone.error = "ტელეფონის ნომერი უნდა იწყებოდეს 5-ით"
            } else if (piradiNomeri.isEmpty()) {
                pIRADINOMERI.error = "შეიყვანეთ პირადი ნომერი"
                return@setOnClickListener
            }else if (piradiNomeri.length <= 10) {
                pIRADINOMERI.error = "პირადი ნომერი უნდა შედგებოდეს 11 სიმბოლოსგან"
            } else if (!checkbox.isChecked) {
                Toast.makeText(this, "გთხოვთ დაეთანხმეთ წესებსა და პირობებს", Toast.LENGTH_LONG)
                    .show()




            }else {
                Toast.makeText(this, "რეგისტრაცია წარმატებით დასრულდა", Toast.LENGTH_SHORT).show()

            }


        }




    }

}


















