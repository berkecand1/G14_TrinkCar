package com.example.ise308.ozkan.ezgi.g14_trinkcar
import kotlinx.android.synthetic.main.activity_main.*

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.car_new_page.*
import android.view.Menu

class NewCarPage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.car_new_page)



        //user can add a new car for tap done button
        val btnOk = findViewById(R.id.done) as Button





        btnOk.setOnClickListener() {

            var newCar = Car()

            newCar.brandName = brandName.text.toString()
            newCar.modelName = modelName.text.toString()

            newCar.price = price.text.toString().toDouble()

            newCar.fuelType = fuelType.text.toString()
            newCar.gearType = gearType.text.toString()
            newCar.km = kilometer.text.toString().toDouble()


            print(newCar.brandName)

            newCar.createNewNote()

        }





    }
}