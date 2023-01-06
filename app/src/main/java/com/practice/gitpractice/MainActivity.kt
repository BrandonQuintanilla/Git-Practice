package com.practice.gitpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

// change over branch-name, cherry-picked to cherrypick-test branch
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//setContentView(R.layout.activity_main)

//Cherry pick
//Allows us to COPY one or more commits from another branch to another
        //Remember that this works by creating a new commit instance
// git cherry-pick <commit-id> : copies the selected commit over our current branch  (on HEAD)
// git cherry-pick <commit-id1> <commit-id1> <commit-id2> : be can cherypick many commits, but be carefull with the order. The commit-id1  should be the older than id2
//Example:         git cherry-pick a7d103b1 04702eed cab51785

// git cherry-pick <commit-id> -n : -n arguments tells git that not commit the changes, just apply the commit over our current code
//OBS if there are conflic that are too hard to resolve you can use "git cherry-pick --abort" to come back as when the code was before you used the cherry-pick command.

        // remember, when we  want to delete a commit  we use
        // git reset --hard HEAD~1 : the ~1 says "how many commits yo want o delete back from current HEAD"
        //~ is called "tilde" "option and  +"
    }
}
// fake change