package com.example.mediamart.entity.product.Telephone;

import com.example.mediamart.entity.product.Product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Telephone extends Product {
    private String boxInclude;
    private String screenTechnology;
    private String resolution;
    private Float screenSize;
    private String touchScreen;
    private String touchGlass;
    private String cameraBehind;
    private String videoQuality;
    private String flash;
    private String photograpthAdvanced;
    private Integer cameraBefore;
    private String film;
    private String videoCall;
    private String anotherInformation;
    private String operatingSystem;
    private String cpu;
    private Integer coreNumber;
    private Float maximumSpeed;
    private Integer ram;
    private Integer rom;
    private String bandwidth2G;
    private String bandwidth3G;
    private String bandwidth4G;
    private String simTray;
    private String wireless;
    private String gps;
    private String bluetooth;
    private String nft;
    private String chargePort;
    private String otherConnection;
    private String design;
    private String material;
    private Integer capacityBattery;
    private String specialFeatures;
    private String watchVideo;
    private String listenMusic;
    private String otherFeatures;

    @ManyToOne(targetEntity = CategoryTelephone.class)
    private CategoryTelephone categoryTelephone;

    public Telephone () {
    }

    public Telephone (Integer id , String name , String model , String codeProduct , String insurance ,
                      String origin , String description , String trademark , String boxInclude ,
                      String screenTechnology , String resolution , Float screenSize , String touchScreen ,
                      String touchGlass , String cameraBehind , String videoQuality , String flash ,
                      String photograpthAdvanced , Integer cameraBefore , String film , String videoCall ,
                      String anotherInformation , String operatingSystem , String cpu , Integer coreNumber ,
                      Float maximumSpeed , Integer ram , Integer rom , String bandwidth2G ,
                      String bandwidth3G , String bandwidth4G , String simTray , String wireless ,
                      String gps , String bluetooth , String nft , String chargePort , String otherConnection ,
                      String design , String material , Integer capacityBattery , String specialFeatures ,
                      String watchVideo , String listenMusic , String otherFeatures , CategoryTelephone categoryTelephone) {
        super(id , name , model , codeProduct , insurance , origin , description , trademark);
        this.boxInclude = boxInclude;
        this.screenTechnology = screenTechnology;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.touchScreen = touchScreen;
        this.touchGlass = touchGlass;
        this.cameraBehind = cameraBehind;
        this.videoQuality = videoQuality;
        this.flash = flash;
        this.photograpthAdvanced = photograpthAdvanced;
        this.cameraBefore = cameraBefore;
        this.film = film;
        this.videoCall = videoCall;
        this.anotherInformation = anotherInformation;
        this.operatingSystem = operatingSystem;
        this.cpu = cpu;
        this.coreNumber = coreNumber;
        this.maximumSpeed = maximumSpeed;
        this.ram = ram;
        this.rom = rom;
        this.bandwidth2G = bandwidth2G;
        this.bandwidth3G = bandwidth3G;
        this.bandwidth4G = bandwidth4G;
        this.simTray = simTray;
        this.wireless = wireless;
        this.gps = gps;
        this.bluetooth = bluetooth;
        this.nft = nft;
        this.chargePort = chargePort;
        this.otherConnection = otherConnection;
        this.design = design;
        this.material = material;
        this.capacityBattery = capacityBattery;
        this.specialFeatures = specialFeatures;
        this.watchVideo = watchVideo;
        this.listenMusic = listenMusic;
        this.otherFeatures = otherFeatures;
        this.categoryTelephone = categoryTelephone;
    }

    public String getBoxInclude () {
        return boxInclude;
    }

    public void setBoxInclude (String boxInclude) {
        this.boxInclude = boxInclude;
    }

    public String getScreenTechnology () {
        return screenTechnology;
    }

    public void setScreenTechnology (String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public String getResolution () {
        return resolution;
    }

    public void setResolution (String resolution) {
        this.resolution = resolution;
    }

    public Float getScreenSize () {
        return screenSize;
    }

    public void setScreenSize (Float screenSize) {
        this.screenSize = screenSize;
    }

    public String getTouchScreen () {
        return touchScreen;
    }

    public void setTouchScreen (String touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getTouchGlass () {
        return touchGlass;
    }

    public void setTouchGlass (String touchGlass) {
        this.touchGlass = touchGlass;
    }

    public String getCameraBehind () {
        return cameraBehind;
    }

    public void setCameraBehind (String cameraBehind) {
        this.cameraBehind = cameraBehind;
    }

    public String getVideoQuality () {
        return videoQuality;
    }

    public void setVideoQuality (String videoQuality) {
        this.videoQuality = videoQuality;
    }

    public String getFlash () {
        return flash;
    }

    public void setFlash (String flash) {
        this.flash = flash;
    }

    public String getPhotograpthAdvanced () {
        return photograpthAdvanced;
    }

    public void setPhotograpthAdvanced (String photograpthAdvanced) {
        this.photograpthAdvanced = photograpthAdvanced;
    }

    public Integer getCameraBefore () {
        return cameraBefore;
    }

    public void setCameraBefore (Integer cameraBefore) {
        this.cameraBefore = cameraBefore;
    }

    public String getFilm () {
        return film;
    }

    public void setFilm (String film) {
        this.film = film;
    }

    public String getVideoCall () {
        return videoCall;
    }

    public void setVideoCall (String videoCall) {
        this.videoCall = videoCall;
    }

    public String getAnotherInformation () {
        return anotherInformation;
    }

    public void setAnotherInformation (String anotherInformation) {
        this.anotherInformation = anotherInformation;
    }

    public String getOperatingSystem () {
        return operatingSystem;
    }

    public void setOperatingSystem (String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getCpu () {
        return cpu;
    }

    public void setCpu (String cpu) {
        this.cpu = cpu;
    }

    public Integer getCoreNumber () {
        return coreNumber;
    }

    public void setCoreNumber (Integer coreNumber) {
        this.coreNumber = coreNumber;
    }

    public Float getMaximumSpeed () {
        return maximumSpeed;
    }

    public void setMaximumSpeed (Float maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public Integer getRam () {
        return ram;
    }

    public void setRam (Integer ram) {
        this.ram = ram;
    }

    public Integer getRom () {
        return rom;
    }

    public void setRom (Integer rom) {
        this.rom = rom;
    }

    public String getBandwidth2G () {
        return bandwidth2G;
    }

    public void setBandwidth2G (String bandwidth2G) {
        this.bandwidth2G = bandwidth2G;
    }

    public String getBandwidth3G () {
        return bandwidth3G;
    }

    public void setBandwidth3G (String bandwidth3G) {
        this.bandwidth3G = bandwidth3G;
    }

    public String getBandwidth4G () {
        return bandwidth4G;
    }

    public void setBandwidth4G (String bandwidth4G) {
        this.bandwidth4G = bandwidth4G;
    }

    public String getSimTray () {
        return simTray;
    }

    public void setSimTray (String simTray) {
        this.simTray = simTray;
    }

    public String getWireless () {
        return wireless;
    }

    public void setWireless (String wireless) {
        this.wireless = wireless;
    }

    public String getGps () {
        return gps;
    }

    public void setGps (String gps) {
        this.gps = gps;
    }

    public String getBluetooth () {
        return bluetooth;
    }

    public void setBluetooth (String bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getNft () {
        return nft;
    }

    public void setNft (String nft) {
        this.nft = nft;
    }

    public String getChargePort () {
        return chargePort;
    }

    public void setChargePort (String chargePort) {
        this.chargePort = chargePort;
    }

    public String getOtherConnection () {
        return otherConnection;
    }

    public void setOtherConnection (String otherConnection) {
        this.otherConnection = otherConnection;
    }

    public String getDesign () {
        return design;
    }

    public void setDesign (String design) {
        this.design = design;
    }

    public String getMaterial () {
        return material;
    }

    public void setMaterial (String material) {
        this.material = material;
    }

    public Integer getCapacityBattery () {
        return capacityBattery;
    }

    public void setCapacityBattery (Integer capacityBattery) {
        this.capacityBattery = capacityBattery;
    }

    public String getSpecialFeatures () {
        return specialFeatures;
    }

    public void setSpecialFeatures (String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public String getWatchVideo () {
        return watchVideo;
    }

    public void setWatchVideo (String watchVideo) {
        this.watchVideo = watchVideo;
    }

    public String getListenMusic () {
        return listenMusic;
    }

    public void setListenMusic (String listenMusic) {
        this.listenMusic = listenMusic;
    }

    public String getOtherFeatures () {
        return otherFeatures;
    }

    public void setOtherFeatures (String otherFeatures) {
        this.otherFeatures = otherFeatures;
    }

    public CategoryTelephone getCategoryTelephone () {
        return categoryTelephone;
    }

    public void setCategoryTelephone (CategoryTelephone categoryTelephone) {
        this.categoryTelephone = categoryTelephone;
    }
}
