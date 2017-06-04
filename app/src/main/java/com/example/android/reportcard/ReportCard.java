package com.example.android.reportcard;

/**
 * Created by Sharareh on 6/3/2017.
 */

public class ReportCard {

        /** Default translation for the ReportCard */
        private String mMathe;
        private String mAsseOne;
        private String mAsseTwo;
        private String mFinaly;





    public ReportCard(String Mathe, String AsseOne, String AsseTwo, String Finaly, int imageResourceId) {
        mMathe = Mathe;
        mAsseOne = AsseOne;
        mAsseTwo = AsseTwo;
        mFinaly = Finaly;
    }


    public String getMathe() {return mMathe;}
    public String getAsseOne(){return mAsseOne;}
    public String getAsseTwo(){return mAsseTwo;}
    public String getFinay(){return mFinaly;}


    @Override
    public String toString() {
        return "ReportCard{" +
                "mMathe='" + mMathe + '\'' +
                ", mAsseOne='" + mAsseOne + '\'' +
                ", mAsseTwo='" + mAsseTwo + '\'' +
                ", mFinaly='" + mFinaly + '\'' +
                '}';
    }
}
