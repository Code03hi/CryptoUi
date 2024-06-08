package cryptocurrency.Activity

import android.content.Intent
import android.icu.lang.UCharacter.GraphemeClusterBreak.L
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sam.cryptocurrency.R
import com.sam.cryptocurrency.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding.apply {
            var username:EditText = user
            var password:EditText = password

            loginBtn.setOnClickListener{
                if (username.text.toString().isEmpty() || password.text.toString().isEmpty()){
                    Toast.makeText(this@LoginActivity,"Please fill the form",Toast.LENGTH_SHORT).show()
                }else if (username.text.toString() == "admin" && password.text.toString() == "admin"){
                    val intent = Intent(this@LoginActivity,MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }

        setContentView(binding.root)
    }
}