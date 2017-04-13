package com.nirdosh.domain.model.contact

import com.nirdosh.domain.model.room.RoomType

class AdditionalInfo(
                    var isRegistered:Boolean,
                    var comingToAym:String,
                    var reference:String,
                    var isComingToPilgrimage: Boolean,
                    var team: Integer,
                    var roomType: RoomType,
                    var isResponsibleForRoom:Boolean,
                    var isComingFirstTime:Boolean,
                    var isComingOnHisOwn: Boolean
                    ) {

}
