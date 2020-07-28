package com.hoony.dagger2simpleexample3

import com.hoony.dagger2simpleexample3.chaper4.Bag
import com.hoony.dagger2simpleexample3.chaper4.Info

class TestBag : Bag() {
    override fun sayLoveDagger2(): Info = Info("Test Love")
}