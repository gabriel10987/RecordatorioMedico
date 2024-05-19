package com.miempresa.pulsecare

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterClass(private val dataList: ArrayList<DataClass>): RecyclerView.Adapter<AdapterClass.ViewHolderClass>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderClass {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderClass(itemView)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolderClass, position: Int) {
        val currentItem = dataList[position]
        holder.rvTitle.text = currentItem.dataTitle
        holder.rvSubTitle.text = currentItem.dataSubTitle
        holder.rvDescription.text = currentItem.dataDescription
        holder.rvImage.setImageResource(currentItem.dataImage)
    }

    class ViewHolderClass(itemView: View): RecyclerView.ViewHolder(itemView){
        val rvTitle:TextView = itemView.findViewById(R.id.title)
        val rvSubTitle:TextView = itemView.findViewById(R.id.subtitle)
        val rvDescription:TextView = itemView.findViewById(R.id.description)
        val rvImage:ImageView = itemView.findViewById(R.id.eliminar)
    }
}