package com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain;

import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.common.NavigationMethod;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.ground.ControlSegment;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.satellite.CosmosSegment;
import com.shako.root.isbn_0_201_89551_x.section3._1_osgsp.domain.segment.user.UserSegment;

public class GPS implements SNS {

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

    public void launchSatellite() {

    }

    public void flyToSeparationPoint() {

    }

    public void activateSatellite() {

    }

    public void separateSatellite() {

    }

    public void moveSatelliteIntoOrbit() {

    }

    public void performSatelliteCheckout() {

    }

    public void prepareToOperations() {

    }

    public void transmitInitialPositionInformation() {

    }
}
