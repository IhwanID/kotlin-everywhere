package id.ihwan.kotlineverywhere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.ihwan.kotlineverywhere.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)

        val viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.setData(User("123", "Ihwan ID"))

        //if not use Data Binding
//        viewModel.user.observe(this, Observer {user ->
//            userName.text = user.name
//        })

        setContentView(binding.root)
    }
}
