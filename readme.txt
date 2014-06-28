
 
 first step:

 A: copy  the res and libs files  to your project 。
 
 or
 
 B: let your project reference the “SlidingBackLib” library 。 
 
 second step:
 
  1. announce “ android:theme="@android:style/Theme.Translucent" ” to your activities which are needed to slidingback
     in the  AndroidManifest.xml files  
     
     e.g.
            <activity
            android:name="com.example.slidingback.Activity1"
            android:theme="@android:style/Theme.Translucent"
             >
             
  2. let your activity extends SlidingBackActivity
  
    e.g.
     
     public class Activity1 extends SlidingBackActivity {。。。