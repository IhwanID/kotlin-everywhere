package id.ihwan.kotlineverywhere

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.api.load

@BindingAdapter("loadImage")
fun loadImage(view: ImageView, url: String){
    view.load(url)
}