package com.company.court;

import com.company.data.prototype.Archives;

public class Imprison implements Law {

    public void setSentence(Archives criminalInfo) {
        System.out.println("This criminal will be sent to prison, it remains only to determine the term. ");
        criminalInfo.setLawState(this);
    }

    public String toString() {
        return "To Prison";
    }
}
