package cryptocurrency.Activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.sam.cryptocurrency.R
import com.sam.cryptocurrency.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityIntroBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding.apply {
            go.setOnClickListener {
                val intent = Intent(this@IntroActivity,LoginActivity::class.java)
                startActivity(intent)
            }
        }

        setContentView(binding.root)
    }
}