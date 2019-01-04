package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ControlSegment;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.CosmosSegment;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.UserSegment;

public class GPS {

    private static final GPS GPS = new GPS();

    private GPS() {}

    private ControlSegment controlSegment;
    private CosmosSegment cosmosSegment;
    private UserSegment userSegment;

    public static GPS getInstance() {
        return GPS;
    }

    public ControlSegment getControlSegment() {
        return controlSegment;
    }
    public void setControlSegment(ControlSegment controlSegment) {
        this.controlSegment = controlSegment;
    }
    public CosmosSegment getCosmosSegment() {
        return cosmosSegment;
    }
    public void setCosmosSegment(CosmosSegment cosmosSegment) {
        this.cosmosSegment = cosmosSegment;
    }
    public UserSegment getUserSegment() {
        return userSegment;
    }
    public void setUserSegment(UserSegment userSegment) {
        this.userSegment = userSegment;
    }

    @Override
    public String toString() {
        return NavigationMethod.GPS.toString();
    }
}
