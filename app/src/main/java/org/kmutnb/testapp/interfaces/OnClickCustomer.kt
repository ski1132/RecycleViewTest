package org.kmutnb.testapp.interfaces

import android.view.View
import org.kmutnb.testapp.model.CommentModel

interface OnClickCustomer {
    fun onClickItem(view: View, commentModel: CommentModel)
}