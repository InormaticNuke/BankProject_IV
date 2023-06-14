package bankproject_iv;

public interface INTERFACE_SUBJECT {
    
    public void attach(INTERFACE_UPDATE observador);
    public void dettach(INTERFACE_UPDATE observador);
    public void notificacionObservadores();
    
}
