package com.example.athkar.data

import com.example.athkar.R
import com.example.athkar.model.Athkar

class Datasource {
    fun loadAthkar() : List<Athkar> {
        return listOf(
            Athkar(R.string.athkar1),
            Athkar(R.string.athkar2),
            Athkar(R.string.athkar3),
            Athkar(R.string.athkar4),
            Athkar(R.string.athkar5),
            Athkar(R.string.athkar6)
        )
    }
}