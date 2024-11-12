package GUI;

import javax.swing.JOptionPane;

public class DialogAlert {
    
    String campo = "";
    
    public DialogAlert(String campo){
        this.campo = campo;
    };
    
    public void showAlert(int resultCode){
        // 1. CONFIGURAR mensajes en pantalla.
        String message = "";
        int typeMessage = 0;
        
        switch (resultCode) {
            case 200:
                message = "Éxito al realizar la operación. (OK)";
                typeMessage = 0;
                break;
            case 202:
                message = "Éxito al crear: " + campo;
                typeMessage = 1;
                break;
            case 500:
                message = "Error al crear: " + campo;
                typeMessage = 2;
                break;
            default:
                break;
        }
        
        // 2. MOSTRAR los mensajes en pantalla.
        JOptionPane.showMessageDialog(null, message, campo, typeMessage);
    }
    
      public void showAlert(int resultCode, Exception err){
        // 1. CONFIGURAR mensajes en pantalla.
        String message = "";
        int typeMessage = 0;
        
        switch (resultCode) {
            case 200:
                message = "Éxito al realizar la operación. (OK)";
                typeMessage = 0;
                break;
            case 202:
                message = "Éxito al crear: " + campo;
                typeMessage = 1;
                break;
            case 500:
                message = "Error al crear: " + campo;
                typeMessage = 2;
                break;
            default:
                break;
        }
        
        message += "\n ERROR: " + err.getMessage();
        
        // 2. MOSTRAR los mensajes en pantalla.
        JOptionPane.showMessageDialog(null, message, campo, typeMessage);
    }
    
    public void genericDialog(String message, int type){
        JOptionPane.showMessageDialog(null, message, "Mensaje de " + campo.toUpperCase(), type);
    }
}
