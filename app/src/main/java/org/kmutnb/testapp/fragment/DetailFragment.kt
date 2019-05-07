package org.kmutnb.testapp.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_detail.*
import org.kmutnb.testapp.CustomerActivity
import org.kmutnb.testapp.onclick.OnClickCustomer
import org.kmutnb.testapp.R
import org.kmutnb.testapp.adapter.DetailAdapter
import org.kmutnb.testapp.model.CommentModel
import org.kmutnb.testapp.model.DataModel

class DetailFragment : Fragment() , OnClickCustomer {



    companion object {
        fun newInstance(dataModel: DataModel): DetailFragment {
            val bundle = Bundle()
            bundle.putParcelable("KEY_DATA_MODEL", dataModel)
            val fragment = DetailFragment()
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity?.also {
            val arrayData: ArrayList<CommentModel>?

            recyclerComment?.layoutManager = LinearLayoutManager(it)

            arrayData = arrayListOf()
            arrayData.add(
                CommentModel(
                    src = "https://i.ytimg.com/vi/hwhHyxN0MSk/maxresdefault.jpg",
                    comment = "is so Good !!",
                    rating = 4
                )
            )
            arrayData.add(
                CommentModel(
                    src = "https://dog-vs-cat.com/wp-content/uploads/2018/01/130476_0_620.jpg",
                    comment = "So Cute (OwO)",
                    rating = 2
                )
            )
            arrayData.add(
                CommentModel(
                    src = "https://www.girlsallaround.com/wp-content/uploads/2014/08/107371.jpg",
                    comment = "I want to take to my home",
                    rating = 5
                )
            )


            recyclerComment.adapter = DetailAdapter(arrayData, it, this)
        }
        activity?.also {
            recyclerComment?.layoutManager = LinearLayoutManager(it)
            arguments?.getParcelable<DataModel>("KEY_DATA_MODEL")?.also { dataModel ->
                tvName.text = dataModel.profileModel.name
                tvShopName.text = dataModel.shopName
                tvAddress.text = dataModel.address
                Glide.with(context).load(dataModel.profileModel.src).into(imgProDuct)

            }
        }
    }
    override fun onClickItem(view: View, commentModel: CommentModel) {
        activity?.also {
            recyclerComment?.layoutManager = LinearLayoutManager(it)
            val dataModel =arguments?.getParcelable<DataModel>("KEY_DATA_MODEL")
                val intent = Intent(context, CustomerActivity::class.java)
                intent.putExtras(
                    Bundle().apply {
                        putParcelable("KEY_DATA_MODEL",dataModel)
                        putParcelable("KEY_DATA_COMMENT",commentModel)
                    }
                )
                startActivity(intent)




        }
    }

}
