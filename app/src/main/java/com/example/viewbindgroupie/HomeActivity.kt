package com.example.viewbindgroupie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.viewbindgroupie.databinding.ActivityHomeBinding
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class HomeActivity : AppCompatActivity() {

    private lateinit var mahasiswa : DataDummy.daftar
    private lateinit var binding: ActivityHomeBinding
    private var groupadapter : GroupAdapter<GroupieViewHolder> = GroupAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mahasiswa = DataDummy.daftar
        mahasiswa.listmahasiswa.forEach {
            groupadapter.add(StudentItem(it))
        }

        initrv()
    }

    private fun initrv(){
        binding.rvplacer.apply {
            layoutManager = LinearLayoutManager ( this@HomeActivity)
            adapter = groupadapter
        }
    }
}