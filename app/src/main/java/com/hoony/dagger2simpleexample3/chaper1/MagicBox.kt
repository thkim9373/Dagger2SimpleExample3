package com.hoony.dagger2simpleexample3.chaper1

import dagger.Component

@Component
interface MagicBox {
    fun poke(app: Chapter1Activity)
}