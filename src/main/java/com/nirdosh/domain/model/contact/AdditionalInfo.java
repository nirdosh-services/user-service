package com.nirdosh.domain.model.contact;

import com.nirdosh.domain.model.room.RoomType;

public class AdditionalInfo {

    private boolean isRegistered;

    private String commingToAYM;

    private String reference;

    private boolean isComingToPilgrimage;

    private Integer team;

    private RoomType roomType;

    private boolean responsibleForRoom;


    public boolean isRegistered() {
        return isRegistered;
    }

    public void setRegistered(boolean isRegistered) {
        this.isRegistered = isRegistered;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean getIsComingToPilgrimage() {
        return isComingToPilgrimage;
    }

    public void setIsComingToPilgrimage(boolean isComingToPilgrimage) {
        this.isComingToPilgrimage = isComingToPilgrimage;
    }

    public Integer getTeam() {
        return team;
    }

    public void setTeam(Integer team) {
        this.team = team;
    }

    public boolean isResponsibleForRoom() {
        return responsibleForRoom;
    }

    public void setResponsibleForRoom(boolean responsibleForRoom) {
        this.responsibleForRoom = responsibleForRoom;
    }

    public String getCommingToAYM() {
        return commingToAYM;
    }

    public void setCommingToAYM(String commingToAYM) {
        this.commingToAYM = commingToAYM;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
}
