package com.company.court;

import com.company.data.prototype.Archives;

public class CommunityService implements Law{

    public void setSentence(Archives criminalInfo) {
        System.out.println("This criminal was sentenced to compulsory community service,it remains only to determine the term.  ");
        criminalInfo.setLawState(this);
    }

    public String toString() {
        return "To community service";
    }


}
