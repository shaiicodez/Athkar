package com.example.athkar.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.athkar.R
import com.example.athkar.model.Athkar

class ItemAdapter(
    private val context: Context,
    private val dataset : List<Athkar>
    ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    // adapter helper
    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    // 3 function
    // تعرف ملف ال layout الخاص بالعنصر
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int
    ): ItemViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.athkar_item_layout, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    // تربط البيانات بالقالب الخاص بها بمساعدة ViewHolder
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text =  context.resources.getString(item.thikrStringId)
    }

    // تعرف عدد البيانات في القائمة
    override fun getItemCount() = dataset.size

}