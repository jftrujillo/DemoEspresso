package com.example.jhonfredytrujilloortega.demotesting.util

import android.support.annotation.LayoutRes
import android.support.design.widget.TextInputLayout
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by jhonfredytrujilloortega on 10/20/17.
 */
fun ViewGroup.inflate(@LayoutRes layout: Int) = LayoutInflater.from(context).inflate(layout, this, false)

fun TextInputLayout.sText(): String = editText?.text.toString()