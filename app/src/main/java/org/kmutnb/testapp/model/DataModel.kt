package org.kmutnb.testapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DataModel(
    val shopName: String = "",
    val address: String = "",
    val profileModel: ProfileModel = ProfileModel("", "")
) : Parcelable