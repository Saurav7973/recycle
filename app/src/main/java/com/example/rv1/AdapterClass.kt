package com.example.rv1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(val song:List<Song>):RecyclerView.Adapter<AdapterClass.Holder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.layout_recycle,parent,false)
        return Holder(view)

   }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.title.text=song[position].title
        holder.description.text=song[position].description

    }

    override fun getItemCount(): Int {
        return song.size
    }

    class Holder(itemView:View): RecyclerView.ViewHolder(itemView) {
        val title=itemView.findViewById<TextView>(R.id.txtTitle)
        val description=itemView.findViewById<TextView>(R.id.txtDescription)
    }
}
