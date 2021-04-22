package UTS;

class Nomor4 {
    void nilai (int nilai){
        if (nilai>=80){
            System.out.println("Nilai anda "+nilai+" =  A" );
        }
        else if (nilai<=79 && nilai>=60){
            System.out.println("Nilai anda "+nilai+" =  B" );
        }
        else if (nilai<=59 && nilai>=40){
            System.out.println("Nilai anda "+nilai+" =  C" );
        }
        else{
            System.out.println("Ulangi semester depan");
        }
    }
}
