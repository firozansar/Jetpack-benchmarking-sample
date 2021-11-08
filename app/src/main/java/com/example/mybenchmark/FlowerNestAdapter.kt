package com.example.mybenchmark

import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.viewholder.BaseDataBindingHolder
import com.example.mybenchmark.databinding.ItemFlowerLayoutNestBinding

class FlowerNestAdapter :
    BaseQuickAdapter<FlowerItem, BaseDataBindingHolder<ItemFlowerLayoutNestBinding>>
        (R.layout.item_flower_layout_nest) {

    override fun convert(
        holder: BaseDataBindingHolder<ItemFlowerLayoutNestBinding>,
        item: FlowerItem
    ) {
        holder.dataBinding?.flowerItem = item
    }

}