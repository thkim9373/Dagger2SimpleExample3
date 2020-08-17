package com.hoony.dagger2simpleexample3.chapter4

import javax.inject.Inject

class Storage {
    @Inject
    lateinit var uniqueMagic: UniqueMagic
    @Inject
    lateinit var normalMagic: NormalMagic
}