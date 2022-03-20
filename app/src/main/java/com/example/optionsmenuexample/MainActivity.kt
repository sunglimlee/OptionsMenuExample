package com.example.optionsmenuexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
        inflater.inflate(R.menu.example_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item1 ->  {Toast.makeText(this, "item1", Toast.LENGTH_SHORT).show()
                return true}
            R.id.item2 ->{Toast.makeText(this, "item2", Toast.LENGTH_SHORT).show()
                return true}
            R.id.item3 -> {Toast.makeText(this, "item3", Toast.LENGTH_SHORT).show()
                return  true}
            R.id.Subitem1 -> {Toast.makeText(this, "Subitem1", Toast.LENGTH_SHORT).show()
                return true}
            R.id.Subitem2 -> {Toast.makeText(this, "Subitem2", Toast.LENGTH_SHORT).show()
                return true}
            else -> return super.onOptionsItemSelected(item)

        }
    }
}