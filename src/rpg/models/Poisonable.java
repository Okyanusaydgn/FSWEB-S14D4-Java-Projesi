package rpg.models;

import rpg.utils.Constant;

public interface Poisonable {

    // default sayesinde tekrar güncelleme yapmamıza gerek kalmaz. var olan kodlara dokunmadan, yeni metodları eklemek mümkün olur.
    // interface ler önceden arayüz için kullanılıyordu. Şimdi içinde hem arayüz var hem de default değerler var
    default  double poison(){
         return Constant.POISON_PERCENTAGE;
     }

}
