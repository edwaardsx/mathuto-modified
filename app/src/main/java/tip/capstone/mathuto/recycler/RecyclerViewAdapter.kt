package tip.capstone.mathuto.recycler

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import tip.capstone.mathuto.MainActivity.Companion.COMPLETED
import tip.capstone.mathuto.MainActivity.Companion.IN_PROGRESS
import tip.capstone.mathuto.R

class RecyclerViewAdapter(private val dataList: List<Data>,
                          private var itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    private var filteredList: List<Data> = dataList

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.image)
        val title: TextView = itemView.findViewById(R.id.title)
        val lesson: TextView = itemView.findViewById(R.id.lesson)
        val status: ImageView = itemView.findViewById(R.id.status)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_main_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = filteredList[position]
        holder.image.setImageResource(data.image)
        holder.title.text = data.title
        holder.lesson.text = data.lesson
        holder.status.setImageResource(data.status)

        when (data.status) {
            IN_PROGRESS -> {
                holder.status.setImageResource(R.drawable.ic_unlock)
            }
            COMPLETED -> {
                holder.status.setImageResource(R.drawable.ic_done)
            }
            else -> {
                holder.status.setImageResource(R.drawable.ic_lock)
            }
        }

        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(data)
        }
        val animation = AnimationUtils.loadAnimation(holder.itemView.context, R.anim.item_animation_fall_down)
        holder.itemView.startAnimation(animation)
    }

    override fun getItemCount(): Int {
        return filteredList.size
    }

    interface OnItemClickListener {
        fun onItemClick(data: Data)
    }

    @SuppressLint("NotifyDataSetChanged")
    fun filter(query: String) {
        filteredList = if (query.isEmpty()) {
            dataList
        } else {
            dataList.filter { data ->
                data.title.contains(query, true) || data.lesson.contains(query, true)
            }
        }
        notifyDataSetChanged()
    }
}

data class Data(val image: Int, val title: String, val lesson: String, val status: Int)