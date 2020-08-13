package com.hoony.dagger2simpleexample3.chaper5

import dagger.Subcomponent

@MagicScope
@Subcomponent
interface MagicBox {
    fun poke(storage: Storage)
}