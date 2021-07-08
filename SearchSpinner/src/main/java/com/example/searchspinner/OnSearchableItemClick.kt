package com.example.searchspinner

import java.io.Serializable

interface OnSearchableItemClick<T>: Serializable{
    fun onSearchableItemClicked(item: T?, position: Int)
}