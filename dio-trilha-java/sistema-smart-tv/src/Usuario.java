public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(22);
        System.out.println("Volume atual: " + smartTv.volume);
        

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);
    }
}
