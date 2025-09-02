public class Cuenta {
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionesMensuales = 0;

    //costructor
    public Cuenta (float saldo, float tasaAnual){
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public int getNumeroConsignaciones(){
        return numeroConsignaciones;
    }
    public void setNumeroConsignaciones(int numeroConsignaciones){
        this.numeroConsignaciones = numeroConsignaciones;
    }
    public int getNumeroRetiros(){
        return numeroRetiros;
    }
    public void setNumeroRetiros(int numeroRetiros){
        this.numeroRetiros = numeroRetiros;
 
    }
    public float getTasaAnual(){
        return tasaAnual;
    }
    public void setTasaAnual(float tasaAnual){
        this.tasaAnual = tasaAnual;
    }
    public float getComisionesMensuales(){
        return comisionesMensuales;
    }
    public void setComisionesMensuales(float comisionesMensuales){
        this.comisionesMensuales = comisionesMensuales;
    }

    public void consignar(float cantidad){
        saldo = saldo + cantidad;
        numeroConsignaciones = numeroConsignaciones + 1;
    }

    public void retirar(float cantidad){
        float nuevoSaldo = saldo - cantidad;

        if (nuevoSaldo >= 0) {
            saldo = nuevoSaldo;
            numeroRetiros = numeroRetiros + 1;
        } else {
            System.out.println("La cantidad a retirar excede el saldo actual"); 
        }
    }
    public void calcularInteres(){
        float tasaMensual = tasaAnual / 12;
        float interesMensual = saldo * tasaMensual;
        saldo = saldo + interesMensual;
    }

    public void extractoMensual(){
        saldo = saldo - comisionesMensuales;
        calcularInteres();
    }

    public void imprimir(){
        System.out.println("saldo: " + saldo);
        System.out.println("numero de consignaciones: " + numeroConsignaciones);
        System.out.println("numero de retiros: " + numeroRetiros);
        System.out.println("tasa anual: " + tasaAnual);
        System.out.println("comision mensual: " + comisionesMensuales);
    }


}
