package ml.vladmikh.projects.find_pairs_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ml.vladmikh.projects.find_pairs_game.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}