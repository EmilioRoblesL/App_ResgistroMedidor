package cl.erobles.android.app_resgistromedidor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.Date

class viewModel: ViewModel(){
    fun onLoginChanged(it: String, fecha: Date){
    }

    //Pantalla FormUI
    private val _medidor = MutableLiveData<String>()
    val medidor: LiveData<String> = _medidor

    private val _fecha = MutableLiveData<Date>()
    val fecha: LiveData<Date> = _fecha
}