package com.example.recyclerview_homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_sign_up.*

class sign_up : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        auth = FirebaseAuth.getInstance()

        btn_signup.setOnClickListener {
            if(edit_id.text.toString()==null || edit_password.text.toString()==null){
                Toast.makeText(this,"이메일과 비밀번호를 기입해주세요",Toast.LENGTH_SHORT).show()
            }
            else {
                auth.createUserWithEmailAndPassword(
                    edit_id.text.toString(),
                    edit_password.text.toString()
                )
                    .addOnCompleteListener(this) { task ->
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information

                            val user = auth.currentUser

                        } else {

                        }

                        // ...
                    }
            }


        }









    }
}