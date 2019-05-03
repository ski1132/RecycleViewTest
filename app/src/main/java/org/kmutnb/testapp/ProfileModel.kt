package org.kmutnb.testapp

data class ProfileModel(
    var name: String? ,
    var address : String = "dd"


){
    private fun dd(){
        name = null
        address.length
    }
}
