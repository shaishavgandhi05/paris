package com.airbnb.paris.proxies

import android.view.View
import com.airbnb.paris.Proxy

abstract class BaseProxy<out P : Proxy<P, V>, out V : View>(override val view: V) : Proxy<P, V> {
    @Suppress("UNCHECKED_CAST")
    override val proxy get() = this as P
}