package com.khan.khizr.hurryup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import java.util.Random;



public class HurryUp extends Activity {

    // gameView will be the view of the game
    // It will also hold the logic of the game
    // and respond to screen touches as well
    HurryUpView HurryUpView;

    int screenX;
    int screenY;
    int SquareLength;
    int space;
    boolean test = false;
    int SquareTouchedY = 20;
    int SquareTouchedX = 20;
    Random rand = new Random();
    int randomX = rand.nextInt(4);
    int randomY = rand.nextInt(4);
    int randomX2 = rand.nextInt(4);
    int randomY2 = rand.nextInt(4);
    int yellowChance = rand.nextInt(10);
    int yellowX = 10;
    int yellowY = 10;
    int score = 0;
    String scoreLine = "SCORE: " + score;
    int tStartX = 10;
    int tStartY = 10;

    long addedTime = 9999;
    long multiplier = 9995;
    long timeTransfer = 0;

    long timeLeftX1Y1 = 0;
    long timeLeftX2Y1 = 0;
    long timeLeftX3Y1 = 0;
    long timeLeftX4Y1 = 0;
    long timeLeftX1Y2 = 0;
    long timeLeftX2Y2 = 0;
    long timeLeftX3Y2 = 0;
    long timeLeftX4Y2 = 0;
    long timeLeftX1Y3 = 0;
    long timeLeftX2Y3 = 0;
    long timeLeftX3Y3 = 0;
    long timeLeftX4Y3 = 0;
    long timeLeftX1Y4 = 0;
    long timeLeftX2Y4 = 0;
    long timeLeftX3Y4 = 0;
    long timeLeftX4Y4 = 0;

    int switchInt = 100;
    String stringX1Y1 = Long.toString(timeLeftX1Y1);
    String stringX2Y1 = Long.toString(timeLeftX2Y1);
    String stringX3Y1 = Long.toString(timeLeftX3Y1);
    String stringX4Y1 = Long.toString(timeLeftX4Y1);
    String stringX1Y2 = Long.toString(timeLeftX1Y2);
    String stringX2Y2 = Long.toString(timeLeftX2Y2);
    String stringX3Y2 = Long.toString(timeLeftX3Y2);
    String stringX4Y2 = Long.toString(timeLeftX4Y2);
    String stringX1Y3 = Long.toString(timeLeftX1Y3);
    String stringX2Y3 = Long.toString(timeLeftX2Y3);
    String stringX3Y3 = Long.toString(timeLeftX3Y3);
    String stringX4Y3 = Long.toString(timeLeftX4Y3);
    String stringX1Y4 = Long.toString(timeLeftX1Y4);
    String stringX2Y4 = Long.toString(timeLeftX2Y4);
    String stringX3Y4 = Long.toString(timeLeftX3Y4);
    String stringX4Y4 = Long.toString(timeLeftX4Y4);

    ClassX1Y1 timerX1Y1 = new ClassX1Y1(addedTime,1);
    ClassX2Y1 timerX2Y1 = new ClassX2Y1(addedTime,1);
    ClassX3Y1 timerX3Y1 = new ClassX3Y1(addedTime,1);
    ClassX4Y1 timerX4Y1 = new ClassX4Y1(addedTime,1);
    ClassX1Y2 timerX1Y2 = new ClassX1Y2(addedTime,1);
    ClassX2Y2 timerX2Y2 = new ClassX2Y2(addedTime,1);
    ClassX3Y2 timerX3Y2 = new ClassX3Y2(addedTime,1);
    ClassX4Y2 timerX4Y2 = new ClassX4Y2(addedTime,1);
    ClassX1Y3 timerX1Y3 = new ClassX1Y3(addedTime,1);
    ClassX2Y3 timerX2Y3 = new ClassX2Y3(addedTime,1);
    ClassX3Y3 timerX3Y3 = new ClassX3Y3(addedTime,1);
    ClassX4Y3 timerX4Y3 = new ClassX4Y3(addedTime,1);
    ClassX1Y4 timerX1Y4 = new ClassX1Y4(addedTime,1);
    ClassX2Y4 timerX2Y4 = new ClassX2Y4(addedTime,1);
    ClassX3Y4 timerX3Y4 = new ClassX3Y4(addedTime,1);
    ClassX4Y4 timerX4Y4 = new ClassX4Y4(addedTime,1);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize gameView and set it as the view
        HurryUpView = new HurryUpView(this);
        setContentView(HurryUpView);



    }

    public class ClassX1Y1 extends CountDownTimer{

        public ClassX1Y1(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX1Y1 = millisUntilFinished/1000;
           // Colours();


        }

        @Override
        public void onFinish() {
            timeLeftX1Y1 = 0;
        }
    }


    public class ClassX2Y1 extends CountDownTimer{

        public ClassX2Y1(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX2Y1 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX2Y1 = 0;
        }
    }

    public class ClassX3Y1 extends CountDownTimer{

        public ClassX3Y1(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX3Y1 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX3Y1 = 0;
        }
    }

    public class ClassX4Y1 extends CountDownTimer{

        public ClassX4Y1(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX4Y1 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX4Y1 = 0;
        }
    }

    public class ClassX1Y2 extends CountDownTimer{

        public ClassX1Y2(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX1Y2 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX1Y2 = 0;
        }
    }

    public class ClassX2Y2 extends CountDownTimer{

        public ClassX2Y2(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX2Y2 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX2Y2 = 0;
        }
    }

    public class ClassX3Y2 extends CountDownTimer{

        public ClassX3Y2(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX3Y2 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX3Y2 = 0;
        }
    }

    public class ClassX4Y2 extends CountDownTimer{

        public ClassX4Y2(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX4Y2 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX4Y2 = 0;
        }
    }

    public class ClassX1Y3 extends CountDownTimer{

        public ClassX1Y3(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX1Y3 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX1Y3 = 0;
        }
    }

    public class ClassX2Y3 extends CountDownTimer{

        public ClassX2Y3(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX2Y3 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX2Y3 = 0;
        }
    }

    public class ClassX3Y3 extends CountDownTimer{

        public ClassX3Y3(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX3Y3 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX3Y3 = 0;
        }
    }

    public class ClassX4Y3 extends CountDownTimer{

        public ClassX4Y3(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX4Y3 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX4Y3 = 0;
        }
    }

    public class ClassX1Y4 extends CountDownTimer{

        public ClassX1Y4(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX1Y4 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX1Y4 = 0;
        }
    }

    public class ClassX2Y4 extends CountDownTimer{

        public ClassX2Y4(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX2Y4 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX2Y4 = 0;
        }
    }

    public class ClassX3Y4 extends CountDownTimer{

        public ClassX3Y4(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX3Y4 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX3Y4 = 0;
        }
    }

    public class ClassX4Y4 extends CountDownTimer{

        public ClassX4Y4(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            timeLeftX4Y4 = millisUntilFinished/1000;
        }

        @Override
        public void onFinish() {
            timeLeftX4Y4 = 0;
        }
    }













    // Here is our implementation of GameView
    // It is an inner class.
    // Note how the final closing curly brace }
    // is inside SimpleGameEngine

    // Notice we implement runnable so we have
    // A thread and can override the run method.
    class HurryUpView extends SurfaceView implements Runnable {

        // This is our thread
        Thread gameThread = null;

        // This is new. We need a SurfaceHolder
        // When we use Paint and Canvas in a thread
        // We will see it in action in the draw method soon.
        SurfaceHolder ourHolder;

        // A boolean which we will set and unset
        // when the game is running- or not.
        volatile boolean playing;

        // Game is paused at the start
        boolean paused = true;

        // A Canvas and a Paint object
        Canvas canvas;
        Paint paint;

        // This variable tracks the game frame rate
        long fps;

        // This is used to help calculate the fps
        private long timeThisFrame;

        public void Checker (long time){
              if (time > 6){
                 paint.setColor(Color.argb(255, 237, 207, 114));
             }
             else if (time > 4){
                 paint.setColor(Color.argb(255, 245, 149, 99));
             }
            else if (time > 2){
                paint.setColor(Color.argb(255, 246, 127, 95));
            }
            else if (time > 0){
                paint.setColor(Color.argb(255, 246, 94, 59));
            }
        }

        public long ColourCheck (int x, int y){
            int num;
            num = x * 10 + y;
            if ( num ==0){
                return timeLeftX1Y1;
            }
            else if (num == 10){
                return timeLeftX2Y1;
            }
            else if (num == 20){
                return timeLeftX3Y1;
            }
            else if (num == 30){
                return timeLeftX4Y1;
            }
            else if ( num ==1){
                return timeLeftX1Y2;
            }
            else if (num == 11){
                return timeLeftX2Y2;
            }
            else if (num == 21){
                return timeLeftX3Y2;
            }
            else if (num == 31){
                return timeLeftX4Y2;
            }
            if ( num ==2){
                return timeLeftX1Y3;
            }
            else if (num == 12){
                return timeLeftX2Y3;
            }
            else if (num == 22){
                return timeLeftX3Y3;
            }
            else if (num == 32){
                return timeLeftX4Y3;
            }
            if ( num ==3){
                return timeLeftX1Y4;
            }
            else if (num == 13){
                return timeLeftX2Y4;
            }
            else if (num == 23){
                return timeLeftX3Y4;
            }
            else if (num == 33){
                return timeLeftX4Y4;
            }



           return num;
        }
        // The size of the screen in pixels




        // When the we initialize (call new()) on gameView
        // This special constructor method runs
        public HurryUpView(Context context) {
            // The next line of code asks the
            // SurfaceView class to set up our object.
            // How kind.
            super(context);

            // Initialize ourHolder and paint objects
            ourHolder = getHolder();

            paint = new Paint(Paint.ANTI_ALIAS_FLAG);


            // Get a Display object to access screen details
            Display display = getWindowManager().getDefaultDisplay();
            // Load the resolution into a Point object
            Point size = new Point();
            display.getSize(size);

            screenX = size.x;
            screenY = size.y;
            SquareLength = screenX / 5;
            space = screenX/35;

        }

        @Override
        public void run() {
            while (playing) {

                // Capture the current time in milliseconds in startFrameTime
                long startFrameTime = System.currentTimeMillis();

                // Update the frame
                // Update the frame
                if(!paused){
                    update();
                }

                // Draw the frame
                draw();

                // Calculate the fps this frame
                // We can then use the result to
                // time animations and more.
                timeThisFrame = System.currentTimeMillis() - startFrameTime;
                if (timeThisFrame >= 1) {
                    fps = 1000 / timeThisFrame;
                }


            }

        }






        // Everything that needs to be updated goes in here
        // Movement, collision detection etc.
        public void update() {

        }

        // Draw the newly updated scene
        public void draw() {





            // Make sure our drawing surface is valid or we crash
            if (ourHolder.getSurface().isValid()) {
                // Lock the canvas ready to draw
                canvas = ourHolder.lockCanvas();


                // Draw the background color
                canvas.drawColor(Color.argb(255,  1, 187, 210));

                paint.setColor(Color.argb(255,  0, 152, 166));
                canvas.drawRect(new RectF (0,0,screenX,screenY /5),paint );

                paint.setColor(Color.argb(255,  255, 255, 255));
                canvas.drawLine(100,screenY - space * 8 - SquareLength * 4, screenX - 100,screenY - space * 8 - SquareLength * 4,paint);

                paint.setColor(Color.argb(255,  254, 77, 64));
                canvas.drawCircle(300, screenY/5,space*3.5f,paint);

                paint.setColor(Color.argb(255,255,255,255));
                paint.setTextSize(70);
                canvas.drawText(scoreLine, 100,200,paint);
                scoreLine = "SCORE: " + score + "       " + addedTime;
                paint.setTextSize(140);



                paint.setShadowLayer(30, 0, 0, Color.GRAY);

                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 4 ; j++) {
                        paint.setColor(Color.argb(255, 0, 0, 0));
                        canvas.drawRoundRect(new RectF(space * (j+2) + SquareLength * j + 4, screenY - space * (i+4) - SquareLength * (i+1) + 4, space * (j+2) + SquareLength * (j+1) + 9, screenY - space * (i+4) - SquareLength * i + 9), 10, 10, paint);
                    }
                }

                for (int i = 0; i < 4; i++){
                    for (int j = 0; j < 4 ; j++) {

                        paint.setColor(Color.argb(255, 255, 255, 201));
                        long ColourVarTransfer = ColourCheck(j,i);
                        Checker(ColourVarTransfer);
                        canvas.drawRoundRect(new RectF(space * (j+2) + SquareLength * j, screenY - space * (i+4) - SquareLength * (i+1), space * (j+2) + SquareLength * (j+1), screenY - space * (i+4) - SquareLength * i), 10, 10, paint);
                    }
                }






                if (test){
                    paint.setColor(Color.argb(255, 225, 203, 0));
                    canvas.drawRoundRect(new RectF(space * (SquareTouchedX+2) + SquareLength * SquareTouchedX, screenY - space * (SquareTouchedY+4) - SquareLength * (SquareTouchedY+1), space * (SquareTouchedX+2) + SquareLength * (SquareTouchedX+1), screenY - space * (SquareTouchedY+4) - SquareLength * SquareTouchedY), 20, 20, paint);
                }





                switchInt = tStartX * 10 + tStartY;
                switch (switchInt) {
                    case 0:
                        timerX1Y1.cancel();
                        timerX1Y1.start();

                        break;
                    case 10:
                        timerX2Y1.cancel();
                        timerX2Y1.start();
                        break;
                    case 20:
                        timerX3Y1.cancel();
                        timerX3Y1.start();
                        break;
                    case 30:
                        timerX4Y1.cancel();
                        timerX4Y1.start();
                        break;
                    case 1:
                        timerX1Y2.cancel();
                        timerX1Y2.start();
                        break;
                    case 11:
                        timerX2Y2.cancel();
                        timerX2Y2.start();
                        break;
                    case 21:
                        timerX3Y2.cancel();
                        timerX3Y2.start();
                        break;
                    case 31:
                        timerX4Y2.cancel();
                        timerX4Y2.start();
                        break;
                    case 2:
                        timerX1Y3.cancel();
                        timerX1Y3.start();
                        break;
                    case 12:
                        timerX2Y3.cancel();
                        timerX2Y3.start();
                        break;
                    case 22:
                        timerX3Y3.cancel();
                        timerX3Y3.start();
                        break;
                    case 32:
                        timerX4Y3.cancel();
                        timerX4Y3.start();
                        break;
                    case 3:
                        timerX1Y4.cancel();
                        timerX1Y4.start();
                        break;
                    case 13:
                        timerX2Y4.cancel();
                        timerX2Y4.start();
                        break;
                    case 23:
                        timerX3Y4.cancel();
                        timerX3Y4.start();
                        break;
                    case 33:
                        timerX4Y4.cancel();
                        timerX4Y4.start();
                        break;
                    default:
                        break;


                }
                tStartX = 10;
                tStartY = 10;

                paint.clearShadowLayer();

                for (int x = 0; x < 4; x++) {
                    for (int y = 0; y < 4; y++) {
                        paint.setColor(Color.argb(255, 0, 0, 0));
                        switchInt = y * 10 + x;
                        switch (switchInt) {
                            case 0:
                                canvas.drawText(Long.toString(timeLeftX1Y1), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 10:
                                canvas.drawText(Long.toString(timeLeftX1Y2), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 20:
                                canvas.drawText(Long.toString(timeLeftX1Y3), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 30:
                                canvas.drawText(Long.toString(timeLeftX1Y4), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 1:
                                canvas.drawText(Long.toString(timeLeftX2Y1), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 11:
                                canvas.drawText(Long.toString(timeLeftX2Y2), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 21:
                                canvas.drawText(Long.toString(timeLeftX2Y3), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 31:
                                canvas.drawText(Long.toString(timeLeftX2Y4), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 2:
                                canvas.drawText(Long.toString(timeLeftX3Y1), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 12:
                                canvas.drawText(Long.toString(timeLeftX3Y2), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 22:
                                canvas.drawText(Long.toString(timeLeftX3Y3), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 32:
                                canvas.drawText(Long.toString(timeLeftX3Y4), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 3:
                                canvas.drawText(Long.toString(timeLeftX4Y1), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 13:
                                canvas.drawText(Long.toString(timeLeftX4Y2), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 23:
                                canvas.drawText(Long.toString(timeLeftX4Y3), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            case 33:
                                canvas.drawText(Long.toString(timeLeftX4Y4), space * (x + 2) + SquareLength * x + space * 10 / 4, screenY - space * (y + 4) - SquareLength * (y + 1) + space * 9 / 2, paint);
                                break;
                            default:
                                break;
                        }
                    }
                }







                // Draw everything to the screen
                ourHolder.unlockCanvasAndPost(canvas);
            }

        }



        // If SimpleGameEngine Activity is paused/stopped
        // shutdown our thread.
        public void pause() {
            playing = false;
            try {
                gameThread.join();
            } catch (InterruptedException e) {
                Log.e("Error:", "joining thread");
            }

        }

        // If SimpleGameEngine Activity is started theb
        // start our thread.
        public void resume() {
            playing = true;
            gameThread = new Thread(this);
            gameThread.start();
        }

        // The SurfaceView class implements onTouchListener
        // So we can override this method and detect screen touches.
        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {

            switch (motionEvent.getAction() & MotionEvent.ACTION_MASK) {

                // Player has touched the screen
                case MotionEvent.ACTION_DOWN:

                    paused = false;

                    float x = motionEvent.getX();
                    float y = motionEvent.getY();



                    for (int i = 0; i < 4; i++){
                        for (int j = 0; j < 4 ; j++) {

                            if (x > space * (j+2) + SquareLength * j && y >  screenY - space * (i+4) - SquareLength * (i+1) && x < space * (j+2) + SquareLength * (j+1) && y < screenY - space * (i+4) - SquareLength * i){
                                SquareTouchedY = i;
                                SquareTouchedX = j;
                                test = true;
                                score++;
                            }

                        }
                    }




                    break;

                // Player has removed finger from screen
                case MotionEvent.ACTION_UP:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();

                    tStartX = SquareTouchedX;
                    tStartY = SquareTouchedY;

                    SquareTouchedX = 10;
                    SquareTouchedY = 10;


                    break;
            }
            return true;
        }

    }
    // This is the end of our BreakoutView inner class

    // This method executes when the player starts the game
    @Override
    protected void onResume() {
        super.onResume();

        // Tell the gameView resume method to execute
        HurryUpView.resume();
    }

    // This method executes when the player quits the game
    @Override
    protected void onPause() {
        super.onPause();

        // Tell the gameView pause method to execute
        HurryUpView.pause();
    }



}
// This is the end of the BreakoutGame class

