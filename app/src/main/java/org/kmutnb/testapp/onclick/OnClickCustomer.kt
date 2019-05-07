package org.kmutnb.testapp.onclick

import android.view.View
import org.kmutnb.testapp.model.CommentModel

interface OnClickCustomer {
    fun onClickItem(view: View, commentModel: CommentModel)
}