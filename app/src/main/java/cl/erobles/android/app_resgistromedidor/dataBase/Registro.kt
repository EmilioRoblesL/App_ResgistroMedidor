package cl.erobles.android.app_resgistromedidor.dataBase

import androidx.room.Entity
import androidx.room.PrimaryKey

//Tabla Creación
@Entity
data class Registro(
    @PrimaryKey(autoGenerate = true) val id:Int =0,
    var medidor:Int,
    var fecha: String,
    var option:String
)