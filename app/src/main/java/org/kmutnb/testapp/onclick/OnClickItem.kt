package org.kmutnb.testapp.onclick

import android.view.View
import org.kmutnb.testapp.model.DataModel

interface OnClickItem {
    fun onClickItem(view: View, dataModel: DataModel)
}