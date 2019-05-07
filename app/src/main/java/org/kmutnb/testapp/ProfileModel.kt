package org.kmutnb.testapp

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProfileModel(
    var name: String? ,
    var src : String = ""
) : Parcelable