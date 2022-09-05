package com.example.mediamart.entity.product.television;

import com.example.mediamart.entity.product.Product;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Television extends Product {
    private String resolution;
    private String screenSize;
    private String operatingSystem;
    private String internetStandard;
    private String bluetoothStandard;
    private String avPort;
    private String hdmiPort;
    private String usbPort;
    private String audioPort;
    private String otherApplication;
    private String smartControl;
    private String connectionWireless;
    private String smartInteractive;
    private String rom;
    private String ram;
    private String videoTechnology;
    private String audioTechnology;
    private String speakerPower;
    private String imageSlideTelevision;

    // Category television
    @ManyToOne(targetEntity = CategoryTelevision.class)
    @JsonManagedReference
    private CategoryTelevision categoryTelevision;

    public Television () {
    }

    public Television (Integer id , String name , String model , String codeProduct , String insurance , String origin , String description , String trademark , String resolution , String screenSize , String operatingSystem , String internetStandard , String bluetoothStandard , String avPort , String hdmiPort , String usbPort , String audioPort , String otherApplication , String smartControl , String connectionWireless , String smartInteractive , String rom , String ram , String videoTechnology , String audioTechnology , String speakerPower , String imageSlideTelevision , CategoryTelevision categoryTelevision) {
        super(id , name , model , codeProduct , insurance , origin , description , trademark);
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.internetStandard = internetStandard;
        this.bluetoothStandard = bluetoothStandard;
        this.avPort = avPort;
        this.hdmiPort = hdmiPort;
        this.usbPort = usbPort;
        this.audioPort = audioPort;
        this.otherApplication = otherApplication;
        this.smartControl = smartControl;
        this.connectionWireless = connectionWireless;
        this.smartInteractive = smartInteractive;
        this.rom = rom;
        this.ram = ram;
        this.videoTechnology = videoTechnology;
        this.audioTechnology = audioTechnology;
        this.speakerPower = speakerPower;
        this.imageSlideTelevision = imageSlideTelevision;
        this.categoryTelevision = categoryTelevision;
    }

    public String getResolution () {
        return resolution;
    }

    public void setResolution (String resolution) {
        this.resolution = resolution;
    }

    public String getScreenSize () {
        return screenSize;
    }

    public void setScreenSize (String screenSize) {
        this.screenSize = screenSize;
    }

    public String getOperatingSystem () {
        return operatingSystem;
    }

    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getInternetStandard () {
        return internetStandard;
    }

    public void setInternetStandard (String internetStandard) {
        this.internetStandard = internetStandard;
    }

    public String getBluetoothStandard () {
        return bluetoothStandard;
    }

    public void setBluetoothStandard (String bluetoothStandard) {
        this.bluetoothStandard = bluetoothStandard;
    }

    public String getAvPort () {
        return avPort;
    }

    public void setAvPort (String avPort) {
        this.avPort = avPort;
    }

    public String getHdmiPort () {
        return hdmiPort;
    }

    public void setHdmiPort (String hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public String getUsbPort () {
        return usbPort;
    }

    public void setUsbPort (String usbPort) {
        this.usbPort = usbPort;
    }

    public String getAudioPort () {
        return audioPort;
    }

    public void setAudioPort (String audioPort) {
        this.audioPort = audioPort;
    }

    public String getOtherApplication () {
        return otherApplication;
    }

    public void setOtherApplication (String otherApplication) {
        this.otherApplication = otherApplication;
    }

    public String getSmartControl () {
        return smartControl;
    }

    public void setSmartControl (String smartControl) {
        this.smartControl = smartControl;
    }

    public String getConnectionWireless () {
        return connectionWireless;
    }

    public void setConnectionWireless (String connectionWireless) {
        this.connectionWireless = connectionWireless;
    }

    public String getSmartInteractive () {
        return smartInteractive;
    }

    public void setSmartInteractive (String smartInteractive) {
        this.smartInteractive = smartInteractive;
    }

    public String getRom () {
        return rom;
    }

    public void setRom (String rom) {
        this.rom = rom;
    }

    public String getRam () {
        return ram;
    }

    public void setRam (String ram) {
        this.ram = ram;
    }

    public String getVideoTechnology () {
        return videoTechnology;
    }

    public void setVideoTechnology (String videoTechnology) {
        this.videoTechnology = videoTechnology;
    }

    public String getAudioTechnology () {
        return audioTechnology;
    }

    public void setAudioTechnology (String audioTechnology) {
        this.audioTechnology = audioTechnology;
    }

    public String getSpeakerPower () {
        return speakerPower;
    }

    public void setSpeakerPower (String speakerPower) {
        this.speakerPower = speakerPower;
    }

    public String getImageSlideTelevision () {
        return imageSlideTelevision;
    }

    public void setImageSlideTelevision (String imageSlideTelevision) {
        this.imageSlideTelevision = imageSlideTelevision;
    }

    public CategoryTelevision getCategoryTelevision () {
        return categoryTelevision;
    }

    public void setCategoryTelevision (CategoryTelevision categoryTelevision) {
        this.categoryTelevision = categoryTelevision;
    }
}
