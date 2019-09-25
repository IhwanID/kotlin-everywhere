package id.ihwan.kotlineverywhere

import android.content.Context
import android.widget.Toast

open class EventHandler(context: Context)  {

    private val myContext = context

    fun onButtonClick() {
        Toast.makeText(myContext, "Hello " , Toast.LENGTH_SHORT).show()
    }
}