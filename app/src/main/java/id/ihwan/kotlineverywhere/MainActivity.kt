package id.ihwan.kotlineverywhere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import id.ihwan.kotlineverywhere.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val viewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)

        binding.viewModel = viewModel
        binding.handler = EventHandler(this)
        binding.lifecycleOwner = this
        viewModel.setData(User("123", binding.etName.text.toString()))

        //if not use Data Binding
//        viewModel.user.observe(this, Observer {user ->
//            userName.text = user.name
//        })

    }
}
