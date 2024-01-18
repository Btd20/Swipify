package com.example.swipify

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class SwipifyDatabase(context: Context?) : SQLiteOpenHelper(context, "Swipify.db", null, 1) {

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL("CREATE TABLE usuarios (id INTEGER PRIMARY KEY AUTOINCREMENT, usuario TEXT UNIQUE, correo_electronico TEXT, contrasenya TEXT)")

        db.execSQL("CREATE TABLE canciones (id INTEGER PRIMARY KEY AUTOINCREMENT, titulo TEXT, artista TEXT, album TEXT, genero TEXT, duracion INTEGER)")

        db.execSQL("CREATE TABLE likes (id INTEGER PRIMARY KEY AUTOINCREMENT, usuario_id INTEGER, cancion_id INTEGER)")

        db.execSQL("CREATE TABLE playlists (id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT UNIQUE, usuario_id INTEGER, canciones TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        // Implement database
    }
}
