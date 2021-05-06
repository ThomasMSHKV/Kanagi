package ru.androidschool.intensiv

import android.widget.ImageView
import com.squareup.picasso.Picasso
import java.lang.StringBuilder
import java.security.CodeSource

fun setImage(source: String, target: ImageView){
    Picasso.get()
        .load(source)
        .into(target)
}

fun nameStringBuilder(name: List<String>):String{
    val sb = StringBuilder()

    for(n in name.indices){
        if (n != name.size - 1){
            sb.append("${name[n]}, ")
        }else sb.append(name[n])
    }
    return sb.toString()
}