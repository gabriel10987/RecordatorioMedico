package com.miempresa.pulsecare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var dataList: ArrayList<DataClass>
    lateinit var imageList: Array<Int>
    lateinit var titleList: Array<String>
    lateinit var subTitleList: Array<String>
    lateinit var descriptionList: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonAgregarRecordatorio: ImageButton = findViewById(R.id.btn_add_reminder)
        botonAgregarRecordatorio.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val botonVincularDispositivo: Button = findViewById(R.id.btn_link_device)
        botonVincularDispositivo.setOnClickListener {
            val intent = Intent(this, DeviceActivity::class.java)
            startActivity(intent)
        }


        titleList = arrayOf(
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m.",
            "8:00 a.m."
        )

        subTitleList = arrayOf(
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g",
            "Parecetamol 100g"
        )

        descriptionList = arrayOf(
            "Tomar cada después de cada comida",
            "Tomar dos veces al día",
            "Medicamento de color azul",
            "Tomar cada después de cada comida. Cada 8 horas",
            "Tomar dos veces al día",
            "Medicamento de color azul. Debe tomarlo 10 minutos antes de cada comida para una" +
                    "correta digestión",
            "Tomar cada después de cada comida",
            "Tomar dos veces al día",
            "Medicamento de color azul"
        )

        imageList = arrayOf(
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar,
            R.drawable.eliminar
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        dataList = arrayListOf<DataClass>()
        getData()
    }

    private fun getData(){
        for (i in imageList.indices) {
            val dataClass = DataClass(titleList[i], subTitleList[i], descriptionList[i], imageList[i])
            dataList.add(dataClass)
        }
        recyclerView.adapter = AdapterClass(dataList)
    }
}