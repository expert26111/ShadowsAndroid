package com.example.yoana.shadows;
import android.app.Fragment;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v7.app.AppCompatActivity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.transition.AutoTransition;
import android.support.transition.Scene;
import android.support.transition.Transition;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.transition.TransitionInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ViewAnimator;

import static com.example.yoana.shadows.Device.*;

public class MainActivity extends AppCompatActivity
{
   //we need the scenes
    private Scene sc1,sc2;
    //transition to move between scenes
    private Transition transition;
    private boolean start;
    int mCurrentScene = 1;
    private android.transition.Scene mScene1,mScene2;
    private ViewGroup mSceneRoot;
    private android.transition.TransitionManager mManager;
    Button buttonPrev, buttonNext;


   // private FrameLayout layout;

//    Button buttonPrev, buttonNext;
//    ViewAnimator viewAnimator;
//    Animation slide_in_left, slide_out_right;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        LinearLayout base = (LinearLayout) findViewById(R.id.main_layout);
//        //first scene
//        ViewGroup startViews = (ViewGroup)getLayoutInflater()
//                .inflate(R.layout.welcome_window, base, false);
//
////second scene
//        ViewGroup endViews = (ViewGroup)getLayoutInflater()
//                .inflate(R.layout.welcome_window_4, base, false);
//
//        //create the two scenes
//        sc1 = new Scene(base, startViews);
//        sc2 = new Scene(base, endViews);
//
//        //create transition, set properties
//        transition = new AutoTransition();
//        transition.setDuration(5000);
//        transition.setInterpolator(new AccelerateDecelerateInterpolator());
//
////initialize flag
//        start=true;

//        mSceneRoot = (ViewGroup) findViewById(R.id.main_layout);
//        mScene1 = android.transition.Scene.getSceneForLayout(mSceneRoot, R.layout.welcome_window, this);
//        mScene2 = android.transition.Scene.getSceneForLayout(mSceneRoot, R.layout.welcome_window_4, this);
//        mManager = TransitionInflater.from(this).inflateTransitionManager(R.transition.manager,mSceneRoot);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate_scale);

        ImageView image1 = (ImageView)findViewById(R.id.circle);
        image1.startAnimation(animation);
        animation.setFillAfter(true);

//        animation.setAnimationListener(new Animation.AnimationListener() {
//            @Override
//            public void onAnimationStart(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animation animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animation animation) {
//
//            }
//        });



    }

    public void clockwise(View view)
    {
        ImageView image = (ImageView)findViewById(R.id.circle);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.myanimation);
        image.startAnimation(animation);
    }

    public void fade(View view)
    {
        ImageView image = (ImageView)findViewById(R.id.circle);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.fade);
        image.startAnimation(animation1);
    }

    public void zoom(View view)
    {
        ImageView image = (ImageView)findViewById(R.id.circle);
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.clockwise);
        image.startAnimation(animation1);
    }



}

//    @Override
//    protected void onResume()
//    {
//        super.onResume();
//        runTransition();
//
//    }

//    private void runTransition()
//    {
//        //check flag
////        if(start) {
////            TransitionManager.go(sc2, transition);
////            start=false;
////        }
////        else {
////            TransitionManager.go(sc1, transition);
////            start=true;
////        }
//
//
//
//        if(start)
//        {
////            TransitionManager.go(mScene2);
//            mCurrentScene = 2;
//            mManager.transitionTo(mScene2);
//        }else
//        {
//            mManager.transitionTo(mScene1);
//            mCurrentScene = 1;
//
//        }
//
//
//    }
//
//}
