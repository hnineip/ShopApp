package com.hnineiphyu.shopapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.hnineiphyu.shopapp.R
import com.hnineiphyu.shopapp.model.LatestModel

class LatestViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
    var firstName = itemView.findViewById<TextView>(R.id.name_one_arrival)
    var secondName = itemView.findViewById<TextView>(R.id.name_two_arrival)
    var brand = itemView.findViewById<TextView>(R.id.quality_arrival)
    var rate = itemView.findViewById<RatingBar>(R.id.rate_bar)
    var price = itemView.findViewById<TextView>(R.id.price_arrival)
    var image = itemView.findViewById<ImageView>(R.id.image_arrival)
    var strikes = itemView.findViewById<TextView>(R.id.strikes)

}

class LatestArrivalAdapter (var latestList: ArrayList<LatestModel>):RecyclerView.Adapter<LatestViewHolder>(){
    override fun onBindViewHolder(holder: LatestViewHolder, position: Int) {
        holder.firstName.text = latestList[position].firstName
        holder.secondName.text = latestList[position].secondName
        holder.brand.text = latestList[position].brand
        holder.rate.rating = latestList[position].rating.toFloat()
        holder.price.text = latestList[position].price.toString()
        holder.image.setImageResource(latestList[position].image)
        holder.strikes.text = latestList[position].strikes
    }

    override fun getItemCount(): Int {
        return latestList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LatestViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latest,parent,false)
        return LatestViewHolder(view)
    }

}
