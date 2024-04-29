package com.example.pekan5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.pekan5.fragment.HomeFragment;
import com.example.pekan5.fragment.PostinganFragment;
import com.example.pekan5.fragment.ProfileFragment;
import com.example.pekan5.fragment.SearchFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView IV_Home = findViewById(R.id.IV_Home);
        ImageView IV_Search = findViewById(R.id.IV_Search);
        ImageView IV_Post = findViewById(R.id.IV_Plus);
        ImageView iv_profile = findViewById(R.id.IV_Profile);


        FragmentManager fragmentManager = getSupportFragmentManager();

        HomeFragment homeFragment = new HomeFragment();

        Fragment fragment = fragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());

        if (!(fragment instanceof HomeFragment)){
            fragmentManager.beginTransaction().add(R.id.frame_container, homeFragment).commit();
        }

        IV_Home.setOnClickListener(v -> {
            HomeFragment homeFragment1 = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, homeFragment1)
                    .addToBackStack(null).commit();
        });

        IV_Search.setOnClickListener(v -> {
            SearchFragment searchFragment = new SearchFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, searchFragment)
                    .addToBackStack(null).commit();
        });

        IV_Post.setOnClickListener(v -> {
            PostinganFragment addPostFragment = new PostinganFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, addPostFragment)
                    .addToBackStack(null).commit();
        });

        iv_profile.setOnClickListener(v -> {
            ProfileFragment profileFragment = new ProfileFragment();
            fragmentManager.beginTransaction().replace(R.id.frame_container, profileFragment)
                    .addToBackStack(null).commit();
        });

    }
}
