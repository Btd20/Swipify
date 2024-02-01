import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SwipifyDatabase(context: Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_NAME = "Swipify.db"
        const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        // Creación de tablas
        db.execSQL("CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, usuario TEXT UNIQUE, contrasenya TEXT)")
        db.execSQL("CREATE TABLE canciones (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, artista TEXT, album TEXT, genero TEXT, duracion INTEGER)")
        db.execSQL("CREATE TABLE likes (id INTEGER PRIMARY KEY AUTOINCREMENT, usuario_id INTEGER, cancion_id INTEGER)")
        db.execSQL("CREATE TABLE playlists (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT UNIQUE, usuario_id INTEGER, canciones TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }
    fun insertUsuario(username: String, password: String): Long {
        val db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("usuario", username)
        contentValues.put("contrasenya", password)
        return db.insert("usuarios", null, contentValues)
    }
    fun loginUser(username: String, password: String): Boolean {
        val db = this.readableDatabase
        val query = "SELECT * FROM usuarios WHERE usuario = ? AND contrasenya = ?"
        val cursor = db.rawQuery(query, arrayOf(username, password))

        val isLoggedIn = cursor.count > 0
        cursor.close()

        return isLoggedIn
    }
}
