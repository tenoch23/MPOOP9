public class Cuenta
{
  private double saldo;
  int i=1;
  public Cuenta()
  {
    saldo=0;
  }

  public void Depositar(double monto)throws TopeIngresoException
  {
    System.out.println("Depositando...");
    if(monto>=20000)
      throw new TopeIngresoException();
    else
      saldo+=monto;
  }

  public void Retirar(double monto) throws SaldoInsuficienteException, MaximoRetirosException
  {
    if(i<=3)
    {
      System.out.println("Retirando..."+monto);
      if(saldo<monto)
        throw new SaldoInsuficienteException();
      else
      {
        saldo-=monto;
        i++;
      }
    }
    else
    {
      throw new MaximoRetirosException();
    }
  }

  public double consultaSaldo()
  {
    System.out.println("Tu saldo es:"+saldo);
    return saldo;
  }


}