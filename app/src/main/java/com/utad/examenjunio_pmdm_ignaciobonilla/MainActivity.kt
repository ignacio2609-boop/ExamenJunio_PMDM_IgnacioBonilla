package com.utad.examenjunio_pmdm_ignaciobonilla

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.activity.viewModels
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.utad.examenjunio_pmdm_ignaciobonilla.adapter.ItemAdapter
import com.utad.examenjunio_pmdm_ignaciobonilla.databinding.ActivityMainBinding
import com.utad.examenjunio_pmdm_ignaciobonilla.model.DatosReceta
import com.utad.examenjunio_pmdm_ignaciobonilla.viewmodel.ItemViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var listaActiva = "all"
    private val viewModel: ItemViewModel by viewModels()
    private lateinit var adapter: ItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.root) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.rvCategories.layoutManager = LinearLayoutManager(this)
        adapter = ItemAdapter(mutableListOf()) { item ->
            onItemSelected(item)
        }
        binding.rvCategories.adapter = adapter
        cargarItems()
    }

    private fun cargarItems() {
        when(listaActiva){
            "all" -> {
                viewModel.items.observe(this) { itemList ->
                    if (itemList.isNotEmpty()){
                        adapter.updateData(itemList)
                    } else {
                        Toast.makeText(this, "Error al cargar los datos", Toast.LENGTH_SHORT).show()
                        listaVacia(itemList)
                    }
                }
                this.setTitle("All")
            }

//            "easy" -> {
//                viewModel.items2.observe(this) { itemList ->
//                    if (itemList.isNotEmpty()){
//                        adapter.updateData(itemList)
//                    } else {
//                        Toast.makeText(this, "Error al cargar los datos", Toast.LENGTH_SHORT).show()
//                        listaVacia(itemList)
//                    }
//                }
//                this.setTitle("Item 2")
//            }
        }
    }

    private fun listaVacia(itemList: List<DatosReceta>) {
        if (itemList.isEmpty()) {
            binding.tvEmpty.visibility = View.VISIBLE
        } else {
            binding.tvEmpty.visibility = View.GONE
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_item1-> listaActiva= "all"
            R.id.menu_item2-> listaActiva= "easy"
            R.id.menu_item3-> listaActiva= "medium"
        }
        cargarItems()
        return true
    }

    private fun onItemSelected(item: DatosReceta){
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("item", item)
        this.startActivity(intent)
    }
}