package com.leslogpas

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btn_signIn.setOnClickListener{
        if(et_login.text.toString()=="adm" && et_password.text.toString() == "adm"){
            tv_welcome.text = "Welcome"
            tv_welcome.visibility = View.VISIBLE
            
        }else{
            tv_welcome.text = "TbI ne adm"
            tv_welcome.visibility = View.VISIBLE
        }
        }

    }
}