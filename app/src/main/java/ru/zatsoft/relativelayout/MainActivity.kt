package ru.zatsoft.relativelayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.zatsoft.relativelayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val source = database()
        val spisok = loadBook(source.text)
        spisok.forEach { println(it) }
        binding.button.setOnClickListener {
            binding.textView.text = spisok.reduce { acc, c -> acc + c + "\n"  }
        }

    }

    private fun loadBook(text: String): List<String> {
      return text.split(" ")
          }
}