package com.vmware.workspaceone_sdk_flutter_example

import android.content.Context
import android.content.Intent
import com.vmware.workspaceone_sdk_flutter.WorkspaceOneSdkApplication

class MainApplication : WorkspaceOneSdkApplication() {

    // Application-specific overrides : Comment onCreate() out and move the code to onPostCreate()

    //  @Override
    //  public void onCreate() {
    //    super.onCreate();
    //  }

    // Application-specific overrides : Copy all the code from onCreate() to onPostCreate()
    override fun onPostCreate() {
        super.onPostCreate()
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        attachBaseContext(this)
    }

    override fun getMainActivityIntent(): Intent {
        return Intent(this,MainActivity::class.java)
    }
}