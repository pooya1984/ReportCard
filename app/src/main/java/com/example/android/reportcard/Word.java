package com.example.android.reportcard;

/**
 * Created by Sharareh on 6/3/2017.
 */

public class Word {

        /** Default translation for the Word */
        private String mMathe;
        private String mAsseOne;
        private String mAsseTwo;
        private String mFinaly;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;



    public Word(String Mathe,String AsseOne,String AsseTwo,String Finaly,int imageResourceId) {
        mMathe = Mathe;
        mAsseOne=AsseOne;
        mAsseTwo=AsseTwo;
        mFinaly=Finaly;
        mImageResourceId = imageResourceId;
    }


    public String getMathe() {return mMathe;}
    public String getAsseOne(){return mAsseOne;}
    public String getAsseTwo(){return mAsseTwo;}
    public String getFinay(){return mFinaly;}
    public int getImageResourceId(){return mImageResourceId;}

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMathe='" + mMathe + '\'' +
                ", mAsseOne='" + mAsseOne + '\'' +
                ", mAsseTwo='" + mAsseTwo + '\'' +
                ", mFinaly='" + mFinaly + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                '}';
    }
}
