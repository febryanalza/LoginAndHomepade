package com.example.loginonly

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loginonly.databinding.LoginPageBinding
import com.example.loginonly.ui.theme.LoginOnlyTheme

class MainActivity : ComponentActivity() {
    private lateinit var binding: LoginPageBinding

    private lateinit var username: EditText
    private lateinit var password: EditText
    lateinit var loginButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener(View.OnClickListener {
            if(binding.username.text.toString() == "user" && binding.password.text.toString() == "admin1234"){
                Toast.makeText(this, "login succes", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "login gagal", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
