package edu.usf.mobilesoftdevelop;

import android.content.Context;
import android.location.*;
import android.location.GpsStatus.Listener;




public class ManageGPS extends android.app.Service
{
	GoogleMap map;
	
	LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
	
	LocationListener locationListener = new LocationListener()
	{
		
	}
}
