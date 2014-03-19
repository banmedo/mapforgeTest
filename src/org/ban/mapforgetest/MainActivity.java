package org.ban.mapforgetest;

import org.mapsforge.android.maps.MapView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import java.io.File;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        
        //initialise map view
		MapView mapView = (MapView) findViewById(R.id.map);
		
        //set the map as clickable 
        mapView.setClickable(true);
        
        //enable the zoom controls
		mapView.setBuiltInZoomControls(true);
		
        //<----now we need to add map data to the map view
      	// it should be
        mapView.setMapFile(new File("pathname/filename.map")); 
        
        //this takes .map file as an argument
		this.setContentView(mapView);
	}
}
