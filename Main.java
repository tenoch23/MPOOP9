public class Main
{
  public static void main(String[] args) {
    System.out.println("########Exception########"); 
    try
    {
      String mensajes[] = {"uno", "dos", "tres"};
      int i;
      for( i=0; i<=3; i++)
        System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error: "+e);
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("Esta linea está cool");


    System.out.println("########Exception Anidada########");
    
    try
    {
      Integer denominador = null;
      float equis = 5/denominador;
      System.out.println(equis);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error: "+e.getMessage());
    }
    catch(ArithmeticException e)
    {
      System.out.println("Error: "+e.getMessage());
    }
    catch(Exception e)
    {
      System.out.println("Error: "+e.getMessage());
    }


    System.out.println("########Propagación de Exception########");

    try
    {
      imprimirArreglo();
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("Error -> "+e.getMessage());
    }finally{
      System.out.println("Cualquier cosa que suceda entra en el finally");
    }


    System.out.println("########Creación de Exception########");

    Cuenta cuenta = new Cuenta();
    try
    {
      cuenta.Depositar(2000);
      cuenta.Retirar(100);
      cuenta.consultaSaldo();
      cuenta.Retirar(200);
      cuenta.consultaSaldo();
      cuenta.Retirar(300);
      cuenta.consultaSaldo();
      cuenta.Retirar(400);
    }
    catch(SaldoInsuficienteException e)
    {
      System.out.println("Error: "+e.getMessage());
      ofrecerTarjetaCredito();
    }
    catch(TopeIngresoException e)
    {
      System.out.println("Error: "+e.getMessage());
    }
    catch(MaximoRetirosException e)
    {
      System.out.println("Error: "+e.getMessage());
    }




  }
  


  public static void imprimirArreglo() throws ArrayIndexOutOfBoundsException
  {
    String mensajes[] = {"uno", "dos", "tres"};
    int i;
    for( i=0; i<=3; i++)
      System.out.println(mensajes[i]);
  }


  public static void ofrecerTarjetaCredito()
  {
    System.out.println("Te interesa obtener una tarjeta de credito");
  }
}