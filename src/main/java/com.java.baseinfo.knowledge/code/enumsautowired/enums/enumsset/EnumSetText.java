package com.java.baseinfo.knowledge.code.enumsautowired.enums.enumsset;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15<p>
// -------------------------------------------------------
// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15</p>
// -------------------------------------------------------

import java.util.EnumSet;
import java.util.Set;

public class EnumSetText {
    public enum Style {
        BOLD, ITALIC, UNDERLINE, STRIKETHROUGH
    }

    // Any set could be passed in,but enumSet is clearly best

    public void applyStyles(Set<Style> styleSet) {

    }

    // client methods
    public void callStyles() {
        EnumSetText enumSet = new EnumSetText();
        enumSet.applyStyles(EnumSet.of(Style.BOLD, Style.ITALIC));
    }
}