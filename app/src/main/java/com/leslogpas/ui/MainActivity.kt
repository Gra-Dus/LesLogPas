package com.leslogpas.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.databinding.DataBindingUtil
import com.leslogpas.R
import com.leslogpas.databinding.ActivityMainBinding
import com.leslogpas.viewmodels.PersonViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var mainViewModel = PersonViewModel()
var s:Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = mainViewModel
        binding.executePendingBindings()
        btn_signIn.setOnClickListener{ for(i in mainViewModel.persons.indices){
            if(mainViewModel.persons[i].loginPerson == et_login.text.toString() && mainViewModel.persons[i].passwordPerson == et_password.text.toString())

                mainViewModel.text = "Welcome @" + mainViewModel.persons[i].namePerson
            binding.viewModel = mainViewModel
            binding.executePendingBindings()
        }
        }
//        val person = Person(1,"Gary","nnn","nnn")
//        btn_signIn.setOnClickListener{
//        if(et_login.text.toString()== person.loginPerson && et_password.text.toString() == person.passwordPerson){
//            with(tv_welcome){
//                text = "Welcome"+ person.namePerson
//                visibility = View.VISIBLE
//            }
//        }else{
//           with(tv_welcome){
//               text = "Ne welcome"
//            visibility = View.VISIBLE
//           }
//        }
//        }

    }
}
