package com.example.kjhoo.sunrinton2016re;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by kjhoo on 2016-07-23.
 */
public class NotificationService extends AccessibilityService {
    @Override
    public void onAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        Log.d("onAccessibilityEvent","event");
        if(accessibilityEvent.getEventType() == AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED) {
            Log.d("Media Scannig", "start");
            Log.d("package", accessibilityEvent.getPackageName().toString());

            if (accessibilityEvent.getPackageName().equals("com.android.systemui")) {
                String[] projection = new String[]{
                        MediaStore.Images.ImageColumns._ID,
                        MediaStore.Images.ImageColumns.DATA,
                        MediaStore.Images.ImageColumns.BUCKET_DISPLAY_NAME,
                        MediaStore.Images.ImageColumns.DATE_TAKEN,
                        MediaStore.Images.ImageColumns.MIME_TYPE
                };
                final Cursor cursor = getContentResolver()
                        .query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, projection, null,
                                null, MediaStore.Images.ImageColumns.DATE_TAKEN + " DESC");

                // Put it in the image view
                if (cursor.moveToFirst()) {
                    //                final ImageView imageView = (ImageView) findViewById (R.id.pictureView);
                    String imageLocation = cursor.getString(1);
                    Log.d("imgageLocation", imageLocation);
                    Intent intent = new Intent(getApplicationContext(), writepage.class);
                    intent.putExtra("imageLocation", imageLocation);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        }
    }

    @Override
    protected void onServiceConnected() {
        Log.d("onServiceConnected","connected");
        AccessibilityServiceInfo info = new AccessibilityServiceInfo();
        info.eventTypes = AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED;
        info.notificationTimeout = 100;
        info.feedbackType = AccessibilityEvent.TYPES_ALL_MASK;
        info.flags = AccessibilityServiceInfo.DEFAULT;
        setServiceInfo(info);
    }

    @Override
    public void onInterrupt() {
        Log.d("dudco","onInterrupt");
    }
}
