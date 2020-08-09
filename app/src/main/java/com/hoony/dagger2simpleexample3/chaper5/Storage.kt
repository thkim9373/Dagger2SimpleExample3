package com.hoony.dagger2simpleexample3.chaper5

import javax.inject.Inject

class Storage {
    @Inject
    lateinit var uniqueMagic: UniqueMagic

    @Inject
    lateinit var normalMagic: NormalMagic
}