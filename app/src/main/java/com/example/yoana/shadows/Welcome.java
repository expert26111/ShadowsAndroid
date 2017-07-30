package com.example.yoana.shadows;

/**
 * Created by Yoana on 7/30/2017.
 */


import android.app.Fragment;
import android.view.View;

//import android.app.Fragment;

       // import android.support.v4.app.Fragment;
        import android.os.Bundle;
       // import android.support.annotation.Nullable;
        import android.util.DisplayMetrics;
        import android.util.Log;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;



/**
 * Created by yoyo on 11/14/2016.
 */
//the fragment with the circular button in front
public class Welcome extends Fragment {

  //  @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.welcome_window, container, false);
//        Button next = (Button) v.findViewById(R.id.next);
//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                MainActivity activity = (MainActivity) getActivity();
//                activity.nextWindow(view);
//            }
//        });
        // get the actual pixel dimensions
        DisplayMetrics metrics = new DisplayMetrics();

        getActivity().getWindowManager().getDefaultDisplay().getMetrics(metrics);
        Log.i("WIDTH: ", metrics.widthPixels + "");
        return v;
    }

}





































































































