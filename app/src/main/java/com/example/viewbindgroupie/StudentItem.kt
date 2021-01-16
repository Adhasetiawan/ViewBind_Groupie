package com.example.viewbindgroupie

import android.view.View
import com.example.viewbindgroupie.databinding.ItemStudentDataBinding
import com.xwray.groupie.viewbinding.BindableItem

class StudentItem(val mahasiswa: DataDummy): BindableItem<ItemStudentDataBinding>() {
    override fun bind(viewBinding: ItemStudentDataBinding, position: Int) {
        viewBinding.txtstudentname.text = mahasiswa.nama
        viewBinding.txtsidname.text = mahasiswa.nim.toString()
    }

    override fun getLayout(): Int {
        return R.layout.item_student_data
    }

    override fun initializeViewBinding(view: View): ItemStudentDataBinding {
        return ItemStudentDataBinding.bind(view)
    }
}