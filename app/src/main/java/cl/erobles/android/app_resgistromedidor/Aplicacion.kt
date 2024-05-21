package cl.erobles.android.app_resgistromedidor

import android.app.Application
import androidx.room.Room
import cl.erobles.android.app_resgistromedidor.dataBase.BaseDatos

class Aplicacion : Application() {

    val db by lazy { Room.databaseBuilder(this, BaseDatos::class.java, "serviciosbasicos.db").build() }
    val registroDao by lazy { db.RegistroDao() }
}