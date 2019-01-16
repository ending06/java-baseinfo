package com.java.baseinfo.knowledge.code.enumsautowired.enums.enumsmap;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// --------------------- Change Logs----------------------
// <p>@author ruirui.qu Initial Created at 2019/1/15<p>
// -------------------------------------------------------

public class EnumMapHerb {
    public enum Type {
        ANNUAL, PERENNIAL, BIENNIAL
    }

    private final String name;

    private final String type;

    public EnumMapHerb(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return name;
    }

    public void sample() {

        List<EnumMapHerb> gardens = new ArrayList<>();

        Map<Type, Set<EnumMapHerb>> herbType = new EnumMap<Type, Set<EnumMapHerb>>(EnumMapHerb.Type.class);

        for (EnumMapHerb.Type t : EnumMapHerb.Type.values()) {
            herbType.put(t, new HashSet<EnumMapHerb>());
        }
        for (EnumMapHerb herb : gardens) {
            herbType.get(herb.type).add(herb);
        }
        System.out.printf("==>" + herbType);
    }
}