package com.example.tourism_app.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Destination(
    var name: String? = null,
    var location: String? = null,
    var description: String? = null,
    var rating: Double? = 0.0,
    var image: Int? = 0,
    var price: Int? = 0,
    var timeElapse: Int? = 0,
    var category: String? = null
) : Parcelable