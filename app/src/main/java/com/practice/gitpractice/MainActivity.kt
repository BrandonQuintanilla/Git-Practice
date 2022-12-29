package com.practice.gitpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//setContentView(R.layout.activity_main)

//Cherry pick
//Allows us to take one or more commits from another branch to another
        //Remember that this works by creating a new commit instance
// git cherry-pick <commit-id> : copies the selected commit over our current branch  (on HEAD)
// git cherry-pick <commit-id1> <commit-id1> <commit-id1> : be can cherypick many commits, but be carefull with the order
// git cherry-pick <commit-id> -n : -n arguments tells git that not commit the changes, just apply the commit over our current code
    }
} 