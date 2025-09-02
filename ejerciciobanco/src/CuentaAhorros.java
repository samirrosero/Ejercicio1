public class CuentaAhorros {
    protected boolean activa;
    public CuentaAhorros (float saldo, float tasa){
        super(saldo, tasa);
        this.activa =saldo => 1000;
    }


}
