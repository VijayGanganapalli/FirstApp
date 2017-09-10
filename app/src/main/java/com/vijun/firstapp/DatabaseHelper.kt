package com.vijun.firstapp

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

/**
 * Created by Vijay on 09/10/2017.
 */
class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, FACTORY, VERSION) {

    companion object {
        internal val DATABASE_NAME = "Student.db"
        internal val TABLE_NAME = "student_table"
        internal val FACTORY = null
        internal val VERSION = 1
        internal val COL_1 = "ID"
        internal val COL_2 = "NAME"
        internal val COL_3 = "SURNAME"
        internal val COL_4 = "MARKS"
    }

    fun insertValues(name: String, surname: String, marks: Int){
        val db: SQLiteDatabase = writableDatabase
        val values:ContentValues
        values = ContentValues()
        values.put("name", name)

        db.insert("student.db", null, values)
    }

    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("create table $TABLE_NAME (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT,SURNAME TEXT,MARKS INTEGER)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXITS "+TABLE_NAME)
        onCreate(db)
    }
}