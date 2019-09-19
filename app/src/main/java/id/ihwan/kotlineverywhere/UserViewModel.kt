package id.ihwan.kotlineverywhere

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel: ViewModel() {

    private val _user = MutableLiveData<User>()

    val user: LiveData<User> get() = _user

    fun setData(user: User){
        _user.postValue(user)
    }
}