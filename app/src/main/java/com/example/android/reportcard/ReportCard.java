package com.example.android.reportcard;

/**
 * Created by Pooya on 6/4/2017.
 */


public class ReportCard {
    private String Mathemathic;
    private String AssessmentOne;
    private String AssessmentTwo;
    private String Final;

    public ReportCard (String Mathemathic,String AssessmentOne,String AssessmentTwo,String Final) {
        this.Mathemathic = Mathemathic;
        this.AssessmentOne = AssessmentOne;
        this.AssessmentTwo = AssessmentTwo;
        this.Final = Final;
    }


    public String getMathemathic() {
        return Mathemathic;
    }

    public String getAssessmentOne() {
        return AssessmentOne;
    }

    public String getAssessmentTwo() {
        return AssessmentTwo;
    }

    public String Final() {
        return Final;
    }


    //Setters

    public void setMathemathic(String Mathemathic ) {
        this.Mathemathic = Mathemathic;
    }

    public void setAssessmentOne(String AssessmentOne ) {
        this.AssessmentOne = AssessmentOne;
    }

    public void setAssessmentTwo(String AssessmentTwo ) {
        this.AssessmentTwo = AssessmentTwo;
    }

    public void Final(String Final ) {
        this.Final = Final;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "Mathemathic='" + Mathemathic + '\'' +
                ", AssessmentOne='" + AssessmentOne + '\'' +
                ", AssessmentTwo='" + AssessmentTwo + '\'' +
                ", Final='" + Final + '\'' +
                '}';
    }
}