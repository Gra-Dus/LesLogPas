package com.leslogpas.viewmodels

import androidx.lifecycle.ViewModel
import com.leslogpas.repository.PersonRepository.getPersones

class PersonViewModel : ViewModel() {
     var persons = getPersones()
     var text:String = ""
}