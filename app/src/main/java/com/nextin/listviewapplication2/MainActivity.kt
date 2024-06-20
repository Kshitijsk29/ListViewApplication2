package com.nextin.listviewapplication2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.nextin.listviewapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding :ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var arrayList: ArrayList<Users>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name = arrayOf(
            "Ramandip", "Shraddha", "Kunal", "Bhai", "vaibhav", "Yuvi",
            "Rohit","Amit","Himanshu","shivam",
            "Ramandip", "Shraddha", "Kunal", "Bhai", "vaibhav", "Yuvi",
            "Rohit","Amit","Himanshu","shivam"
        )
        val lastMsg = arrayOf(
            "hii","Good Morning","Kut ahe be","Zal ka kam?","Hello",
            "Happy birthday","zal Ka Jevan","ksa ahes","paise patv","chal bye",
            "hii","Good Morning","Kut ahe be","Zal ka kam?","Hello",
            "Happy birthday","zal Ka Jevan","ksa ahes","paise patv","chal bye"
        )

        val lastMsgTime = arrayOf(
            "10.20pm","09.20am","10.20pm","11.20pm","01.20pm",
            "12.00am","11.20am","10.20pm","02.20pm","10.20pm",
            "10.20pm","09.20am","10.20pm","11.20pm","01.20pm",
            "12.00am","11.20am","10.20pm","02.20pm","10.20pm"
        )
        val profileImage = arrayOf(
            R.drawable.yuvi,
            R.drawable.smriti,
            R.drawable.siraj,
            R.drawable.virat_kohli,
            R.drawable.doni,
            R.drawable.america,
            R.drawable.kl_rahul,
            R.drawable.rohit_sharma,
            R.drawable.virat,
            R.drawable.vision,
            R.drawable.yuvi,
            R.drawable.smriti,
            R.drawable.siraj,
            R.drawable.virat_kohli,
            R.drawable.doni,
            R.drawable.america,
            R.drawable.kl_rahul,
            R.drawable.rohit_sharma,
            R.drawable.virat,
            R.drawable.vision

        )

        arrayList= ArrayList()

        for (index in name.indices){
            val user = Users(name[index],lastMsg[index],lastMsgTime[index],
                profileImage[index])
            arrayList.add(user)
        }

        binding.listView.adapter = MyAdpater(this,arrayList)
    }
}