
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.swipify.MainActivity
import com.example.swipify.R

class LoginActivity : AppCompatActivity() {
    private lateinit var swipifyDatabase: SwipifyDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        swipifyDatabase = SwipifyDatabase(this)

    }

    fun register(view: View) {
        setContentView(R.layout.register)
    }

    fun login(view: View) {
        val usernameEditText = findViewById<EditText>(R.id.username_edit_text)
        val passwordEditText = findViewById<EditText>(R.id.password_edit_text)
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        val isLoggedIn = swipifyDatabase.loginUser(username, password)

        if (isLoggedIn) {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        } else {
            Toast.makeText(this, "Nombre de usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
        }
    }

}
