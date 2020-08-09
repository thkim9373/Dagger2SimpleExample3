package com.hoony.dagger2simpleexample3.chaper5

import dagger.Component

@MagicScope
@Component
interface MagicBox {
    fun poke(storage: Storage)
}