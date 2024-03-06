package store;

import store.models.Bread;
import store.models.Chocolate;
import store.models.Coke;
import store.models.ProductForSale;

// abstract -- > abstract method a göre içeride bir tane abstract method var ise kesinlikle onu override etmelisiniz.
// Kesinlikle içini doldurup override etmen lazım.
// abstract aslında kuralları belirleyen bir yapı ama kendi kendine instance oluşturamıyor
//inheritance da bildiğiniz üzere extend ettiğimiz parent yapısını new oluşturabiliyoruz.
// ayrıca inheritance da override etmesek bile oluyor.
// Ama abstract class da böyle bir şey yok yani kullanıldığı child içinde zorunlu tutulan yapılar var.
//Bir sınıfı veya yöntemi abstract olarak işaretlediğinizde, onu tam olarak uygulamazsınız; bunun yerine, alt sınıfların veya türetilmiş sınıfların bu soyut sınıfı veya yöntemi genişletmesi veya uygulaması gerekir.
// Java'da, bir sınıf bir arayüzü veya soyut bir sınıfı uygulamak  için implementasyon kullanılır.

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[4]; // abstract class ı içeren bir array i new yapıyoruz. Biz burada abstract yapsını new yapmıyoruz. Array ini new liyoruz.
        products[0] = new Chocolate("sweet",13.4,"ch object","white",true);
        products[1] = new Bread("Bakery",5,"br test","einkorn","brown");
        products[2] = new Coke("Drinks",15,"ck test",true,2.5);
        listProducts(products);
        // yukarıda array in her bir elemanı abstract.
        // "Eğer biz burada ProductForSale productForSale = new " diye yazarsak çalışmaz çünkü ne demiştik...? abstract da new oluşturamıyoruz onun yerine oluşturduğumuz alt sınıfları kullanabiliyoruz.
    }


    public static void listProducts(ProductForSale[] products){
        for (ProductForSale product : products) {
            if(product != null){
                product.showDetails();
            }
        }
    }


}
// interface in abstracdan farkı interface de implementasyon olmaz tamamen arayüzdür. İnterface in kullanım amacı kodun standartlaşması için kullanılır.
// Kodun daha okunur hale gelmesi için.
//Object oriented tamamen düzen işidir diyebiliriz. Yani amaç kodumuzun daha okunabilir hale getirmeye çalışıyoruz.
