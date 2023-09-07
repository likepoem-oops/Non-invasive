package com.czp.nonInvasive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.czp.nonInvasive.annotation.Permission
import com.czp.nonInvasive.annotation.PermissionCancel
import com.czp.nonInvasive.annotation.PermissionDenied

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }


    private fun getPermission() {
        test()
    }

    @Permission
    private fun test() {
        Toast.makeText(this, "权限申请成功", Toast.LENGTH_SHORT).show()
    }

    @PermissionCancel
    private fun testCancel() {
        Toast.makeText(this, "权限申请取消", Toast.LENGTH_SHORT).show()
    }

    @PermissionDenied
    private fun testDenied() {
        Toast.makeText(this, "权限申请拒绝", Toast.LENGTH_SHORT).show()
    }
}