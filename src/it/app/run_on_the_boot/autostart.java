package it.app.run_on_the_boot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class autostart extends BroadcastReceiver {
	private static final String TAG = "RUN_ON_THE_BOOT";

	public void onReceive(Context arg0, Intent arg1) {
		Intent intent = new Intent(arg0, Test1Service.class);
		arg0.startService(intent);
		Log.i(TAG, "started");
	}
}
