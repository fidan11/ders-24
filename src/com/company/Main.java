package com.company;

import com.company.car.BMW;
import javafx.collections.transformation.SortedList;

import java.util.*;

public class Main {

    public static void main(String[] args)  {
//        (ders-24,1:15)-Comparable
//        Comparable olduqda ayrica sort etmeye ehtiyyacimiz olmur.
//        BMW classini goturub implements Comparable<BMW> deyirik.
//        Biz obyekti comparable edirik deye bu o demek deyil o mutleq sort olmalidir,
//        biz obyekti comparable edirik,eger istifade etmis oldugumuz collection sorted collectiondursa
//        o goturecek bizim obyektlerimizi istifade edecek ve onlari sort edecek.Meselen,TreeSet istifade
//        etdikde bizim obyektimiz comparable our amma digerlerinde yox.Meselen comparable edib Hashset istifade
//        etsek o demek deyil ki,o compare olunacaq,cunki biz ozumuz compareTo-nu cagirmiriq,amma TreeSet cagirir.

        BMW bmw1 = new BMW();
        bmw1.setGasUsage(100);
        BMW bmw2 = new BMW();
        bmw2.setGasUsage(50);
        BMW bmw3 = new BMW();
        bmw3.setGasUsage(60);
        BMW bmw4 = new BMW();
        bmw4.setGasUsage(20);

        LinkedList<BMW> list = new LinkedList<>();
        list.add(bmw1);
        list.add(bmw2);
        list.add(bmw3);
        list.add(bmw4);

        Collections.sort(list);//bele yazdiqda sort edecek
        System.out.println(list);


//        _________________________
//        (ders-24,1:10-cu deqiqe)-"Comparator və Comparable interfacei
//
//        BMW bmw1 = new BMW();
//        bmw1.setGasUsage(100);
//        BMW bmw2 = new BMW();
//        bmw2.setGasUsage(50);
//        BMW bmw3 = new BMW();
//        bmw3.setGasUsage(60);
//        BMW bmw4 = new BMW();
//        bmw4.setGasUsage(20);
//
//        LinkedList<BMW> list = new LinkedList<>();
//        list.add(bmw1);
//        list.add(bmw2);
//        list.add(bmw3);
//        list.add(bmw4);
//
//        Comparator comparator = new Comparator<BMW>() {
//            @Override
//            public int compare(BMW o1, BMW o2) {
//                if (o1.getGasUsage() == o2.getGasUsage()) return 0;
//                if (o1.getGasUsage() > o2.getGasUsage()) {//1 ve -1 sherti olan bir sheydir,
////                shert odenirse musbet qaytar odenmirse menfi.
//                    return 1;
//                }
//                return -1;
//            }
//        };//classlari sort edir,yeni siralayir,neye esasen siralayir?iceride comperator deye bir obyekt duzeldirik.
////        Yaziriq list.sort(new Comparator<>()).
////        Comperator class yox interface oldugu ucun yaradan kimi anonim obyekt yaradir.
//        list.sort(comparator);//bu deyir sene iki obyekt gonderecem neye esasen istesen compare ele
//        System.out.println(list);
    }


//        _________________
//        (ders-24,1:06-cu deqeqe)-"Collection interface-i ilə İmplementation arasında Abstract class
//        niyə istifadə olunub? Skelatal desing pattern"

//       LinkedList gotutur AbstractSequentialListi extend edir ve AbstractSequantialList ise AbstractListi extend edir.
//       Sual yaranir ki,niye gore bu AbstractListi extend edir?
//       AbstractListde baxsaq hazir add,imdexof,lastindefOf methodlari var. Qisaca List ele methodlari ishleyib ki,
//        istenilen list bir abstractListden extend edir,ve abstractlistin icinde ele metodlar yazilib ki,
//        o methodlar butun listlere lazimdir(ArrayList,LinkedList). Buna Skelatal design pattern deyirler.
//        Bu bidene chooseProduct deye bir method duzeldir ve process concrete methodu duzeldir, process concrete
//methodu abstract olan chooseproductui cagirir onun ne ish goreceyini bilir amma nece ish goreceyini bilmir.
//startin stopun concret methodlarin ne ish goreceyini bilir.     Chooseproducti hevale edir bu classi extend edecek
//shexse.         Buradada eyni temadir fikir versek linkedlistin add-i ferqli ishleyir,vektorun add-i ferqli ishleyir,
//        amma onlar add methodlarini ozleri override edirler.LastindexOf methodu eyni ishleyir,indexOf eyni ishleyir,
//        bunlar override olunmur,buna deyirler Skelatal pattern,yeni bir bir classin bir obyektin skeletini cixardirsan
//        sonra onun bezi yerlerini doldurmag lazimdirsa doldurursan. Onu dolduran shexslerde ya LinkedListdir
//        ya vectordur ve s.
//        BMW bmw1 = new BMW();
//        BMW bmw2 = new BMW();
//        BMW bmw3 = new BMW();
//        BMW bmw4 = new BMW();
//
////        bmw1.next = bmw2;
////        bmw2.previous = bmw1;
////        bmw2.next = bmw3;
////        bmw3.previous = bmw2;
////        bmw3.next = bmw4;
////        bmw4.previous = bmw3;
//
//        LinkedList<BMW> list = new LinkedList<>();
//        list.add(bmw1);
//        list.add(bmw2);
//        list.add(bmw3);
//        list.add(bmw4);
//        _______________
//        (ders-24,50-ci deqiqe)-linkedList
//        linkedList ArrayListi istifade etmir.

//        BMW bmw1 = new BMW();
//        BMW bmw2 = new BMW();
//        BMW bmw3 = new BMW();
//        BMW bmw4 = new BMW();
//
////        bmw1.next = bmw2;
////        bmw2.previous = bmw1;
////        bmw2.next = bmw3;
////        bmw3.previous = bmw2;
////        bmw3.next = bmw4;
////        bmw4.previous = bmw3;
//
////        Bunlardan hansisa birini gotursek ferq etmez bmw1 ve s,bu obyektler bir biri ile zencirvali elaqelendirilibler,
////        bir birilerine link olublar,yeni link olunmush bir list aliblar adinida qoyublar LinkedList.
//
//        LinkedList<BMW> list = new LinkedList<>();
//        list.add(bmw1);
//        list.add(bmw2);
//        list.add(bmw3);
//        list.add(bmw4);

//        LinkedList classi iceride node deye bir class duzeldib,neceki biz BMW-de nextleri previouslari bir birine
//        qosurdug LinkedListde iceride node-lari bir birine qoshur(last,first,next).Eger deyir lastim nulldursa
//        first-uma teze duzeltdiyim nodumu at,yeni axrincim yoxdursa demeli bu menim birincimdir,birincime at,
//        first-a new nodu atir.
//        Ikinci adda last artig null deyil,teze node yaradiriq ikinci elementi elave etmek ucun, yeni ikinci node
//        bizim lastimiz olur, axrincinin nextine teze yaratdigi node verir.
//        Nodun icinde item deye bir shey yaradir ve BMW-ni atir onun ichine.

//        _______________
//        (ders-24,47-ci deqiqe)-vector
//        ArrayList ile vector eyni sheydir sadece thread safe sohbeti var.
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("saslfkg");//10
//        list.add("asffs");//15
//
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        list2.add(1);
//        list2.add(2);
//
//        int newCapacity = 20 + (20 >> 1);
//        System.out.println(newCapacity);
//
//        Vector<String>vektor = new Vector<>();
//        vektor.add("asfas");//eyni temadir sadece bu syncronizeddir
////        Her defe massivin uzunlugu qeder ozunu artirir yarisi qeder yox. Kohne texnologiyadir istifade olunmur.
////        Nece ede bilerik arrayListde syncronized thread safe olsun?
//
//        List threadSafeList = Collections.synchronizedList(list);//yuxaridaki listi syncronized formatinda verecek
//
//
//
//        ________________
//        "Collection Api, Umumi arxitektura, Collection interface-i,
//        List interface-i, ArrayList, LinkedList, Vector

//Bir eded array fikirlesek ve bu arrayin icine nese atmaq isteyirik, bu arrayin 3 dene elementi var, ve bu elementler
//        dolduqdan sonra 4-cu elementi elave ede bilmirik,cunki array genishlene bilen bir anlayish deyil.
//        Bunun ucun ne edirik? Bunun ucun yeni bir array yaradiriq uzunlugu olur 4, kohne arrayi teze arraye
//kopyaliyiriq ve 4-cu elemente istediyimiz elementi elave ede bilirik,belelikle array sanki genislenmish kimi olur,
//amma eslinde genishlenmir yeni bir array yaranir,5-ci element elave etmek ucun yene yeni array yaratmali olacagiq.
//Indi biz bunu optimallashdirmaliyiq ki,her defe yeni array yaradilmasin,cunki her defe yaradilmaq demek performansa,
//        yaddasha tesir edir.

//        ArrayList<String> list = new ArrayList<String>();//yazsaqda yazmasaqda solda String yazmishiqsa sagdada String oturur
////        String verdiyimiz ucun ArrayListin icindeki <E> nin yerine String oturur ve ashagida harda <E> gorurukse
////onlarin yerine String oturur. Icinde olan get methodu bele geriye String qaytaracaq,int verse idik int qaytaracaqdi.
////        Indi burada sol teref Listdi interfeysdi sag teref ise classdi, polimorfizmin qaydasina gire biz Arraylist
////        implement etdiyine gore Listi bunu cast ede bilirik liste,bunu yazmasaqda avtomatik bash verir.
////        (List)new ArrayList<String>();
////        Burada esas tema odur ki,ArrayList imolement edir Liste ve Arraylistin logikasi odur ki, iceride bir massiv
////        saxlayib, object massivi saxlayir ve ilk defe massiv yarananda bosh bir massiv yaranir. Ve her defe add edirik:
//        list.add("saslfkg");//add size ilk defe 0 olur bir vahid artirir,daha sonra calculatecapacity deyir.
////        Default_capacity 10 verir, ve vermek istediyimiz say ile 10 muqaise edir, daha sonra 10-dan cixir element.length
////        eger sifirdan boyukdurse grow-a girir bu ise kohne massivi teze massive menimsedir ve alinan neticenide
////        elementDataya menimsedir,yeni her defe yeni obyekt yaradir,amma optimallashdiraraq.
////Adam ilk defe element elave edirse massivin uzunlgunu 10 vahid artirir ki,menden novbeti 9 defede yeni bir massiv istemeyesen,
////ikinci elementi elave etdikde size bu defe 11 olacaq,yeni minCapacity 11 olacaq.
////        Yeni her defe arrayin uzunlugunun yarisi qeder artirir.
////        shift right >>1 ikiye bolmek demekdir. ArrayList bu qaydaa ishleyir
//        int newCapacity = 20 + (20 >> 1);
//        System.out.println(newCapacity);
//
//        ArrayList<Integer> list2 = new ArrayList<Integer>();
//        list2.add(1);
//        list2.add(2);
////        ArrayList List-den implement edib List ise Collection interface-cinden extend edib.
////Collection ise extend edib Iterable.
////        Collectiondan toreyen ferqli interfacelerin ishi datalari bir yere toplamaqdir.
}



