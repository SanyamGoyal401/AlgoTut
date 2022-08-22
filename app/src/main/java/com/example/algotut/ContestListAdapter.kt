package com.example.algotut

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class ContestListAdapter(private val data: ArrayList<Contest>, val context: Context) : RecyclerView.Adapter<ContestListAdapter.ContestViewHolder>() {
    val currentPos : Int = 0
    class ContestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
       val contestName : TextView = itemView.findViewById(R.id.contestName)
       val startTime : TextView = itemView.findViewById(R.id.startTime)
       val endTime : TextView = itemView.findViewById(R.id.endTime)
        val contestImage : ImageView = itemView.findViewById(R.id.contestImage)
        val contestcolor : CardView = itemView.findViewById(R.id.card_view)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContestViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.codingcontest, parent, false)
        val viewHolder = ContestViewHolder(view)
        return viewHolder
    }
    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ContestViewHolder, position: Int) {

        holder.contestName.text = data[position].name
        holder.startTime.text = data[position].start_time
        holder.endTime.text = data[position].end_time
        when (data[position].site) {
            "CodeForces" -> holder.contestImage.setImageResource(R.drawable.codeforces_logo)
            "HackerEarth" -> holder.contestImage.setImageResource(R.drawable.hackerearth_logo)
            "TopCoder" -> holder.contestImage.setImageResource(R.drawable.topcoder)
            "LeetCode" -> holder.contestImage.setImageResource(R.drawable.leetcode_logo)
            "CodeChef" -> holder.contestImage.setImageResource(R.drawable.codechef_logo)
            "AtCoder" -> holder.contestImage.setImageResource(R.drawable.atcoder)
            else -> holder.contestImage.setImageResource(R.drawable.hackerrank_logo)
        }
        when (data[position].site) {
            "CodeForces" -> holder.contestcolor.setCardBackgroundColor(R.color.yellow)
            "HackerEarth" -> holder.contestcolor.setCardBackgroundColor(R.color.orange)
            "TopCoder" -> holder.contestcolor.setCardBackgroundColor(R.color.green)
            "LeetCode" -> holder.contestcolor.setCardBackgroundColor(R.color.lightblue)
            "CodeChef" -> holder.contestcolor.setCardBackgroundColor(R.color.lightpink)
            "AtCoder" -> holder.contestcolor.setCardBackgroundColor(R.color.green)
            else -> holder.contestcolor.setCardBackgroundColor(R.color.yellow)
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}