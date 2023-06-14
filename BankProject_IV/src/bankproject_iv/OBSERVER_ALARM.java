package bankproject_iv;

import java.util.ArrayList;

public class OBSERVER_ALARM implements INTERFACE_SUBJECT{
    
    private static ArrayList<INTERFACE_UPDATE> observadores = new ArrayList<INTERFACE_UPDATE>();

    @Override
    public void attach(INTERFACE_UPDATE observador) {
        
        observadores.add(observador);
        
    }


    @Override
    public void dettach(INTERFACE_UPDATE observador) {
        
        observadores.remove(observador);
    }

    @Override
    public void notificacionObservadores() {
        for (int i=0; i <observadores.size(); i++){
            observadores.get(i).update();
        }
    }
    
    
    
}
