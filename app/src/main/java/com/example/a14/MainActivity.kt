package com.example.a14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Int): Int {
                var answer = 0
                for(i in 1..n){
                    if(n%i==0)
                        answer += i
                }
                return answer
            }
        }
        var a =Solution()
        a.solution(12)
        a.solution(5)
    }
}