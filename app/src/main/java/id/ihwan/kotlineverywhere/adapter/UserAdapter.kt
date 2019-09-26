package id.ihwan.kotlineverywhere.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ihwan.kotlineverywhere.User
import id.ihwan.kotlineverywhere.databinding.ListItemUserBinding

class UserAdapter : RecyclerView.Adapter<UserAdapter.ViewHolder>() {

    var users: List<User> = emptyList()

    fun setData(users: List<User>){
        this.users = users
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ListItemUserBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
    }

    class ViewHolder(private val binding: ListItemUserBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(user: User){
            binding.apply {
                model = user
                executePendingBindings()
            }
        }
    }
}