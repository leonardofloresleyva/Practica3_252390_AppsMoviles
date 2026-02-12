package mx.itson.edu.practica3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)

        /* ------------ Practice code begins from here --------------------*/

        // We get the "sign in" button
        val buttonSignIn: Button = findViewById(R.id.btn_sign_in)
        // We add a click listener to the button
        buttonSignIn.setOnClickListener {
            val intent: Intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
        }

        /* --------------- Practice code ends here ------------------------*/

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}