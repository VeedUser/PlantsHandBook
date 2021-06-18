package veed.sm.plantshandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import veed.sm.plantshandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val adapter = PlantAdapter()
    private val imageIdList = listOf(
        R.drawable.plant1,
        R.drawable.plant2,
        R.drawable.plant3,
        R.drawable.plant4,
        R.drawable.plant5,
        R.drawable.plant6,
        R.drawable.plant7,
        R.drawable.plant8,
        R.drawable.plant9,
        R.drawable.plant10,
        R.drawable.plant11,
        R.drawable.plant12,
        R.drawable.plant13,
    )
    private var index = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }
    private fun init(){
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity,3)
            rcView.adapter = adapter
            addButton.setOnClickListener {
                if(index > 12 ) index = 0
                val plant = Plant(imageIdList[index],"Plant $index")
                adapter.addPlant(plant)
                index++
            }
        }
    }
}