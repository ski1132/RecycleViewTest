package org.kmutnb.testapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CommentModel(
    var src: String? ,
    var comment : String = "",
    var rating : Int
) : Parcelable