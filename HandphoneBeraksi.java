package hp;

public class HandphoneBeraksi {
    public static void main (String args[]){
        Handphone handphone = new Handphone();
        handphone.hidupkan();
        handphone.lakukanPanggilan();
        handphone.kirimSMS();
        handphone.matikan();
    }
}
