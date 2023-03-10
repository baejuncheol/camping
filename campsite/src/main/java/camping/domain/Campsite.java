package camping.domain;

import camping.domain.CampsiteRegistered;
import camping.domain.CampsiteModified;
import camping.domain.CampsiteReserved;
import camping.domain.CampsiteCancelled;
import camping.domain.CampsiteDeleted;
import camping.CampsiteApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Campsite_table")
@Data

public class Campsite  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long campsiteId;
    
    
    
    
    
    private String campsiteStatus;
    
    
    
    
    
    private String campsiteDescription;
    
    
    
    
    
    private String location;
    
    
    
    
    
    private String description;

    @PostPersist
    public void onPostPersist(){


        CampsiteRegistered campsiteRegistered = new CampsiteRegistered(this);
        campsiteRegistered.publishAfterCommit();

    }
    @PostUpdate
    public void onPostUpdate(){


        CampsiteModified campsiteModified = new CampsiteModified(this);
        campsiteModified.publishAfterCommit();



        CampsiteReserved campsiteReserved = new CampsiteReserved(this);
        campsiteReserved.publishAfterCommit();



        CampsiteCancelled campsiteCancelled = new CampsiteCancelled(this);
        campsiteCancelled.publishAfterCommit();

    }
    @PostRemove
    public void onPostRemove(){


        CampsiteDeleted campsiteDeleted = new CampsiteDeleted(this);
        campsiteDeleted.publishAfterCommit();

    }
    @PreRemove
    public void onPreRemove(){
    }

    public static CampsiteRepository repository(){
        CampsiteRepository campsiteRepository = CampsiteApplication.applicationContext.getBean(CampsiteRepository.class);
        return campsiteRepository;
    }




    public static void confirmReservation(ReservationConfirmed reservationConfirmed){

        /** Example 1:  new item 
        Campsite campsite = new Campsite();
        repository().save(campsite);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservationConfirmed.get???()).ifPresent(campsite->{
            
            campsite // do something
            repository().save(campsite);


         });
        */

        
    }
    public static void cancelReservation(ReservationCancelled reservationCancelled){

        /** Example 1:  new item 
        Campsite campsite = new Campsite();
        repository().save(campsite);

        */

        /** Example 2:  finding and process
        
        repository().findById(reservationCancelled.get???()).ifPresent(campsite->{
            
            campsite // do something
            repository().save(campsite);


         });
        */

        
    }


}
