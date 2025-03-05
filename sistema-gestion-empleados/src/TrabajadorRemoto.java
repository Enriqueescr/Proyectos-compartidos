public interface TrabajadorRemoto  {

    static void conectarseRemotamente() {
        boolean tieneInternet = true;

        if (tieneInternet == true ) {
            System.out.println("Se encuentra conectado remotamente");
        }else{
            System.out.println("ConexionException");

        }
            

    }


}
