package com.atul.firstopengl;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    OpenGLView openGLView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        openGLView = (OpenGLView) findViewById(R.id.openGLView);

        if (openGLView == null) {
            throw new RuntimeException("OpenGL not found. Please check layout xml");
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            if (openGLView != null) {
                openGLView.onResume();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (openGLView != null) {
            openGLView.onResume();
        }
    }
}