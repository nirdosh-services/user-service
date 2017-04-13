package com.nirdosh.domain.model.user
import com.nirdosh.domain.model.contact._
import com.nirdosh.domain.model.ftp.FtpAccount
import com.nirdosh.domain.model.payment.PaymentInfo
import com.nirdosh.domain.model.transportation.Itinerary;
import java.io._
class User(var id:String,
             var name: Name,
             var bDate: java.util.Date,
             var gender: Gender,
             var contact: Contact,
             var addInfo: AdditionalInfo,
             var categories: java.util.List[Category],
             var ftpAccounts: java.util.List[FtpAccount],
             var itinerary: Itinerary,
             var paymentInfo: PaymentInfo
           ) extends Serializable{
}
