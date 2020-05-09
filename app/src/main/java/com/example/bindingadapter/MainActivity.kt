package com.example.bindingadapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val url ="https://media.licdn.com/dms/image/C560BAQHMnA03XDdf3w/company-logo_200_200/0?e=2159024400&v=beta&t=C7KMOtnrJwGrMXmgIk2u1B8a7VRfgxMwXng9cdP9kZk";
//        Picasso.get().load(url).into(imageView)
        val list = ArrayList<User>()
        list.add(User("hieu", "tranhieuglpk@gmail.com", "0335286360", url))
        list.add(User("hieu", "tranhieuglpk@gmail.com", "0335286360", url))
        list.add(User("hieu", "tranhieuglpk@gmail.com", "0335286360", url))
        list.add(User("hieu", "tranhieuglpk@gmail.com", "0335286360", url))

            rcv.apply {
                adapter = UserAdapter(this@MainActivity,list)
                layoutManager = LinearLayoutManager(this@MainActivity)
            }
    }
}
