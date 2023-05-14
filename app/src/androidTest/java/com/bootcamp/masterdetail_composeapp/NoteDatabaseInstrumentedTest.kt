package com.bootcamp.masterdetail_composeapp

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.bootcamp.masterdetail_composeapp.data.notes.NoteDao
import com.bootcamp.masterdetail_composeapp.data.notes.NoteDatabase
import com.bootcamp.masterdetail_composeapp.data.notes.NoteEntity
import junit.framework.TestCase.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
class SimpleEntityReadWriteTest {
    private lateinit var noteDao: NoteDao
    private lateinit var db: NoteDatabase

    @Before
    fun createDb() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(
            context, NoteDatabase::class.java).build()
        noteDao = db.noteDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        db.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeNoteAndReadAllNotes() {
        // Creamos una instancia NoteEntity
        val title = "Ida a Santiago"
        val noteEntity = NoteEntity(
            uid = 1,
            title = title,
            body = "Traerme el set de herramientas"
        )

        // Insertamos  la nota en la  base de datos
        noteDao.insert(noteEntity = noteEntity)

        // Leemos la base de datos de notas
        val notes = noteDao.getAll()

        // Borramos la nota de la base de datos de notas
        noteDao.delete(noteEntity = noteEntity)

        // Mostramos la lista de notas de la consulta por consola
        println(notes)

        //Probamos si el resultado es el esperado
        assertEquals(notes[0].title, title)
    }
}