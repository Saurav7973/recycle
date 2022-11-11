package com.example.rv1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val songObjects: ArrayList<Song> = ArrayList<Song>()
//        val songObjects:MutableList<Song> = mutableListOf<Song>()
        songObjects.add(Song("ABC","Just a demo"))
        songObjects.add(Song("ABCD","Just a demo"))
        songObjects.add(Song("ABCDE","Just a demo"))
        songObjects.add(Song("ABCDEF","Just a demo"))
        songObjects.add(Song("ABCDEFG","Just a demo"))
        songObjects.add(Song("ABCDEFGH","Just a demo"))
        songObjects.add(Song("ABCDEFGHI","Just a demo"))
        songObjects.add(Song("ABCDEFGHIJ","Just a demo"))
        songObjects.add(Song("ABCDEFGHIJK","Just a demo"))
        val RecycleList=findViewById<RecyclerView>(R.id.recycleList)
//        recycleList.adapter=AdapterClass(songObjects)
//        recycleList.layoutManager=LinearLayoutManager(this)
        RecycleList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = AdapterClass(songObjects)

        }
    }
}