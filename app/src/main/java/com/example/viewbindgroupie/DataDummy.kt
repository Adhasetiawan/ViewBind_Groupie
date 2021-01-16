package com.example.viewbindgroupie

data class DataDummy (var nim: Int, var nama: String){

    object daftar{
        val listmahasiswa = listOf<DataDummy>(
            DataDummy(10161001, "adha setiawan"),
            DataDummy(10161002, "raden wahyu"),
            DataDummy(10161003, "dipo rifky"),
            DataDummy(10161004, "bayu dwi"),
            DataDummy(10161005, "dodi rahman")
        )
    }
}