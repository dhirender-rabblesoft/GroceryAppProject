package com.example.groceryappproject.common

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KClass

open class BaseActivity:AppCompatActivity() {
//    //snakeBar
//    val gson = Gson()
//    val serviceViewModel = ServiceViewModel()
    fun openA(kClass: KClass<out AppCompatActivity>, bundle: Bundle? = Bundle()) {
        val intent = Intent(this, kClass.java)
        intent.putExtras(bundle ?: Bundle())
        this.startActivity(intent)
/*
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            activity.startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(activity).toBundle())
        } else {
            activity.startActivity(intent)
        }
*/

    }
}