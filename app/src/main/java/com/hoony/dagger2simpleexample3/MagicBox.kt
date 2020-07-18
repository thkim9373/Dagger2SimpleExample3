package com.hoony.dagger2simpleexample3

import dagger.Component

@Component
interface MagicBox {
    fun poke(app: MainActivity)
}